package org.openhab.binding.xbmc.rpc.api.model.video.details;

import org.openhab.binding.xbmc.rpc.api.model.media.Artwork;

/**
 * Video.Details.Media - http://kodi.wiki/view/JSON-RPC_API/v6#Video.Details.Media
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Media extends org.openhab.binding.xbmc.rpc.api.model.video.details.Base {

	private String title;

	/**
	 * Video.Details.Media
	 * 
	 * @param label
	 * @param fanart
	 * @param thumbnail
	 * @param playcount
	 * @param art
	 * @param title
	 */
	public Media(String label, String fanart, String thumbnail, int playcount,
			Artwork art, String title) {
		super(label, fanart, thumbnail, playcount, art);
		this.title = title;
	}

	/**
	 * Video.Details.Media
	 */
	public Media() {
		super();
	}

	
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
}
