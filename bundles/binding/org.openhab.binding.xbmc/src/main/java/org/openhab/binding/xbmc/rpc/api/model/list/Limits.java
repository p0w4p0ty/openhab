package org.openhab.binding.xbmc.rpc.api.model.list;

public class Limits {

	private Integer end = null;
	private Integer start = null;
	
	public Limits() {
		super();
	}

	/**
	 * @param end
	 * @param start
	 */
	public Limits(Integer end, Integer start) {
		super();
		this.end = end;
		this.start = start;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

}
