package org.openhab.binding.xbmc.rpc.api.model.list.filter;

import java.util.ArrayList;

public class MoviesOr implements Movies {

	private ArrayList<Movies> _or;
	
	public MoviesOr() {
		super();
	}

	/**
	 * @param and
	 */
	public MoviesOr(ArrayList<Movies> or) {
		super();
		this._or = or;
	}

	public ArrayList<Movies> getOr() {
		return _or;
	}

	public void setOr(ArrayList<Movies> or) {
		this._or = or;
	}
	
}
