/**
 * 
 */
package com.leetcode.service;

import java.util.List;

import com.leetcode.model.Contest;
import com.leetcode.model.DifficultyLevel;
import com.leetcode.model.User;
import com.leetcode.utils.ContestIdGenerator;

/**
 * @author v0j008y
 * 10 May 2022
 */
public class ContestServiceImpl implements ContestService {
	
	UserService userService;

	@Override
	public Contest createContest(String contestName, DifficultyLevel level, String creatorName) {
		Contest contest = new Contest();
		contest.setId(ContestIdGenerator.generateNextId());
		contest.setLevel(level);
		User user = userService.getByName(creatorName);
		contest.addParticipant(null);
		return contest;
	}

	@Override
	public List<Contest> listContests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contest> listContests(DifficultyLevel level) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attendContest(String contestId, String userName) {
		Contest contest =  this.getById(contestId);
		User user = userService.getByName(userName);
		contest.addParticipant(null);
	}

	@Override
	public Contest getById(String contestId) {
		// TODO Auto-generated method stub
		return null;
	}

}
