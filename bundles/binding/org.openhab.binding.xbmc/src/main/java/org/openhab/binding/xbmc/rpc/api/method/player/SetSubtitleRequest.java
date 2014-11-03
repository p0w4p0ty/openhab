package org.openhab.binding.xbmc.rpc.api.method.player;

import org.openhab.binding.xbmc.rpc.api.method.Method;
import org.openhab.binding.xbmc.rpc.api.method.player.setSubtitle.Parameters;

/**
 * Player.SetSubtitle - http://kodi.wiki/view/JSON-RPC_API/v6#Player.SetSubtitle
 * Set the subtitle displayed by the player
 * Permissions:
 * 	ControlPlayback
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class SetSubtitleRequest extends Method {

	private final static String _method = "Player.SetSubtitle";
	private Parameters _params = new Parameters();
	
	/**
	 * Player.SetSubtitle
	 */
	public SetSubtitleRequest() {
		super();
	}

	/**
	 * @param _params
	 */
	public SetSubtitleRequest(Parameters _params) {
		super();
		this._params = _params;
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
	 * @return the Method
	 */
	public String getMethod() {
		return _method;
	}
	
}
