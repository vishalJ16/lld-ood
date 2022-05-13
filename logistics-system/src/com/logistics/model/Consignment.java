/**
 * 
 */
package com.logistics.model;

import java.util.List;

/**
 * @author VJ
 * 12 May 2022
 */
public class Consignment {

	int id;
	String trackingId;
	List<Item> items;
	double price;
	Location from;
	Location to;
}
