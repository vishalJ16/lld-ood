/**
 * 
 */
package com.leetcode.service;

import java.util.List;

import com.leetcode.model.DifficultyLevel;
import com.leetcode.model.Question;

/**
 * @author v0j008y
 * 10 May 2022
 */
public interface QuestionService {

	List<Question> listQuestions();
	
	List<Question> listQuestions(DifficultyLevel level);
}
