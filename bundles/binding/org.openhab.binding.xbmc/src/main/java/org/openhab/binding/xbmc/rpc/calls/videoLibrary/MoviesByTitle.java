package org.openhab.binding.xbmc.rpc.calls.videoLibrary;

import java.util.ArrayList;

import org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getMovies.Parameters;
import org.openhab.binding.xbmc.rpc.api.model.list.Sort;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.MoviesOr;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.Operator;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Movies;
import org.openhab.binding.xbmc.rpc.api.model.list.sort.Method;
import org.openhab.binding.xbmc.rpc.api.model.list.sort.Order;

import com.ning.http.client.AsyncHttpClient;

/**
 * Search for a Movie by its title
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 * 
 */
public class MoviesByTitle extends GetMovies {

	private String _movieTitle;

	public MoviesByTitle(AsyncHttpClient client, String uri) {
		super(client, uri);
	}

	@Override
	protected String getJsonRequest() {
		Parameters params = _request.getParams();
		// SORT		
		params.setSort(new Sort(Order.ascending, Method.title));

		// FILTERS
		org.openhab.binding.xbmc.rpc.api.model.list.filter.rule.Movies title_contains = 
				new org.openhab.binding.xbmc.rpc.api.model.list.filter.rule.Movies(
				_movieTitle, Operator.contains, Movies.title);
		org.openhab.binding.xbmc.rpc.api.model.list.filter.rule.Movies fileName_contains = 
				new org.openhab.binding.xbmc.rpc.api.model.list.filter.rule.Movies(
				_movieTitle, Operator.contains, Movies.filename);
		
		MoviesOr filter = new MoviesOr(new ArrayList<org.openhab.binding.xbmc.rpc.api.model.list.filter.Movies>());
		filter.getOr().add(title_contains);
		filter.getOr().add(fileName_contains);
		params.setFilter(filter);

		// PROPERTIES
		params.setProperties(new ArrayList<org.openhab.binding.xbmc.rpc.api.model.video.fields.Movie>());
		params.getProperties().add(org.openhab.binding.xbmc.rpc.api.model.video.fields.Movie.title);
		params.getProperties().add(org.openhab.binding.xbmc.rpc.api.model.video.fields.Movie.originaltitle);
		params.getProperties().add(org.openhab.binding.xbmc.rpc.api.model.video.fields.Movie.file);
		params.getProperties().add(org.openhab.binding.xbmc.rpc.api.model.video.fields.Movie.playcount);

		return super.getJsonRequest();
	}	

	/**
	 * @return the _movieTitle
	 */
	public String getMovieTitle() {
		return _movieTitle;
	}

	/**
	 * @param the movie Title to set
	 */
	public void setMovieTitle(String movieTitle) {
		this._movieTitle = movieTitle;
	}

}
