package org.openhab.binding.xbmc.rpc.api.model.video.details;

import java.util.ArrayList;

/**
 * Video.Details.Episode - http://kodi.wiki/view/JSON-RPC_API/v6#Video.Details.Episode
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Episode extends File {

	private Integer _episodeid;
	private ArrayList<Cast> _cast;
	private String _productioncode;
	private Double _rating;
	private String _votes;
	private Integer _episode;
	private String _showtitle;	
	private Integer _tvshowid;
	private Integer _season;
	private String _firstaired;
	private String _originaltitle;
	private String[] _writer;
	
	public class Cast {
		public String thumbnail = "";
		public String name = "";
		public String role = "";
	}

	/**
	 * Video.Details.Episode
	 * 
	 * @param cast
	 * @param productioncode
	 * @param rating
	 * @param votes
	 * @param episode
	 * @param showtitle
	 * @param episodeid
	 * @param tvshowid
	 * @param season
	 * @param firstaired
	 * @param uniqueid
	 * @param originaltitle
	 * @param writer
	 */
	public Episode(ArrayList<Cast> cast, String productioncode, Double rating,
			String votes, Integer episode, String showtitle, Integer episodeid,
			Integer tvshowid, Integer season, String firstaired, Object uniqueid,
			String originaltitle, String[] writer) {
		super();
		this._cast = cast;
		this._productioncode = productioncode;
		this._rating = rating;
		this._votes = votes;
		this._episode = episode;
		this._showtitle = showtitle;
		this._episodeid = episodeid;
		this._tvshowid = tvshowid;
		this._season = season;
		this._firstaired = firstaired;
		this._originaltitle = originaltitle;
		this._writer = writer;
	}
	
	/**
	 * Video.Details.Episode
	 */
	public Episode() {
		super();
	}

	/**
	 * @return the cast
	 */
	public ArrayList<Cast> getCast() {
		return _cast;
	}

	/**
	 * @param cast the cast to set
	 */
	public void setCast(ArrayList<Cast> cast) {
		this._cast = cast;
	}

	/**
	 * @return the productioncode
	 */
	public String getProductioncode() {
		return _productioncode;
	}

	/**
	 * @param productioncode the productioncode to set
	 */
	public void setProductioncode(String productioncode) {
		this._productioncode = productioncode;
	}

	/**
	 * @return the rating
	 */
	public Double getRating() {
		return _rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Double rating) {
		this._rating = rating;
	}

	/**
	 * @return the votes
	 */
	public String getVotes() {
		return _votes;
	}

	/**
	 * @param votes the votes to set
	 */
	public void setVotes(String votes) {
		this._votes = votes;
	}

	/**
	 * @return the episode
	 */
	public Integer getEpisode() {
		return _episode;
	}

	/**
	 * @param episode the episode to set
	 */
	public void setEpisode(Integer episode) {
		this._episode = episode;
	}

	/**
	 * @return the showtitle
	 */
	public String getShowtitle() {
		return _showtitle;
	}

	/**
	 * @param showtitle the showtitle to set
	 */
	public void setShowtitle(String showtitle) {
		this._showtitle = showtitle;
	}

	/**
	 * @return the episodeid
	 */
	public Integer getEpisodeid() {
		return _episodeid;
	}

	/**
	 * @param episodeid the episodeid to set
	 */
	public void setEpisodeid(Integer episodeid) {
		this._episodeid = episodeid;
	}

	/**
	 * @return the tvshowid
	 */
	public Integer getTvshowid() {
		return _tvshowid;
	}

	/**
	 * @param tvshowid the tvshowid to set
	 */
	public void setTvshowid(Integer tvshowid) {
		this._tvshowid = tvshowid;
	}

	/**
	 * @return the season
	 */
	public Integer getSeason() {
		return _season;
	}

	/**
	 * @param season the season to set
	 */
	public void setSeason(Integer season) {
		this._season = season;
	}

	/**
	 * @return the firstaired
	 */
	public String getFirstaired() {
		return _firstaired;
	}

	/**
	 * @param firstaired the firstaired to set
	 */
	public void setFirstaired(String firstaired) {
		this._firstaired = firstaired;
	}

	/**
	 * @return the originaltitle
	 */
	public String getOriginaltitle() {
		return _originaltitle;
	}

	/**
	 * @param originaltitle the originaltitle to set
	 */
	public void setOriginaltitle(String originaltitle) {
		this._originaltitle = originaltitle;
	}

	/**
	 * @return the writer
	 */
	public String[] getWriter() {
		return _writer;
	}

	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String[] writer) {
		this._writer = writer;
	}
	
}
