/**
 * 
 */
package com.leetcode.service;

import com.leetcode.model.User;

/**
 * @author v0j008y
 * 10 May 2022
 */
public interface UserService {
	
	User getById(String id);
	
	User getByName(String id);

}
