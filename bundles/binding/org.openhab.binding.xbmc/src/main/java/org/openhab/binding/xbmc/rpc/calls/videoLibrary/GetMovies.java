package org.openhab.binding.xbmc.rpc.calls.videoLibrary;

import java.util.ArrayList;
import java.util.List;

import org.openhab.binding.xbmc.rpc.JsonRPCCcall;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.GetMoviesRequest;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.GetMoviesResponse;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getMovies.Result;
import org.openhab.binding.xbmc.rpc.api.model.video.details.Movie;

import com.ning.http.client.AsyncHttpClient;


/**
 * Search for Movies.
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class GetMovies extends JsonRPCCcall {

	protected GetMoviesRequest _request = new GetMoviesRequest();
	protected Result _result;
	
	public GetMovies(AsyncHttpClient client, String uri) {
		super(client, uri);
	}

	
	@Override
	protected String getJsonRequest() {	
		return writeJson(_request);
	}

	@Override
	protected void processResponse(String response) {
		Object oResponse = readJsonResult(response);
		if (oResponse != null && oResponse instanceof GetMoviesResponse)
			_result = ((GetMoviesResponse) oResponse).getResult();
	}

	@Override
	protected Class<?> getResultClass() {
		return GetMoviesResponse.class;
	}	
	
	
	/**
	 * @return All movies
	 */
	public List<Movie> getAll(){
		ArrayList<Movie> episodes = new ArrayList<Movie>();
		if (_result != null && _result.getMovies() != null && _result.getMovies().size() > 0){
			episodes = _result.getMovies();
		}
		return episodes;
	}
	
	/**
	 * @return the _request
	 */
	public GetMoviesRequest getRequest() {
		return _request;
	}

	/**
	 * @param _request the _request to set
	 */
	public void setRequest(GetMoviesRequest request) {
		this._request = request;
	}

	/**
	 * @return the _result
	 */
	public Result getResult() {
		return _result;
	}

	/**
	 * @param _result the _result to set
	 */
	public void setResult(Result result) {
		this._result = result;
	}

}
