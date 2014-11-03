package org.openhab.binding.xbmc.rpc.api.model.list;

/**
 * List.LimitsReturned - http://kodi.wiki/view/JSON-RPC_API/v6#List.LimitsReturned
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class LimitsReturned {

	private Integer end = null;
	private Integer total = null;
	private Integer start = null;
	
	
	/**
	 * List.LimitsReturned
	 * 
	 * @param end
	 * @param total
	 * @param start
	 */
	public LimitsReturned(Integer end, Integer total, Integer start) {
		super();
		this.end = end;
		this.total = total;
		this.start = start;
	}
	
	/**
	 * List.LimitsReturned
	 */
	public LimitsReturned() {
		super();
	}

	
	
	/**
	 * @return the end
	 */
	public Integer getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Integer end) {
		this.end = end;
	}

	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * @return the start
	 */
	public Integer getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Integer start) {
		this.start = start;
	}
	
}
