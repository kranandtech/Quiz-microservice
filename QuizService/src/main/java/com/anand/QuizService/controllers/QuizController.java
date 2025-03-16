package com.anand.QuizService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anand.QuizService.entities.Quiz;
import com.anand.QuizService.services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizService quizService;

	public QuizController(QuizService quizService) {
		
		this.quizService = quizService;
	}
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		System.out.println("Received Quiz Title: "+quiz.getTitle());
		return quizService.add(quiz);
	}
	@GetMapping
	public List<Quiz> get(){
		return quizService.get();
	}
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable Long id) {
		return quizService.get(id);
	}
}
