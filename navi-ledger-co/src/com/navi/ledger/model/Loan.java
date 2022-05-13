/**
 * 
 */
package com.navi.ledger.model;

import java.util.HashMap;
import java.util.Map;

import com.navi.ledger.command.util.CommonUtils;
import com.navi.ledger.transactions.LedgerTransactionStore;

/**
 * @author VJ
 * 7 May 2022
 */
public class Loan {

	private String bankName;
	private String borrowerName;
//	private Amount principal;
	private int principal;
	private double interest;
	private int tenure;
	private double interestRate;
	private int numberOfEMIs;
	private int totalEMIsPaid;
	private int emiLeft;
//	private Amount emiValue;
	private int emiValue;
	private double totalLoanAmount;
	private double balanceAmount;
	private int lumpSum;
	Map<Integer, Payment> payments; // emiNumber-payments map

	private Loan(String bankName, String borrowerName, int principal, int tenure, double interestRate) {
		this.bankName = bankName;
		this.borrowerName = borrowerName;
		this.principal = principal;
		this.tenure = tenure;
		this.interestRate = interestRate;
		this.payments = new HashMap<>();
	}

	/**
	 * Creates a new loan with given data and stores it. Also calculates important
	 * values for this loan, such as each emiValue, totalLoanAmount, numberOfEMIs
	 * 
	 * @param bankName
	 * @param borrowerName
	 * @param principal
	 * @param tenure
	 * @param interestRate
	 * @return
	 */
	public static Loan createLoan(String bankName, String borrowerName, int principal, int tenure,
			double interestRate) {
		Loan loan = new Loan(bankName, borrowerName, principal, tenure, interestRate);
		loan.interest = CommonUtils.calculateInterest(principal, tenure, interestRate);
		loan.totalLoanAmount = loan.principal + loan.interest;
		loan.balanceAmount = loan.totalLoanAmount;
		loan.numberOfEMIs = tenure * 12;
		loan.calculateEMIValue();
		LedgerTransactionStore.addLoanToBorrower(loan);
		return loan;
	}

	private void calculateEMIValue() {
		this.emiValue = (int) Math.ceil(totalLoanAmount / numberOfEMIs);
	}

	/**
	 * Add a lumpsum payment for this loan. And updates the lumpsum amount paid for
	 * this loan.
	 * 
	 * @param amt
	 * @param emiNumber
	 */
	public void recordLumpSumPayment(int amt, int emiNumber) {
		Payment payment = new Payment(amt, emiNumber, this);
		this.payments.put(emiNumber, payment);
		this.lumpSum += amt;
	}

	public int getEmiRemaining() {
		return this.numberOfEMIs - this.totalEMIsPaid;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public int getPrincipal() {
		return principal;
	}

	public int getTenure() {
		return tenure;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public int getNumberOfEMIs() {
		return numberOfEMIs;
	}

	public void setNumberOfEMIs(int numberOfEMIs) {
		this.numberOfEMIs = numberOfEMIs;
	}

	public int getEmiValue() {
		return emiValue;
	}

	public int getTotalLoanAmount() {
		return (int) Math.ceil(totalLoanAmount);
	}

	public int getTotalEMIsPaid() {
		return totalEMIsPaid;
	}

	public int getBalanceAmount() {
		return (int) Math.ceil(balanceAmount);
	}

	public int getLumpSum() {
		return lumpSum;
	}

	public Map<Integer, Payment> getPayments() {
		return payments;
	}
}
