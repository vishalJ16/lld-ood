/**
 * 
 */
package com.navi.ledger.model;

/**
 * @author VJ
 * 7 May 2022
 */
public class Amount {

	private double value;
	private String currency;

	public Amount(){
		// amount with 0 value;
	}
	
	public Amount(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
