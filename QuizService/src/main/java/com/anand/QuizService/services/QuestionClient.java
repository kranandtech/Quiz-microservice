package com.anand.QuizService.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.anand.QuizService.entities.Question;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
	@GetMapping("/question/quiz/{quizId}")
	List<Question> getQuestionOfQuiz(@PathVariable("quizId") Long quizid);
}
