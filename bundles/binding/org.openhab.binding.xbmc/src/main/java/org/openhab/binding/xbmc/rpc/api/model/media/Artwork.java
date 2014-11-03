package org.openhab.binding.xbmc.rpc.api.model.media;

/**
 * Media.Artwork - http://kodi.wiki/view/JSON-RPC_API/v6#Media.Artwork
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Artwork {

	private String banner;
	private String poster;
	private String fanart;
	private String thumb;
	
	
	/**
	 * Media.Artwork
	 * 
	 * @param banner
	 * @param poster
	 * @param fanart
	 * @param thumb
	 */
	public Artwork(String banner, String poster, String fanart, String thumb) {
		super();
		this.banner = banner;
		this.poster = poster;
		this.fanart = fanart;
		this.thumb = thumb;
	}


	/**
	 * Media.Artwork
	 * 
	 */
	public Artwork() {
		super();
	}



	/**
	 * @return the banner
	 */
	public String getBanner() {
		return banner;
	}


	/**
	 * @param banner the banner to set
	 */
	public void setBanner(String banner) {
		this.banner = banner;
	}


	/**
	 * @return the poster
	 */
	public String getPoster() {
		return poster;
	}


	/**
	 * @param poster the poster to set
	 */
	public void setPoster(String poster) {
		this.poster = poster;
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
	 * @return the thumb
	 */
	public String getThumb() {
		return thumb;
	}


	/**
	 * @param thumb the thumb to set
	 */
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	
}
