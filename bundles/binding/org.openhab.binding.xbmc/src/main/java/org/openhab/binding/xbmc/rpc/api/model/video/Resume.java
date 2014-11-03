package org.openhab.binding.xbmc.rpc.api.model.video;

/**
 * Video.Resume - http://kodi.wiki/view/JSON-RPC_API/v6#Video.Resume
 * 
 * @author p0w4p0ty
 * @since 1.6.0
 *
 */
public class Resume {

	private Double position;
	private Double total;
	
	/**
	 * @param position
	 * @param total
	 */
	public Resume(Double position, Double total) {
		super();
		this.position = position;
		this.total = total;
	}
	
	/**
	 * Video.Resume
	 */
	public Resume() {
		super();
	}

	
	
	/**
	 * @return the position
	 */
	public Double getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Double position) {
		this.position = position;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	
}
