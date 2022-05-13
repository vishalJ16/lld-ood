/**
 * 
 */
package com.navi.ledger.command;

import com.navi.ledger.command.util.CommonUtils;
import com.navi.ledger.model.Amount;
import com.navi.ledger.model.Loan;

/**
 * @author VJ
 * 7 May 2022
 */
public class LoanCommandProcessor implements CommandProcessor {

	@Override
	public void process(String[] inputs) {
		String bankName = inputs[1];
		String borrowerName = inputs[2];
		int principal = Integer.valueOf(inputs[3]);
//		Amount principalAmt = new Amount(principalAmt);
		int tenure = Integer.valueOf(inputs[4]);
		double rate = Double.valueOf(inputs[5]);
		
		Loan.createLoan(bankName, borrowerName, principal, tenure, rate);
	}

}
