package org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getMovies;

import java.util.ArrayList;

import org.openhab.binding.xbmc.rpc.api.model.list.Limits;
import org.openhab.binding.xbmc.rpc.api.model.list.Sort;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.Movies;
import org.openhab.binding.xbmc.rpc.api.model.video.fields.Movie;

/**
 * VideoLibrary.GetEpisodes Parameters - http://kodi.wiki/view/JSON-RPC_API/v6#VideoLibrary.GetEpisodes
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class Parameters {

	private ArrayList<Movie> _properties;
	private Limits _limits;
	private Sort _sort;
	private Movies _filter;
	
	/**
	 * VideoLibrary.GetEpisodes Parameters
	 * 
	 * @param properties
	 * @param limits
	 * @param sort
	 * @param filter
	 */
	public Parameters(ArrayList<Movie> properties, Limits limits, Sort sort,
			Movies filter) {
		super();
		this._properties = properties;
		this._limits = limits;
		this._sort = sort;
		this._filter = filter;
	}
	
	/**
	 * VideoLibrary.GetEpisodes Parameters
	 */
	public Parameters() {
		super();
	}

	/**
	 * @return the properties
	 */
	public ArrayList<Movie> getProperties() {
		return _properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(ArrayList<Movie> properties) {
		this._properties = properties;
	}

	/**
	 * @return the limits
	 */
	public Limits getLimits() {
		return _limits;
	}

	/**
	 * @param limits the limits to set
	 */
	public void setLimits(Limits limits) {
		this._limits = limits;
	}

	/**
	 * @return the sort
	 */
	public Sort getSort() {
		return _sort;
	}

	/**
	 * @param sort the sort to set
	 */
	public void setSort(Sort sort) {
		this._sort = sort;
	}

	/**
	 * @return the filter
	 */
	public Movies getFilter() {
		return _filter;
	}

	/**
	 * @param filter the filter to set
	 */
	public void setFilter(Movies filter) {
		this._filter = filter;
	}
	
}
