/**
 * 
 */
package com.logistics.service;

import com.logistics.model.NotificationMessage;

/**
 * @author VJ
 * 12 May 2022
 */
public interface NotificationService {

	void send(NotificationMessage message);
}
