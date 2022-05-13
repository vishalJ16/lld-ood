/**
 * 
 */
package com.logistics.payment;

/**
 * @author VJ
 * 12 May 2022
 */
public class PaymentContext {

	private PaymentBehavior paymentBehavior;
	
	public void setPaymentBehavior(PaymentBehavior paymentBehavior) {
		this.paymentBehavior = paymentBehavior;
	}
	
	public void execute() {
		this.paymentBehavior.processPayment();
	}
}
