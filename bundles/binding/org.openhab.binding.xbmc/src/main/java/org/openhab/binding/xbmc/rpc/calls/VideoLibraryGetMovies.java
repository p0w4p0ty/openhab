package org.openhab.binding.xbmc.rpc.calls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openhab.binding.xbmc.rpc.RpcCall;

import com.ning.http.client.AsyncHttpClient;

/**
 * VideoLibrary.GetMovies kodi JSON-RPC_API Doc:
 * http://kodi.wiki/view/JSON-RPC_API/v6#VideoLibrary.GetMovies
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 * 
 */
public class VideoLibraryGetMovies extends RpcCall {

	// TODO: Auto generate model from XBMC JSON-RPC introspect (http://wiki.xbmc.org/index.php?title=JSON-RPC_API/v3#JSONRPC.Introspect)
	// PARAMS SORT
	public static final String SORT_KEY = "sort";
	public static final String SORT_ORDER_KEY = "order";
	public static enum SORT_ORDER_VALUES {
		ascending("ascending"), 
		descending("descending");
		
		private final String value;
		SORT_ORDER_VALUES(String value) {
			this.value = value;
		}
		String getValue(){
			return this.value;
		}
	};
	public static enum List_Sort {
		none("none"), 
		label("label"), 
		date("date"), 
		size("size"), 
		file("file"), 
		path("path"), 
		drivetype("drivetype"), 
		title("title"), 
		track("track"), 
		time("time"), 
		artist("artist"), 
		album("album"), 
		albumtype("albumtype"), 
		genre("genre"), 
		country("country"), 
		year("year"), 
		rating("rating"), 
		votes("votes"), 
		top250("top250"), 
		programcount("programcount"), 
		playlist("playlist"), 
		episode("episode"), 
		season("season"), 
		totalepisodes("totalepisodes"), 
		watchedepisodes("watchedepisodes"), 
		tvshowstatus("tvshowstatus"), 
		tvshowtitle("tvshowtitle"), 
		sorttitle("sorttitle"), 
		productioncode("productioncode"), 
		mpaa("mpaa"), 
		studio("studio"), 
		dateadded("dateadded"), 
		lastplayed("lastplayed"), 
		playcount("playcount"), 
		listeners("listeners"), 
		bitrate("bitrate"), 
		random("random");
		
		private final String value;
		List_Sort(String value) {
			this.value = value;
		}
		String getValue(){
			return this.value;
		}
	};
	public static final String SORT_METHOD_KEY = "method";
	public static final String SORT_METHOD_DEFAULT_VALUE = List_Sort.title.getValue();

	// PARAMS FILTER
	public static final String FILTER_KEY = "filter";
	public static final String FILTER_OPERATOR_KEY = "operator";
	public static enum FILTER_OPERATOR_VALUES {
		contains("contains"), 
		doesnotcontain("doesnotcontain"), 
		is("is"),
		isnot("isnot"), 
		startswith("startswith"), 
		endswith("endswith"), 
		greaterthan("greaterthan"), 
		lessthan("lessthan"), 
		after("after"), 
		before("before"), 
		inthelast("inthelast"), 
		notinthelast("notinthelast"), 
		between("between"), 
		isTrue("true"), 
		isFalse("false");
		
		private final String value;
		FILTER_OPERATOR_VALUES(String value) {
			this.value = value;
		}
		String getValue(){
			return this.value;
		}
	};
	public static final String FILTER_FIELD_KEY = "field";
	public static enum Video_Fields_Movie {
		title("title"), 
		genre("genre"), 
		year("year"), 
		rating("rating"), 
		director("director"), 
		trailer("trailer"), 
		tagline("tagline"), 
		plot("plot"), 
		plotoutline("plotoutline"), 
		originaltitle("originaltitle"), 
		lastplayed("lastplayed"), 
		playcount("playcount"), 
		writer("writer"), 
		studio("studio"), 
		mpaa("mpaa"), 
		cast("cast"), 
		country("country"), 
		imdbnumber("imdbnumber"), 
		runtime("runtime"), 
		set("set"), 
		showlink("showlink"), 
		streamdetails("streamdetails"), 
		top250("top250"), 
		votes("votes"), 
		fanart("fanart"), 
		thumbnail("thumbnail"), 
		file("file"), 
		sorttitle("sorttitle"), 
		resume("resume"), 
		setid("setid"), 
		dateadded("dateadded"), 
		tag("tag"), 
		art("art");
		
		private final String value;
		Video_Fields_Movie(String value) {
			this.value = value;
		}
		String getValue(){
			return this.value;
		}
	}
	public static final String FILTER_VALUE_KEY = "value";

	// Properties
	public static final String PROPERTIES_KEY = "properties";
	
	
	
	
	private SORT_ORDER_VALUES order = SORT_ORDER_VALUES.ascending;
	private String movieTitle;
	private ArrayList<Object> moviesFound;
	private int numMoviesFound = 0;

	
	
	
	
	public VideoLibraryGetMovies(AsyncHttpClient client, String uri) {
		super(client, uri);
	}

	@Override
	protected String getName() {
		return "VideoLibrary.GetMovies";
	}

	@Override
	protected Map<String, Object> getParams() {
		Map<String, Object> params = new HashMap<String, Object>();
		Map<String, Object> sort = new HashMap<String, Object>();
		Map<String, Object> filter = new HashMap<String, Object>();
		
		// Sort
		sort.put(SORT_ORDER_KEY, order.getValue());
		sort.put(SORT_METHOD_KEY, SORT_METHOD_DEFAULT_VALUE);
		
		// Filter
		filter.put(FILTER_OPERATOR_KEY, FILTER_OPERATOR_VALUES.contains.getValue());
		filter.put(FILTER_FIELD_KEY, Video_Fields_Movie.title.getValue());
		filter.put(FILTER_VALUE_KEY, movieTitle);
		
		// Properties
		ArrayList<String> properties = new ArrayList<String>();
		properties.add(Video_Fields_Movie.title.getValue());
		properties.add(Video_Fields_Movie.art.getValue());
		properties.add(Video_Fields_Movie.file.getValue());
		
		params.put(SORT_KEY, sort);
		params.put(FILTER_KEY, filter);
		params.put(PROPERTIES_KEY, properties);
		return params;
	}

	@Override
	protected void processResponse(Map<String, Object> response) {
		Map<String, Object> result = getMap(response, "result");
		Map<String, Object> limits = getMap(result, "limits");
		moviesFound = new ArrayList<Object>();
		if (limits.containsKey("total"))
			numMoviesFound = (Integer) limits.get("total");
		if (result.containsKey("movies")){
			moviesFound = (ArrayList<Object>) result.get("movies");
		}
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieName) {
		this.movieTitle = movieName;
	}

	public ArrayList<Object> getMoviesFound() {
		return moviesFound;
	}

	public int getNumMoviesFound() {
		return numMoviesFound;
	}

	public void setOrder(SORT_ORDER_VALUES order) {
		this.order = order;
	}

}
