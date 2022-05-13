/**
 * 
 */
package com.logistics.payment;

import java.util.Objects;

/**
 * @author VJ
 * 12 May 2022
 */
public class PaymentFactory {

	PaymentBehavior cardPaymentBehavior = new CardPaymentBehavior();

	public PaymentBehavior getPaymentBehavior(String paymentType) {
		if(Objects.isNull(paymentType)) {
			return null;
		}
		PaymentBehavior paymentBehavior = null; 
		if(paymentType.equals("card")) {
			return cardPaymentBehavior;
		}
		if(paymentType.equals("upi")) {
			// return some object 
		}
		
		// log.error("no valid payment behavior");
		return paymentBehavior;
	}
}
