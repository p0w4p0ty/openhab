package org.openhab.binding.xbmc.rpc.api.method;

import java.util.UUID;

public class Method {

	private String jsonrpc = "2.0";
	private String id = UUID.randomUUID().toString();
	
	/**
	 * 
	 */
	public Method() {
		super();
		this.id = UUID.randomUUID().toString();
	}

	/**
	 * @param jsonrpc
	 * @param id
	 */
	public Method(String jsonrpc, String id) {
		super();
		this.jsonrpc = jsonrpc;
		this.id = id;
	}

	
	
	/**
	 * @return the jsonrpc
	 */
	public String getJsonrpc() {
		return jsonrpc;
	}

	/**
	 * @param jsonrpc the jsonrpc to set
	 */
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
}
