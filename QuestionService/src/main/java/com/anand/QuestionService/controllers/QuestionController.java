package com.anand.QuestionService.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anand.QuestionService.entities.Question;
import com.anand.QuestionService.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}
	@GetMapping
	public List<Question> get(){
		return questionService.get();
	}
	@GetMapping("/{id}")
	public Question getOne(@PathVariable("id") Long id) {
		return questionService.getOne(id);
	}
	@GetMapping("/quiz/{quizId}")
	public List<Question> findQuestionsOfquiz(@PathVariable Long quizId){
		return questionService.getQuestionsOfQuiz(quizId);
	}
}
