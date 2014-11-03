package org.openhab.binding.xbmc.rpc.api.method.videoLibrary.getEpisodes;

import java.util.ArrayList;

import org.openhab.binding.xbmc.rpc.api.model.list.Limits;
import org.openhab.binding.xbmc.rpc.api.model.list.Sort;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.Episodes;
import org.openhab.binding.xbmc.rpc.api.model.video.fields.Episode;

/**
 * VideoLibrary.GetMovies Parameters - http://kodi.wiki/view/JSON-RPC_API/v6#VideoLibrary.GetMovies
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Parameters {

	private Integer _tvshowid = null;
	private Integer _season = null;
	private ArrayList<Episode> _properties;
	private Limits _limits;
	private Sort _sort;
	private Episodes _filter;
	
	/**
	 * VideoLibrary.GetMovies Parameters
	 * 
	 * @param tvshowid
	 * @param season
	 * @param properties
	 * @param limits
	 * @param sort
	 * @param filter
	 */
	public Parameters(Integer tvshowid, Integer season, ArrayList<Episode> properties,
			Limits limits, Sort sort, Episodes filter) {
		super();
		this._tvshowid = tvshowid;
		this._season = season;
		this._properties = properties;
		this._limits = limits;
		this._sort = sort;
		this._filter = filter;
	}
	/**
	 * VideoLibrary.GetMovies Parameters
	 * 
	 * @param properties
	 * @param sort
	 * @param filter
	 */
	public Parameters(ArrayList<Episode> properties, Sort sort, Episodes filter) {
		super();
		this._properties = properties;
		this._sort = sort;
		this._filter = filter;
	}
	/**
	 * VideoLibrary.GetMovies Parameters
	 */
	public Parameters() {
		super();
	}
	
	public Integer getTvshowid() {
		return _tvshowid;
	}
	public void setTvshowid(Integer tvshowid) {
		this._tvshowid = tvshowid;
	}
	public Integer getSeason() {
		return _season;
	}
	public void setSeason(Integer season) {
		this._season = season;
	}
	public ArrayList<Episode> getProperties() {
		return _properties;
	}
	public void setProperties(ArrayList<Episode> properties) {
		this._properties = properties;
	}
	public Limits getLimits() {
		return _limits;
	}
	public void setLimits(Limits limits) {
		this._limits = limits;
	}
	public Sort getSort() {
		return _sort;
	}
	public void setSort(Sort sort) {
		this._sort = sort;
	}
	public Episodes getFilter() {
		return _filter;
	}
	public void setFilter(Episodes filter) {
		this._filter = filter;
	}
	
}
