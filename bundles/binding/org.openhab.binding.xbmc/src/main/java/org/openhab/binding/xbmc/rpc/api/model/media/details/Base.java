package org.openhab.binding.xbmc.rpc.api.model.media.details;

/**
 * Media.Details.Base - http://kodi.wiki/view/JSON-RPC_API/v6#Media.Details.Base
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class Base extends org.openhab.binding.xbmc.rpc.api.model.item.details.Base {

	private String fanart;
	private String thumbnail;
	
	/**
	 * @param label
	 * @param fanart
	 * @param thumbnail
	 */
	public Base(String label, String fanart, String thumbnail) {
		super(label);
		this.fanart = fanart;
		this.thumbnail = thumbnail;
	}

	/**
	 * @param label
	 */
	public Base() {
		super();
	}

	/**
	 * @return the fanart
	 */
	public String getFanart() {
		return fanart;
	}

	/**
	 * @param fanart the fanart to set
	 */
	public void setFanart(String fanart) {
		this.fanart = fanart;
	}

	/**
	 * @return the thumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * @param thumbnail the thumbnail to set
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
