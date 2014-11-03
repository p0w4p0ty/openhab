package org.openhab.binding.xbmc.rpc.api.method.player;

import org.openhab.binding.xbmc.rpc.api.method.Method;

/**
 * Player.SetSubtitle Response - http://kodi.wiki/view/JSON-RPC_API/v6#Player.SetSubtitle
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class SetSubtitleResponse extends Method {

private String _result;
	
	/**
	 * Player.SetSubtitle Response
	 */
	public SetSubtitleResponse() {
		super();
	}

	/**
	 * Player.SetSubtitle Response
	 * 
	 * @param _result
	 */
	public SetSubtitleResponse(String result) {
		super();
		this._result = result;
	}

	/**
	 * @return the _result
	 */
	public String getResult() {
		return _result;
	}

	/**
	 * @param _result the _result to set
	 */
	public void setResult(String result) {
		this._result = result;
	}
	
}
