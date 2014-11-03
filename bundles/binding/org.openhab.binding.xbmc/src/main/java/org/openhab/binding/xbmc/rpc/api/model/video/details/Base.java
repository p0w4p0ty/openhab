package org.openhab.binding.xbmc.rpc.api.model.video.details;

import org.openhab.binding.xbmc.rpc.api.model.media.Artwork;

/**
 * Video.Details.Base - http://kodi.wiki/view/JSON-RPC_API/v6#Video.Details.Base
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Base extends org.openhab.binding.xbmc.rpc.api.model.media.details.Base {

	private Integer playcount;
	private Artwork art;
	
	
	/**
	 * Video.Details.Base
	 * 
	 * @param label
	 * @param fanart
	 * @param thumbnail
	 * @param playcount
	 * @param art
	 */
	public Base(String label, String fanart, String thumbnail, Integer playcount,
			Artwork art) {
		super(label, fanart, thumbnail);
		this.playcount = playcount;
		this.art = art;
	}
	/**
	 * Video.Details.Base
	 */
	public Base() {
		super();
	}
	
	/**
	 * @return the playcount
	 */
	public Integer getPlaycount() {
		return playcount;
	}
	/**
	 * @param playcount the playcount to set
	 */
	public void setPlaycount(Integer playcount) {
		this.playcount = playcount;
	}
	/**
	 * @return the art
	 */
	public Artwork getArt() {
		return art;
	}
	/**
	 * @param art the art to set
	 */
	public void setArt(Artwork art) {
		this.art = art;
	}
	
}
