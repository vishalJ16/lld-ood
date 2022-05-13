/**
 * 
 */
package com.navi.ledger.command;

import java.util.Objects;

import com.navi.ledger.command.util.Constants;

/**
 * @author VJ
 * 7 May 2022
 */
public class CommandFactory {
	
	
	LoanCommandProcessor loanStrategy = new LoanCommandProcessor();
	BalanceCommandProcessor balanceCommandStrategy = new BalanceCommandProcessor();
	PaymentCommandProcessor paymentCommandStrategy = new PaymentCommandProcessor();
	
	public CommandProcessor getCommandProcessor(String command) {
		if(Objects.isNull(command)) {
//			log.info("null value for command");
			return null;
		}

		switch (command.toUpperCase()) {
		case Constants.LOAN:
			return loanStrategy;
		case Constants.BALANCE:
			return balanceCommandStrategy;
		case Constants.PAYMENT:
			return paymentCommandStrategy;
		default:
//			log.info("no valid input for command");
		}
		return null;
	}
}
