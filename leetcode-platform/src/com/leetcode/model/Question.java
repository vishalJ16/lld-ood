/**
 * 
 */
package com.leetcode.model;

import java.util.List;

import com.leetcode.utils.QuestionIdGenerator;

/**
 * @author v0j008y
 * 10 May 2022
 */
public class Question {

	String id;
	String description;
	List<TestCase> testcases;
	DifficultyLevel level;

	void createProblem(DifficultyLevel level) {
		this.id = String.valueOf(QuestionIdGenerator.generateNextId());
		this.level = level;
	}
}
