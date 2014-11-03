package org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getMovies;

import java.util.ArrayList;

import org.openhab.binding.xbmc.rpc.api.model.list.LimitsReturned;
import org.openhab.binding.xbmc.rpc.api.model.video.details.Movie;

/**
 * VideoLibrary.GetMovies RESULT - http://kodi.wiki/view/JSON-RPC_API/v6#VideoLibrary.GetMovies
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Result {

	private ArrayList<Movie> episodes;
	private LimitsReturned limits;
	
	/**
	 * @param episodes
	 * @param limits
	 */
	public Result(ArrayList<Movie> episodes, LimitsReturned limits) {
		super();
		this.episodes = episodes;
		this.limits = limits;
	}
	
	/**
	 * VideoLibrary.GetMovies RESULT
	 */
	public Result() {
		super();
	}

	
	
	/**
	 * @return the episodes
	 */
	public ArrayList<Movie> getMovies() {
		return episodes;
	}

	/**
	 * @param episodes the episodes to set
	 */
	public void setMovies(ArrayList<Movie> episodes) {
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
