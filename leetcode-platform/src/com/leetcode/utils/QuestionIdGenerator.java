/**
 * 
 */
package com.leetcode.utils;

/**
 * @author v0j008y
 * 10 May 2022
 */
public class QuestionIdGenerator {

	private static int id = 0;
	
	private QuestionIdGenerator() {}
	
	public static int generateNextId() {
		id++;
		return id;
	}
}
