/**
 * 
 */
package com.logistics.service;

import com.logistics.model.Consignment;

/**
 * @author VJ
 * 12 May 2022
 */
public interface TrackingService {

	Consignment trackById(String trackingId);
}
