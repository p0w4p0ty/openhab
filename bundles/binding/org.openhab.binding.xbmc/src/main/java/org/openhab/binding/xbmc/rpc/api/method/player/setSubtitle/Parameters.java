package org.openhab.binding.xbmc.rpc.api.method.player.setSubtitle;

/**
 * Player.SetSubtitle parameters - http://kodi.wiki/view/JSON-RPC_API/v6#Player.SetSubtitle
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Parameters {

	private Integer _playerid;
	private subtitle _subtitle;
	private Boolean _enable = true;
	
	
	public enum subtitle {
		previous,
		next,
		off,
		on
	}
	
	/**
	 * Player.SetSubtitle parameters
	 */
	public Parameters() {
		super();
	}

	/**
	 * @param _playerid
	 * @param _subtitle
	 * @param _enable
	 */
	public Parameters(Integer playerid, subtitle subtitle, Boolean enable) {
		super();
		this._playerid = playerid;
		this._subtitle = subtitle;
		this._enable = enable;
	}

	/**
	 * Player.SetSubtitle parameters
	 * 
	 * @param playerid
	 * @param subtitle
	 */
	public Parameters(Integer playerid,subtitle subtitle) {
		super();
		this._playerid = playerid;
		this._subtitle = subtitle;
	}

	/**
	 * @return the playerid
	 */
	public Integer getPlayerid() {
		return _playerid;
	}

	/**
	 * @param playerid the playerid to set
	 */
	public void setPlayerid(Integer playerid) {
		this._playerid = playerid;
	}

	/**
	 * @return the subtitle
	 */
	public subtitle getSubtitle() {
		return _subtitle;
	}

	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(subtitle subtitle) {
		this._subtitle = subtitle;
	}

	/**
	 * @return the enable
	 */
	public Boolean getEnable() {
		return _enable;
	}

	/**
	 * @param enable the enable to set
	 */
	public void setEnable(Boolean enable) {
		this._enable = enable;
	}
	
}
