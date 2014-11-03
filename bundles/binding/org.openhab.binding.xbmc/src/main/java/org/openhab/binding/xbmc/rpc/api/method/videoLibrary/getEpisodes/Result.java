package org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getEpisodes;

import java.util.ArrayList;

import org.openhab.binding.xbmc.rpc.api.model.list.LimitsReturned;
import org.openhab.binding.xbmc.rpc.api.model.video.details.Episode;

/**
 * VideoLibrary.GetEpisodes RESULT - http://kodi.wiki/view/JSON-RPC_API/v6#VideoLibrary.GetEpisodes
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Result {

	private ArrayList<Episode> episodes;
	private LimitsReturned limits;
	
	/**
	 * @param episodes
	 * @param limits
	 */
	public Result(ArrayList<Episode> episodes, LimitsReturned limits) {
		super();
		this.episodes = episodes;
		this.limits = limits;
	}
	
	/**
	 * VideoLibrary.GetEpisodes RESULT
	 */
	public Result() {
		super();
	}

	
	
	/**
	 * @return the episodes
	 */
	public ArrayList<Episode> getEpisodes() {
		return episodes;
	}

	/**
	 * @param episodes the episodes to set
	 */
	public void setEpisodes(ArrayList<Episode> episodes) {
		this.episodes = episodes;
	}

	/**
	 * @return the limits
	 */
	public LimitsReturned getLimits() {
		return limits;
	}

	/**
	 * @param limits the limits to set
	 */
	public void setLimits(LimitsReturned limits) {
		this.limits = limits;
	}
	
}
