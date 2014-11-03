package org.openhab.binding.xbmc.rpc.api.method.videoLibrary;

import org.openhab.binding.xbmc.rpc.api.method.Method;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getEpisodes.Parameters;

/**
 * VideoLibrary.GetEpisodes - http://kodi.wiki/view/JSON-RPC_API/v6#VideoLibrary.GetEpisodes
 * Retrieve all tv show episodes
 * Permissions:
 * 	- ReadData
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class GetEpisodesRequest extends Method {

	private final static String _method = "VideoLibrary.GetEpisodes";
	private Parameters _params = new Parameters();
	
	/**
	 * VideoLibrary.GetEpisodes
	 */
	public GetEpisodesRequest() {
		super();
	}

	/**
	 * @param params
	 */
	public GetEpisodesRequest(Parameters params) {
		super();
		this._params = params;
	}

	/**
	 * @return the params
	 */
	public Parameters getParams() {
		return _params;
	}

	/**
	 * @param params the params to set
	 */
	public void setParams(Parameters params) {
		this._params = params;
	}

	/**
	 * @return the name
	 */
	public String getMethod() {
		return _method;
	}
	
}
