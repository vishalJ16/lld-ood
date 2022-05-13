/**
 * 
 */
package com.navi.ledger.transactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.navi.ledger.model.Loan;

/**
 * @author VJ
 * 7 May 2022
 */
public class LedgerTransactionStore {
	
//	private static final Map<Borrower, List<Loan>> ledgerData = new HashMap<>();
//	private static final Map<String, List<Loan>> ledgerData = new HashMap<>();
	private static final Map<String, Loan> ledgerData = new HashMap<>();
	
//	public static void addLoanToBorrower(Loan loan) {
//		String key = loan.getBorrowerName() + loan.getBankName();
//		List<Loan> loans = ledgerData.getOrDefault(key, new ArrayList<>());
//		loans.add(loan);
//		ledgerData.put(key, loans);
//	}
	
	public static void addLoanToBorrower(Loan loan) {
		String key = loan.getBorrowerName() + loan.getBankName();
		ledgerData.put(key, loan);
	}

	public static Loan getLoan(String borrower, String bank) {
		String key = borrower + bank;
		return ledgerData.get(key); 
	}
}
