package org.openhab.binding.xbmc.rpc.calls.videoLibrary;

import java.util.ArrayList;
import java.util.Iterator;

import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getEpisodes.Parameters;
import org.openhab.binding.xbmc.rpc.api.model.list.Sort;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.EpisodesOr;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.Operator;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Episodes;
import org.openhab.binding.xbmc.rpc.api.model.list.sort.Method;
import org.openhab.binding.xbmc.rpc.api.model.list.sort.Order;

import com.ning.http.client.AsyncHttpClient;

/**
 * Search for a TV show and get its episodes. It also allow to get the next/last
 * episode ({@link #getNextOrLast()} method)
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 * 
 */
public class EpisodesByTVShowName extends GetEpisodes {

	private String _tvshowTitle;

	public EpisodesByTVShowName(AsyncHttpClient client, String uri) {
		super(client, uri);
	}

	@Override
	protected String getJsonRequest() {
		Parameters params = _request.getParams();
		// SORT		
		params.setSort(new Sort(Order.ascending, Method.label));

		// FILTERS
		org.openhab.binding.xbmc.rpc.api.model.list.filter.rule.Episodes tvShow_contains = 
				new org.openhab.binding.xbmc.rpc.api.model.list.filter.rule.Episodes(
				_tvshowTitle, Operator.contains, Episodes.tvshow);
		org.openhab.binding.xbmc.rpc.api.model.list.filter.rule.Episodes fileName_contains = 
				new org.openhab.binding.xbmc.rpc.api.model.list.filter.rule.Episodes(
				_tvshowTitle, Operator.startswith, Episodes.filename);
		
		EpisodesOr filter = new EpisodesOr(new ArrayList<org.openhab.binding.xbmc.rpc.api.model.list.filter.Episodes>());
		filter.getOr().add(tvShow_contains);
		filter.getOr().add(fileName_contains);
		params.setFilter(filter);

		// PROPERTIES
		params.setProperties(new ArrayList<org.openhab.binding.xbmc.rpc.api.model.video.fields.Episode>());
		params.getProperties().add(org.openhab.binding.xbmc.rpc.api.model.video.fields.Episode.showtitle);
		params.getProperties().add(org.openhab.binding.xbmc.rpc.api.model.video.fields.Episode.originaltitle);
		params.getProperties().add(org.openhab.binding.xbmc.rpc.api.model.video.fields.Episode.file);
		params.getProperties().add(org.openhab.binding.xbmc.rpc.api.model.video.fields.Episode.playcount);

		return super.getJsonRequest();
	}

	/**
	 * Gets the next episode (first unwatched) or the last one if all watched
	 * 
	 * @return Episode details or null if none found
	 */
	public org.openhab.binding.xbmc.rpc.api.model.video.details.Episode getNextOrLast() {
		org.openhab.binding.xbmc.rpc.api.model.video.details.Episode episode = null;
		if (_result != null && _result.getEpisodes().size() > 0) {
			boolean watched = true;
			Iterator<org.openhab.binding.xbmc.rpc.api.model.video.details.Episode> iteraEpisode = _result
					.getEpisodes().iterator();
			while (iteraEpisode.hasNext() && watched) {
				episode = iteraEpisode.next();
				if (episode.getPlaycount() <= 0)
					watched = false;
			}
		}
		return episode;
	}

	/**
	 * @return the _tvshowTitle
	 */
	public String getTvshowTitle() {
		return _tvshowTitle;
	}

	/**
	 * @param _tvshowTitle
	 *            the _tvshowTitle to set
	 */
	public void setTvshowTitle(String tvshowTitle) {
		this._tvshowTitle = tvshowTitle;
	}

}
