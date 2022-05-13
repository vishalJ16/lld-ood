/**
 * 
 */
package com.navi.ledger.command.util;

/**
 * @author VJ
 * 7 May 2022
 */
public class BorrowerIdGenerator {

	private static int id = 1;
	
	public static int generateNew() {
		return id++;
	}
}
