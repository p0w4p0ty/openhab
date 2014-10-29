package org.openhab.binding.xbmc.rpc.api.method.videoLibrary;

import org.openhab.binding.xbmc.rpc.api.method.Method;
import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getMovies.Parameters;

/**
 * VideoLibrary.GetMovies - http://kodi.wiki/view/JSON-RPC_API/v6#VideoLibrary.GetMovies
 * Retrieve all movies
 * Permissions:
 * 	- ReadData
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class GetMoviesRequest extends Method {

	private final static String _method = "VideoLibrary.GetMovies";
	private Parameters _params = new Parameters();
	
	/**
	 * VideoLibrary.GetEpisodes
	 */
	public GetMoviesRequest() {
		super();
	}

	/**
	 * @param params
	 */
	public GetMoviesRequest(Parameters params) {
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
