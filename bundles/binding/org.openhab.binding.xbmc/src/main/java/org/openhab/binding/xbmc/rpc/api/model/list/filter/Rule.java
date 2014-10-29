package org.openhab.binding.xbmc.rpc.api.model.list.filter;

public class Rule {

	private String value;
	private Operator operator = Operator.contains;
	
	/**
	 * @param value
	 * @param operator
	 */
	public Rule(String value, Operator operator) {
		super();
		this.value = value;
		this.operator = operator;
	}

	/**
	 * @param value
	 */
	public Rule(String value) {
		super();
		this.value = value;
	}

	/**
	 * 
	 */
	public Rule() {
		super();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	
}
