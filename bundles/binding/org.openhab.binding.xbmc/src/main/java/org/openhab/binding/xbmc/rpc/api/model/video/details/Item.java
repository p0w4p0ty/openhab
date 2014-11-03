package org.openhab.binding.xbmc.rpc.api.model.video.details;

import org.openhab.binding.xbmc.rpc.api.model.media.Artwork;

/**
 * Video.Details.Item - http://kodi.wiki/view/JSON-RPC_API/v6#Video.Details.Item
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Item extends org.openhab.binding.xbmc.rpc.api.model.video.details.Media {

	private String dateadded;
	private String file;
	private String lastplayed;
	private String plot;
	
	
	/**
	 * Video.Details.Item
	 * 
	 * @param label
	 * @param fanart
	 * @param thumbnail
	 * @param playcount
	 * @param art
	 * @param title
	 * @param dateadded
	 * @param file
	 * @param lastplayed
	 * @param plot
	 */
	public Item(String label, String fanart, String thumbnail, int playcount,
			Artwork art, String title, String dateadded, String file,
			String lastplayed, String plot) {
		super(label, fanart, thumbnail, playcount, art, title);
		this.dateadded = dateadded;
		this.file = file;
		this.lastplayed = lastplayed;
		this.plot = plot;
	}
	
	
	/**
	 * Video.Details.Item
	 */
	public Item() {
		super();
	}


	/**
	 * @return the dateadded
	 */
	public String getDateadded() {
		return dateadded;
	}


	/**
	 * @param dateadded the dateadded to set
	 */
	public void setDateadded(String dateadded) {
		this.dateadded = dateadded;
	}


	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}


	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}


	/**
	 * @return the lastplayed
	 */
	public String getLastplayed() {
		return lastplayed;
	}


	/**
	 * @param lastplayed the lastplayed to set
	 */
	public void setLastplayed(String lastplayed) {
		this.lastplayed = lastplayed;
	}


	/**
	 * @return the plot
	 */
	public String getPlot() {
		return plot;
	}


	/**
	 * @param plot the plot to set
	 */
	public void setPlot(String plot) {
		this.plot = plot;
	}
	
}
