/**
 * 
 */
package com.leetcode.service;

import java.util.List;

import com.leetcode.model.Contest;
import com.leetcode.model.DifficultyLevel;

/**
 * @author v0j008y
 * 10 May 2022
 */
public interface ContestService {

	Contest createContest(String contestName, DifficultyLevel level, String creatorName);
	
	List<Contest> listContests();
	
	List<Contest> listContests(DifficultyLevel level);
	
	void attendContest(String contestId, String userName);
	
	Contest getById(String contestId);
}
