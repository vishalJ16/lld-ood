/**
 * 
 */
package com.logistics.service;

import java.util.List;

import com.logistics.model.ConsignmentStatus;

/**
 * @author VJ
 * 12 May 2022
 */
public class StatusChangeObservable {

	private ConsignmentStatus status;

	private List<ConsignmentStatusChangeObserver> observers;

	public void updateStatus(ConsignmentStatus status) {
		this.status = status;
		this.notifyAllObservers();
	}

	private void notifyAllObservers() {
		this.observers.forEach(observer -> {
			observer.performStatusChangeAction();
		});
	}

	public void addObservers(ConsignmentStatusChangeObserver observer) {
		this.observers.add(observer);
	}

	public void remove(ConsignmentStatusChangeObserver observer) {
		this.observers.remove(observer);
	}

	public ConsignmentStatus getStatus() {
		return this.status;
	}
}
