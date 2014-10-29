package org.openhab.binding.xbmc.rpc.api.model.list.filter;

import java.util.ArrayList;

public class EpisodesAnd implements Episodes {

	private ArrayList<Episodes> _and;
	
	public EpisodesAnd() {
		super();
	}

	/**
	 * @param and
	 */
	public EpisodesAnd(ArrayList<Episodes> and) {
		super();
		this._and = and;
	}

	public ArrayList<Episodes> getAnd() {
		return _and;
	}

	public void setAnd(ArrayList<Episodes> and) {
		this._and = and;
	}
	
}
