package org.openhab.binding.xbmc.rpc.api.model.item.details;

/**
 * Item.Details.Base http://kodi.wiki/view/JSON-RPC_API/v6#Item.Details.Base
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class Base {

	private String label;

	/**
	 * Item.Details.Base
	 * 
	 * @param label
	 */
	public Base(String label) {
		super();
		this.label = label;
	}

	/**
	 * Item.Details.Base
	 */
	public Base() {
		super();
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
}
