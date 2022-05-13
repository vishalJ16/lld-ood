/**
 * 
 */
package com.leetcode.utils;

/**
 * @author v0j008y
 * 10 May 2022
 */
public class ContestIdGenerator {

	private static int contestId = 0;

	private ContestIdGenerator() {
	}

	public static int generateNextId() {
		contestId++;
		return contestId;
	}
}
