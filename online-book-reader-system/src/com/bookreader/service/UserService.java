/**
 * 
 */
package com.bookreader.service;

import com.bookreader.model.User;

/**
 * @author VJ
 * 12 May 2022 00:14:02
 */
public interface UserService {

	public void addUser(User user);

	public User getUserDetails(String userId);
}
