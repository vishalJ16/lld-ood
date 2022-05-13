/**
 * 
 */
package com.navi.ledger.command;

import java.util.Map;
import java.util.logging.Logger;

import com.navi.ledger.model.Loan;
import com.navi.ledger.model.Payment;
import com.navi.ledger.transactions.LedgerTransactionStore;

/**
 * @author VJ
 * 7 May 2022
 */
public class BalanceCommandProcessor implements CommandProcessor {

	// slf4j not there in this project
	private final Logger logger = Logger.getLogger(BalanceCommandProcessor.class.getName()); 
	
	@Override
	public void process(String[] inputs) {
//		logger.info("Started processing Balance command");
		String bankName = inputs[1];
		String borrowerName = inputs[2];
		int emiNumber = Integer.valueOf(inputs[3]);

		Loan loan = LedgerTransactionStore.getLoan(borrowerName, bankName);
//		if (loan == null) {
//			logger.error("no loan exists");
//			System.out.println("no valid loan");
//		}
		int totalAmountPaid = this.calcualteTotalAmountAfterEMI(loan, emiNumber);
		int emisLeft = getEmiRemaining(loan, emiNumber, totalAmountPaid);

		System.out.println(bankName + " | " + borrowerName + " | " + totalAmountPaid + " | " + emisLeft);
	}

	private int getEmiRemaining(Loan loan, int emiNumber, double totalAmountPaid) {
		return (int) Math.ceil((loan.getTotalLoanAmount() - totalAmountPaid) / loan.getEmiValue());
	}

	private int calcualteTotalAmountAfterEMI(Loan loan, int emiNumber) {
		int total = 0;
		Map<Integer, Payment> payments = loan.getPayments();
		for (int i = 1; i <= emiNumber; i++) {
			Payment payment = payments.get(i);
			if (payment != null) {
				total += payment.getAmount();
			}
		}
		total += loan.getEmiValue() * emiNumber;
		return total > loan.getTotalLoanAmount() ? loan.getTotalLoanAmount() : total;
	}

}
