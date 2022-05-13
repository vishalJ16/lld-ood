/**
 * 
 */
package com.navi.ledger.command;

import com.navi.ledger.model.Loan;
import com.navi.ledger.transactions.LedgerTransactionStore;

/**
 * @author VJ
 * 7 May 2022
 */
public class PaymentCommandProcessor implements CommandProcessor {

	@Override
	public void process(String[] inputs) {
		String bankName = inputs[1];
		String borrowerName = inputs[2];
		int lumpSum = Integer.valueOf(inputs[3]);
		int emiNumber = Integer.valueOf(inputs[4]);

		Loan loan = LedgerTransactionStore.getLoan(borrowerName, bankName);
		loan.recordLumpSumPayment(lumpSum, emiNumber);
	}
}
