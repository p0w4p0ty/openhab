package org.openhab.binding.xbmc.rpc.api.method.videoLibrary;

import org.openhab.binding.xbmc.rpc.api.method.Method;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getEpisodes.Result;

/**
 * VideoLibrary.GetEpisodes Response - http://kodi.wiki/view/JSON-RPC_API/v6#VideoLibrary.GetEpisodes
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class GetEpisodesResponse extends Method {

	private Result _result;
	
	/**
	 * VideoLibrary.GetEpisodes Response
	 */
	public GetEpisodesResponse() {
		super();
	}

	/**
	 * VideoLibrary.GetEpisodes Response
	 * 
	 * @param _result
	 */
	public GetEpisodesResponse(Result result) {
		super();
		this._result = result;
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
