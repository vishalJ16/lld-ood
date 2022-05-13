/**
 * 
 */
package com.navi.ledger.command.util;

import com.navi.ledger.model.Amount;

/**
 * @author VJ
 * 7 May 2022
 */
public class CommonUtils {

	public static int calculateInterest(int principal, int years, double rate) {
		return (int) Math.ceil(principal * years * rate / 100);
	}

	public static int totalAmount(int principal, double interest) {
		return (int) Math.ceil(principal + interest);
	}

	public static int totalAmount(int principal, int years, double rate) {
		int interest = calculateInterest(principal, years, rate);
		return (int) Math.ceil(principal + interest);
	}
}
