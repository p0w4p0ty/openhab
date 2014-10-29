package org.openhab.binding.xbmc.rpc.api.model.video.details;

import java.util.ArrayList;


/**
 * Video.Details.Movie - http://kodi.wiki/view/JSON-RPC_API/v6#Video.Details.Movie
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class Movie extends File {

	private Integer _movieid;
	private String _plotoutline;
	private String _sorttitle;
	private ArrayList<Cast> _cast;
	private String _votes;
	private String _showlink;
	private Integer _top250;
	private String _trailer;
	private Integer _year;
	private String _country;
	private String _studio;
	private String _set;
	private String _genre;
	private String _mpaa;
	private Integer _setid;
	private Double _rating;
	private String _tag;
	private String _tagline;
	private String _writer;
	private String _originaltitle;
	private String _imdbnumber;
	
	public class Cast {
		public String thumbnail = "";
		public String name = "";
		public String role = "";
	}

	/**
	 * Video.Details.Movie
	 * 
	 * @param movieid
	 * @param plotoutline
	 * @param sorttitle
	 * @param cast
	 * @param votes
	 * @param showlink
	 * @param top250
	 * @param trailer
	 * @param year
	 * @param country
	 * @param studio
	 * @param set
	 * @param genre
	 * @param mpaa
	 * @param setid
	 * @param rating
	 * @param tag
	 * @param tagline
	 * @param writer
	 * @param originaltitle
	 * @param imdbnumber
	 */
	public Movie(Integer movieid, String plotoutline, String sorttitle,
			ArrayList<Cast> cast, String votes, String showlink,
			Integer top250, String trailer, Integer year, String country,
			String studio, String set, String genre, String mpaa,
			Integer setid, Double rating, String tag, String tagline,
			String writer, String originaltitle, String imdbnumber) {
		super();
		this._movieid = movieid;
		this._plotoutline = plotoutline;
		this._sorttitle = sorttitle;
		this._cast = cast;
		this._votes = votes;
		this._showlink = showlink;
		this._top250 = top250;
		this._trailer = trailer;
		this._year = year;
		this._country = country;
		this._studio = studio;
		this._set = set;
		this._genre = genre;
		this._mpaa = mpaa;
		this._setid = setid;
		this._rating = rating;
		this._tag = tag;
		this._tagline = tagline;
		this._writer = writer;
		this._originaltitle = originaltitle;
		this._imdbnumber = imdbnumber;
	}
	
	/**
	 * Video.Details.Movie
	 */
	public Movie() {
		super();
	}

	/**
	 * @return the movieid
	 */
	public Integer getMovieid() {
		return _movieid;
	}

	/**
	 * @param movieid the movieid to set
	 */
	public void setMovieid(Integer movieid) {
		this._movieid = movieid;
	}

	/**
	 * @return the plotoutline
	 */
	public String getPlotoutline() {
		return _plotoutline;
	}

	/**
	 * @param plotoutline the plotoutline to set
	 */
	public void setPlotoutline(String plotoutline) {
		this._plotoutline = plotoutline;
	}

	/**
	 * @return the sorttitle
	 */
	public String getSorttitle() {
		return _sorttitle;
	}

	/**
	 * @param sorttitle the sorttitle to set
	 */
	public void setSorttitle(String sorttitle) {
		this._sorttitle = sorttitle;
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
	 * @return the showlink
	 */
	public String getShowlink() {
		return _showlink;
	}

	/**
	 * @param showlink the showlink to set
	 */
	public void setShowlink(String showlink) {
		this._showlink = showlink;
	}

	/**
	 * @return the top250
	 */
	public Integer getTop250() {
		return _top250;
	}

	/**
	 * @param top250 the top250 to set
	 */
	public void setTop250(Integer top250) {
		this._top250 = top250;
	}

	/**
	 * @return the trailer
	 */
	public String getTrailer() {
		return _trailer;
	}

	/**
	 * @param trailer the trailer to set
	 */
	public void setTrailer(String trailer) {
		this._trailer = trailer;
	}

	/**
	 * @return the year
	 */
	public Integer getYear() {
		return _year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this._year = year;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return _country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this._country = country;
	}

	/**
	 * @return the studio
	 */
	public String getStudio() {
		return _studio;
	}

	/**
	 * @param studio the studio to set
	 */
	public void setStudio(String studio) {
		this._studio = studio;
	}

	/**
	 * @return the set
	 */
	public String getSet() {
		return _set;
	}

	/**
	 * @param set the set to set
	 */
	public void setSet(String set) {
		this._set = set;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return _genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this._genre = genre;
	}

	/**
	 * @return the mpaa
	 */
	public String getMpaa() {
		return _mpaa;
	}

	/**
	 * @param mpaa the mpaa to set
	 */
	public void setMpaa(String mpaa) {
		this._mpaa = mpaa;
	}

	/**
	 * @return the setid
	 */
	public Integer getSetid() {
		return _setid;
	}

	/**
	 * @param setid the setid to set
	 */
	public void setSetid(Integer setid) {
		this._setid = setid;
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
	 * @return the tag
	 */
	public String getTag() {
		return _tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this._tag = tag;
	}

	/**
	 * @return the tagline
	 */
	public String getTagline() {
		return _tagline;
	}

	/**
	 * @param tagline the tagline to set
	 */
	public void setTagline(String tagline) {
		this._tagline = tagline;
	}

	/**
	 * @return the writer
	 */
	public String getWriter() {
		return _writer;
	}

	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this._writer = writer;
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
	 * @return the imdbnumber
	 */
	public String getImdbnumber() {
		return _imdbnumber;
	}

	/**
	 * @param imdbnumber the imdbnumber to set
	 */
	public void setImdbnumber(String imdbnumber) {
		this._imdbnumber = imdbnumber;
	}
	
}
