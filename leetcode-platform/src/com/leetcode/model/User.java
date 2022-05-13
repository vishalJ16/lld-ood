/**
 * 
 */
package com.leetcode.model;

import java.util.List;

import com.leetcode.service.ContestService;

/**
 * @author v0j008y
 * 10 May 2022
 */
public class User {

	String id;
	String name;
	Account account;
	List<Question> problemsSolved;
	List<Submission> submissions;
	int ranking;
	int score;

	ContestService contestService;

	private static final int DEFAULT_SCORE = 1500;

	User(String name) {
		this.name = name;
		this.score = DEFAULT_SCORE;
	}

	void registerContest(String contestId) {

	}

	void joinContest(String contestId) {

	}

	void runContest(String contestId) {
		Contest contest = contestService.getById(contestId);
		contest.run();
	}
}
