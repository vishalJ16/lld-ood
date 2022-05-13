/**
 * 
 */
package com.navi.ledger.model;

import com.navi.ledger.command.util.BorrowerIdGenerator;

/**
 * @author VJ
 * 7 May 2022
 */
public class Borrower {

	private int id;
	private String borrowerName;
	
	public Borrower(String borrowerName) {
		this.id = BorrowerIdGenerator.generateNew();
		this.borrowerName = borrowerName;
	}
	
	
	public int getId() {
		return id;
	}

	public String getBorrowerName() {
		return borrowerName;
	}
}
