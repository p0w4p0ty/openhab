package org.openhab.binding.xbmc.rpc.api.model.video.details;

import java.util.ArrayList;

import org.openhab.binding.xbmc.rpc.api.model.media.Artwork;
import org.openhab.binding.xbmc.rpc.api.model.video.Resume;
import org.openhab.binding.xbmc.rpc.api.model.video.Streams;

/**
 * Video.Details.File - http://kodi.wiki/view/JSON-RPC_API/v6#Video.Details.File
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class File extends org.openhab.binding.xbmc.rpc.api.model.video.details.Item {

	private Streams streamdetails;	
	private ArrayList<String> director = new ArrayList<String>();
	private Resume resume;
	private Integer runtime;
	
	/**
	 * Video.Details.File
	 */
	public File() {
	}

	/**
	 * Video.Details.File
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
	 * @param streamdetails
	 * @param director
	 * @param resume
	 * @param runtime
	 */
	public File(String label, String fanart, String thumbnail, int playcount,
			Artwork art, String title, String dateadded, String file,
			String lastplayed, String plot, Streams streamdetails,
			ArrayList<String> director, Resume resume, Integer runtime) {
		super(label, fanart, thumbnail, playcount, art, title, dateadded, file,
				lastplayed, plot);
		this.streamdetails = streamdetails;
		this.director = director;
		this.resume = resume;
		this.runtime = runtime;
	}

	/**
	 * @return the streamdetails
	 */
	public Streams getStreamdetails() {
		return streamdetails;
	}

	/**
	 * @param streamdetails the streamdetails to set
	 */
	public void setStreamdetails(Streams streamdetails) {
		this.streamdetails = streamdetails;
	}

	/**
	 * @return the director
	 */
	public ArrayList<String> getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(ArrayList<String> director) {
		this.director = director;
	}

	/**
	 * @return the resume
	 */
	public Resume getResume() {
		return resume;
	}

	/**
	 * @param resume the resume to set
	 */
	public void setResume(Resume resume) {
		this.resume = resume;
	}

	/**
	 * @return the runtime
	 */
	public Integer getRuntime() {
		return runtime;
	}

	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	
}
