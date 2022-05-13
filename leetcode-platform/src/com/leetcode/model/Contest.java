/**
 * 
 */
package com.leetcode.model;

import java.util.Date;
import java.util.List;

import com.leetcode.service.ContestService;

/**
 * @author v0j008y
 * 10 May 2022
 */
public class Contest {

	int id;
	String name;
	String description;
	Date dateTime;
	List<Participant> participants;
	List<Question> questions;
	DifficultyLevel level;
	String creatorName;
	
	ContestService contestService;
	
	void addProblem(Question problem) {
		this.questions.add(problem);
	}
	
	void createContest(String contestName, DifficultyLevel level, String creatorName) {
		contestService.createContest(contestName, level, creatorName);
	}
	
	public void addParticipant(Participant participant) {
		this.participants.add(participant);
	}

	public void run() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DifficultyLevel getLevel() {
		return level;
	}

	public void setLevel(DifficultyLevel level) {
		this.level = level;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
}
