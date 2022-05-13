/**
 * 
 */
package com.logistics.state;

/**
 * @author VJ
 * 12 May 2022
 */
public class ShippedStateBehavior extends ConsigmentStateBehavior {

	@Override
	public void performStatusChangeAction() {
		this.sendNotification();
	}

	@Override
	public void sendNotification() {
		
	}
}
