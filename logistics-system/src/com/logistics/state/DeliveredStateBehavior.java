/**
 * 
 */
package com.logistics.state;

import com.logistics.service.NotificationRequestProcessor;
import com.logistics.service.StatusChangeObservable;

/**
 * @author VJ
 * 12 May 2022
 */
public class DeliveredStateBehavior extends ConsigmentStateBehavior {

	private final NotificationRequestProcessor notificationRequestProcessor = new NotificationRequestProcessor();

	@Override
	public void sendNotification() {
		this.notificationRequestProcessor.processRequest();
	}

	@Override
	public void performStatusChangeAction() {
		this.sendNotification();
	}

	public DeliveredStateBehavior(StatusChangeObservable observable) {
		this.observable = observable;
	}

}
