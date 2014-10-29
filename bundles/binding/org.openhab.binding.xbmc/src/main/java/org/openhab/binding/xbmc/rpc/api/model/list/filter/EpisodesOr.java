package org.openhab.binding.xbmc.rpc.api.model.list.filter;

import java.util.ArrayList;

public class EpisodesOr implements Episodes {

	private ArrayList<Episodes> _or;
	
	public EpisodesOr() {
		super();
	}

	/**
	 * @param and
	 */
	public EpisodesOr(ArrayList<Episodes> or) {
		super();
		this._or = or;
	}

	public ArrayList<Episodes> getOr() {
		return _or;
	}

	public void setOr(ArrayList<Episodes> or) {
		this._or = or;
	}
	
}
