package org.openhab.binding.xbmc.rpc.calls.videoLibrary;

import org.openhab.binding.xbmc.rpc.JsonRPCCcall;
import org.openhab.binding.xbmc.rpc.api.method.player.SetSubtitleRequest;
import org.openhab.binding.xbmc.rpc.api.method.player.SetSubtitleResponse;
import org.openhab.binding.xbmc.rpc.api.method.player.setSubtitle.Parameters;
import org.openhab.binding.xbmc.rpc.api.method.player.setSubtitle.Parameters.subtitle;

import com.ning.http.client.AsyncHttpClient;

/**
 * Set subtitles - http://kodi.wiki/view/JSON-RPC_API/v6#Player.SetSubtitle
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 * 
 */
public class SetSubtitles extends JsonRPCCcall {

	protected SetSubtitleRequest _request = new SetSubtitleRequest();
	protected String _result;
	
	private subtitle _operation = subtitle.next;
	private int _playerid;
	private boolean _enable = true;
	
	public SetSubtitles(AsyncHttpClient client, String uri) {
		super(client, uri);
	}
	
	public SetSubtitles(AsyncHttpClient client, String uri, subtitle operation, int playerid) {
		super(client, uri);
		if (operation != null)
			this._operation = operation;
		this._playerid = playerid;
	}

	@Override
	protected String getJsonRequest() {
		_request.setParams(new Parameters(_playerid, _operation, _enable));
		return writeJson(_request);
	}

	@Override
	protected void processResponse(String response) {
		Object oResponse = readJsonResult(response);
		if (oResponse != null && oResponse instanceof SetSubtitleResponse)
			_result = ((SetSubtitleResponse) oResponse).getResult();
	}

	@Override
	protected Class<?> getResponseClass() {
		return SetSubtitleResponse.class;
	}

	/**
	 * @return the request
	 */
	public SetSubtitleRequest getRequest() {
		return _request;
	}

	/**
	 * @return the response
	 */
	public String getResult() {
		return _result;
	}

	/**
	 * @return the operation
	 */
	public subtitle getOperation() {
		return _operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(subtitle operation) {
		this._operation = operation;
	}

	/**
	 * @return the playerid
	 */
	public int getPlayerid() {
		return _playerid;
	}

	/**
	 * @param playerid the playerid to set
	 */
	public void setPlayerid(int playerid) {
		this._playerid = playerid;
	}

	/**
	 * @return the enable
	 */
	public boolean isEnable() {
		return _enable;
	}

	/**
	 * @param enable the enable to set
	 */
	public void setEnable(boolean enable) {
		this._enable = enable;
	}

}
