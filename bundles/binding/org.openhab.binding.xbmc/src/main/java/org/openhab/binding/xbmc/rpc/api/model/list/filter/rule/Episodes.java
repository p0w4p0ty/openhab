package org.openhab.binding.xbmc.rpc.api.model.list.filter.rule;

import org.openhab.binding.xbmc.rpc.api.model.list.filter.Operator;
import org.openhab.binding.xbmc.rpc.api.model.list.filter.Rule;

/**
 * List.Filter.Fields.Episodes - http://kodi.wiki/view/JSON-RPC_API/v6#List.Filter.Fields.Episodes
 * 
 * @author p0w4p0ty
 * @since 1.7.0
 *
 */
public class Episodes extends Rule implements org.openhab.binding.xbmc.rpc.api.model.list.filter.Episodes {

	private org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Episodes _field;

	/**
	 * 
	 */
	public Episodes() {
		super();
	}

	/**
	 * @param value
	 * @param operator
	 */
	public Episodes(String value, Operator operator) {
		super(value, operator);
	}

	/**
	 * @param value
	 */
	public Episodes(String value) {
		super(value);
	}

	/**
	 * @param value
	 * @param operator
	 * @param field
	 */
	public Episodes(String value, Operator operator, org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Episodes field) {
		super(value, operator);
		this._field = field;
	}
	
	/**
	 * @param value
	 * @param field
	 */
	public Episodes(String value, org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Episodes field) {
		super(value);
		this._field = field;
	}

	public org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Episodes getField() {
		return _field;
	}

	public void setField(
			org.openhab.binding.xbmc.rpc.api.model.list.filter.fields.Episodes field) {
		this._field = field;
	}
	
}
