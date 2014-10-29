package org.openhab.binding.xbmc.rpc.api.model.list.filter.rule;

import org.openhab.binding.xbmc.rpc.api.model.list.filter.Operator;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.Rule;

/**
 * List.Filter.Fields.Movies - http://kodi.wiki/view/JSON-RPC_API/v6#List.Filter.Fields.Movies
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class Movies extends Rule implements org.openhab.binding.xbmc.rpc.api.model.list.filter.Movies {

	private org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Movies _field;

	/**
	 * 
	 */
	public Movies() {
		super();
	}

	/**
	 * @param value
	 * @param operator
	 */
	public Movies(String value, Operator operator) {
		super(value, operator);
	}

	/**
	 * @param value
	 */
	public Movies(String value) {
		super(value);
	}

	/**
	 * @param value
	 * @param operator
	 * @param field
	 */
	public Movies(String value, Operator operator, org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Movies field) {
		super(value, operator);
		this._field = field;
	}
	
	/**
	 * @param value
	 * @param field
	 */
	public Movies(String value, org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Movies field) {
		super(value);
		this._field = field;
	}

	public org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Movies getField() {
		return _field;
	}

	public void setField(
			org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Movies field) {
		this._field = field;
	}
	
}
