/**
 * 
 */
package com.logistics.state;

import com.logistics.service.ConsignmentStatusChangeObserver;
import com.logistics.service.StatusChangeObservable;

/**
 * @author VJ
 * 12 May 2022
 */
public abstract class ConsigmentStateBehavior implements ConsignmentStatusChangeObserver {

	protected StatusChangeObservable observable;

	public abstract void sendNotification();

	public void getStatus() {
		this.observable.getStatus();
	}
}
