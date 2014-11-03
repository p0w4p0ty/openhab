package org.openhab.binding.xbmc.rpc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ning.http.client.AsyncCompletionHandler;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.ListenableFuture;
import com.ning.http.client.Response;

public abstract class JsonRPCCcall {

	private static final Logger logger = LoggerFactory.getLogger(JsonRPCCcall.class);
	
	public class RpcException extends RuntimeException {
		private static final long serialVersionUID = 553643499122192425L;
		
		public RpcException(String message) {
			super(message);
		}

		public RpcException(String message, Exception e) {
			super(message, e);
		}
	}
	
	private final AsyncHttpClient _client;
	private final String _uri;
	
	protected final ObjectMapper _mapper = new ObjectMapper();
	
	public JsonRPCCcall(AsyncHttpClient client, String uri) {
		this._client = client;
		this._uri = uri;
		this._mapper.setSerializationInclusion(org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion.NON_NULL);
	}
	
	protected abstract String getJsonRequest();
	protected abstract void processResponse(String response);
	protected abstract Class<?> getResponseClass();
	
	public void execute() {
		// nothing to do on completion
		execute(null);
	}
	
	public void execute(Runnable completeHandler) {
		logger.debug("XBMC JsonRPCCall execute");
		try {
			// we fire this request off asynchronously and let the completeHandler
			// process any response as necessary (can be null)
			ListenableFuture<Response> future = _client.preparePost(_uri)
				.setBody(getJsonRequest())
				.setHeader("content-type", "application/json; charset=utf-8")
				.setHeader("accept", "application/json")
				.execute(new AsyncCompletionHandler<Response>() {
					@Override
					public Response onCompleted(Response response) throws Exception {
						logger.debug("XBMC json response: " + response.getResponseBody());
						Map<String, Object> json = readJson(response.getResponseBody());

						// if we get an error then throw an exception to stop the 
						// completion handler getting executed
						if (json.containsKey("error"))
							throw new RpcException(json.get("error").toString());
						
						processResponse(response.getResponseBody());
						return response;
					}

					@Override
					public void onThrowable(Throwable t) {
						logger.error("Error handling POST response from XBMC", t);
					}
				});
			
			// add the future listener to handle the response once this request completes
			if (completeHandler != null) {
				future.addListener(completeHandler, _client.getConfig().executorService());
			}
		} catch (Exception e) {
			logger.error("Failed sending POST request to XBMC", e);
		}
	}
	
	@SuppressWarnings("unchecked")
	protected Map<String, Object> readJson(String json) {
		if (json == null)
			return new HashMap<String, Object>();

		try {
			return _mapper.readValue(json, Map.class);
		} catch (JsonParseException e) {
			throw new RpcException("Failed to parse JSON", e);
		} catch (JsonMappingException e) {
			throw new RpcException("Failed to map JSON", e);
		} catch (IOException e) {
			throw new RpcException("Failed to read JSON", e);
		}
	}

	protected Object readJsonResult(String json) {
		if (json == null)
			return null;

		try {
			return _mapper.readValue(json, getResponseClass());
		} catch (JsonParseException e) {
			throw new RpcException("Failed to parse JSON", e);
		} catch (JsonMappingException e) {
			throw new RpcException("Failed to map JSON", e);
		} catch (IOException e) {
			throw new RpcException("Failed to read JSON", e);
		}
	}
	
	protected String writeJson(Map<String, Object> json) {
		try {
			return _mapper.writeValueAsString(json);
		} catch (JsonParseException e) {
			throw new RpcException("Failed to parse JSON", e);
		} catch (JsonMappingException e) {
			throw new RpcException("Failed to map JSON", e);
		} catch (IOException e) {
			throw new RpcException("Failed to write JSON", e);
		}
	}
	
	protected String writeJson(Object json) {
		try {
			String jsonString = _mapper.writeValueAsString(json);
			logger.debug("XBMC json: "+jsonString);
			return jsonString;
		} catch (JsonParseException e) {
			throw new RpcException("Failed to parse JSON", e);
		} catch (JsonMappingException e) {
			throw new RpcException("Failed to map JSON", e);
		} catch (IOException e) {
			throw new RpcException("Failed to write JSON", e);
		}
	}
}
