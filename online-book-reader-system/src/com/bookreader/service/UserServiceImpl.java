/**
 * 
 */
package com.bookreader.service;

import java.util.HashMap;

import com.bookreader.model.User;

/**
 * @author VJ
 * 12 May 2022 00:14:55
 */
public class UserServiceImpl implements UserService {

	HashMap<String, User> users = new HashMap<>();

	@Override
	public void addUser(User user) {
		this.users.put(user.getId(), user);
	}

	@Override
	public User getUserDetails(String userId) {
		return this.users.get(userId);
	}

}
