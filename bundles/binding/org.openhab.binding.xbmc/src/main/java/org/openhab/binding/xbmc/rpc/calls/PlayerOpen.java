/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.xbmc.rpc.calls;

import java.util.HashMap;
import java.util.Map;

import org.openhab.binding.xbmc.rpc.RpcCall;

import com.ning.http.client.AsyncHttpClient;

/**
 * Player.Open RPC
 * 
 * @author Ard van der Leeuw
 * @since 1.6.0
 */
public class PlayerOpen extends RpcCall {
	
	private String file;
	private Integer movieid = null;
	private Integer episodeid = null;
	private Integer musicvideoid = null;
	private Integer albumid = null;
	private Integer songid = null;
	private String params = null;
	

	public PlayerOpen(AsyncHttpClient client, String uri) {
		super(client, uri);
	}
	
	@Override
	protected String getName() {
		return "Player.Open";
	}
	
	@Override
	protected Map<String, Object> getParams() {
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		if (params != null && !params.isEmpty()){
			paramsMap = readJson(params);
		} else if (file != null && !file.isEmpty()){
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("file", file);
			paramsMap.put("item", item);
		} else if (movieid != null && movieid >= 0){
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("movieid", movieid);
			paramsMap.put("item", item);
		} else if (episodeid != null && episodeid >= 0){
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("episodeid", episodeid);
			paramsMap.put("item", item);
		} else if (musicvideoid != null && musicvideoid >= 0){
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("musicvideoid", musicvideoid);
			paramsMap.put("item", item);
		} else if (albumid != null && albumid >= 0){
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("albumid", albumid);
			paramsMap.put("item", item);
		} else if (songid != null && songid >= 0){
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("songid", songid);
			paramsMap.put("item", item);
		}
		return paramsMap;
	}
	
	@Override
	protected void processResponse(Map<String, Object> response) {
	}

	public void setFile(String file) {
		this.file = file;
	}

	public void setMovieid(Integer movieid) {
		this.movieid = movieid;
	}

	public void setEpisodeid(Integer episodeid) {
		this.episodeid = episodeid;
	}

	public void setMusicvideoid(Integer musicvideoid) {
		this.musicvideoid = musicvideoid;
	}

	public void setAlbumid(Integer albumid) {
		this.albumid = albumid;
	}

	public void setSongid(Integer songid) {
		this.songid = songid;
	}

	public void setParams(String params) {
		this.params = params;
	}
	
}
