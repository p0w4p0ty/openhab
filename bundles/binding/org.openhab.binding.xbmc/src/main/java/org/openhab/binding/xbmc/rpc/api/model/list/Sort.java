package org.openhab.binding.xbmc.rpc.api.model.list;

import org.openhab.binding.xbmc.rpc.api.model.list.sort.Method;
import org.openhab.binding.xbmc.rpc.api.model.list.sort.Order;

/**
 * List.Sort (http://kodi.wiki/view/JSON-RPC_API/v6#List.Sort)
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class Sort {

	private Order order = Order.ascending;
	private Method method = Method.none;
	private Boolean ignorearticle = null;
	
	public Sort() {
	}

	public Sort(Method method) {
		super();
		this.method = method;
	}
	
	public Sort(Order order, Method method) {
		super();
		this.order = order;
		this.method = method;
	}
	
	public Sort(Order order, Method method, boolean ignorearticle) {
		super();
		this.order = order;
		this.method = method;
		this.ignorearticle = ignorearticle;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public Boolean isIgnorearticle() {
		return ignorearticle;
	}

	public void setIgnorearticle(boolean ignorearticle) {
		this.ignorearticle = ignorearticle;
	}
	
}
