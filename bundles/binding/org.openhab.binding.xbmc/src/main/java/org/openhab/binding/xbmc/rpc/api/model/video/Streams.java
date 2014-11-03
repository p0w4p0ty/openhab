package org.openhab.binding.xbmc.rpc.api.model.video;

import java.util.ArrayList;

/**
 * Video.Streams - http://kodi.wiki/view/JSON-RPC_API/v6#Video.Streams
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Streams {

	private ArrayList<Video> video;
	private ArrayList<Audio> audio;
	private ArrayList<Subtitle> subtitle;
	
	public class Video {
		public Integer height;
		public Integer width;
		public Double aspect;
		public String codec;
		public Double duration;
	}
	
	public class Audio {
		public Integer channels;
		public String language;
		public String codec;		
	}
	
	public class Subtitle {
		public String language;
	}

	/**
	 * Video.Streams
	 * 
	 * @param video
	 * @param audio
	 * @param subtitle
	 */
	public Streams(ArrayList<Video> video, ArrayList<Audio> audio,
			ArrayList<Subtitle> subtitle) {
		super();
		this.video = video;
		this.audio = audio;
		this.subtitle = subtitle;
	}

	/**
	 * Video.Streams
	 */
	public Streams() {
		super();
	}

	/**
	 * @return the video
	 */
	public ArrayList<Video> getVideo() {
		return video;
	}

	/**
	 * @param video the video to set
	 */
	public void setVideo(ArrayList<Video> video) {
		this.video = video;
	}

	/**
	 * @return the audio
	 */
	public ArrayList<Audio> getAudio() {
		return audio;
	}

	/**
	 * @param audio the audio to set
	 */
	public void setAudio(ArrayList<Audio> audio) {
		this.audio = audio;
	}

	/**
	 * @return the subtitle
	 */
	public ArrayList<Subtitle> getSubtitle() {
		return subtitle;
	}

	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(ArrayList<Subtitle> subtitle) {
		this.subtitle = subtitle;
	}
	
}
