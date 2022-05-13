/**
 * 
 */
package com.bookreader.model;

import com.bookreader.service.MembershipService;

/**
 * @author VJ
 * 11 May 2022 23:58:19
 */
public class User {

	public String getId() {
		return id;
	}

	String id;
	String name;
	String email;
	Book currentRead;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	void extendMembership() {
		MembershipService membershipService = new MembershipService(this);
		membershipService.extend();
	}
}
