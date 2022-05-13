/**
 * 
 */
package com.navi.ledger.model;

/**
 * @author VJ
 * 7 May 2022
 */
public class Payment {

	private int amount;
	private int emiNumber;
	private double balanceAfterPayment;
	private int projectedEMIsLeft;

	public Payment(int amt, int emi, Loan loan) {
		this.amount = amt;
		this.emiNumber = emi;
		calculateAsOfLoanBalance(loan);
	}

	public int getAmount() {
		return amount;
	}
	
	public int getEmiNumber() {
		return this.emiNumber;
	}
	
	/**
	 * Calculates and store the loan balance as of this single payment and normal emis.
	 * @param loan
	 */
	private void calculateAsOfLoanBalance(Loan loan) {
		int amountPaidAfterThisEMI = loan.getEmiValue()*emiNumber + this.amount;
		this.balanceAfterPayment = loan.getTotalLoanAmount() - amountPaidAfterThisEMI;
		this.projectedEMIsLeft = (int)Math.ceil(this.balanceAfterPayment/loan.getEmiValue());
	}
	
	public int getProjectedEMIsLeft() {
		return projectedEMIsLeft;
	}
	
}
