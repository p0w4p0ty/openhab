package org.openhab.binding.xbmc.rpc.api.model.list.filter;

import java.util.ArrayList;

public class MoviesAnd implements Movies {

	private ArrayList<Movies> _and;
	
	public MoviesAnd() {
		super();
	}

	/**
	 * @param and
	 */
	public MoviesAnd(ArrayList<Movies> and) {
		super();
		this._and = and;
	}

	public ArrayList<Movies> getAnd() {
		return _and;
	}

	public void setAnd(ArrayList<Movies> and) {
		this._and = and;
	}
	
}
