package org.openhab.binding.xbmc.rpc.calls.videoLibrary;

import java.util.ArrayList;
import java.util.List;

import org.openhab.binding.xbmc.rpc.JsonRPCCcall;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.GetEpisodesRequest;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.GetEpisodesResponse;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getEpisodes.Result;
import org.openhab.binding.xbmc.rpc.api.model.video.details.Episode;

import com.ning.http.client.AsyncHttpClient;


/**
 * Search for Episodes.
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class GetEpisodes extends JsonRPCCcall {

	protected GetEpisodesRequest _request = new GetEpisodesRequest();
	protected Result _result;
	
	public GetEpisodes(AsyncHttpClient client, String uri) {
		super(client, uri);
	}

	
	@Override
	protected String getJsonRequest() {	
		return writeJson(_request);
	}

	@Override
	protected void processResponse(String response) {
		Object oResponse = readJsonResult(response);
		if (oResponse != null && oResponse instanceof GetEpisodesResponse)
			_result = ((GetEpisodesResponse) oResponse).getResult();
	}

	@Override
	protected Class<?> getResponseClass() {
		return GetEpisodesResponse.class;
	}		
	
	/**
	 * @return All episodes
	 */
	public List<Episode> getAll(){
		ArrayList<Episode> episodes = new ArrayList<Episode>();
		if (_result != null && _result.getEpisodes() != null && _result.getEpisodes().size() > 0){
			episodes = _result.getEpisodes();
		}
		return episodes;
	}
	
	/**
	 * @return the _request
	 */
	public GetEpisodesRequest getRequest() {
		return _request;
	}

	/**
	 * @param _request the _request to set
	 */
	public void setRequest(GetEpisodesRequest request) {
		this._request = request;
	}

	/**
	 * @return the _result
	 */
	public Result getResult() {
		return _result;
	}

}
