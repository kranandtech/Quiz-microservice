package com.anand.QuizService.services;

import java.util.List;

import com.anand.QuizService.entities.Quiz;

public interface QuizService {
	Quiz add(Quiz quiz);
	List<Quiz> get();
	Quiz get(Long id);
}
