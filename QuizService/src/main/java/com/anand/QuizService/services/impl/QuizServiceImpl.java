package com.anand.QuizService.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.anand.QuizService.entities.Quiz;
import com.anand.QuizService.repositories.QuizRepository;
import com.anand.QuizService.services.QuestionClient;
import com.anand.QuizService.services.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	private QuizRepository quizRepository;
	
	private QuestionClient questionClient;
	

	public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
		super();
		this.quizRepository = quizRepository;
		this.questionClient = questionClient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		List<Quiz> quizzes = quizRepository.findAll();
		List<Quiz> newQuizList = quizzes.stream().map(quiz->{
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		 return newQuizList;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz quiz = quizRepository.findById(id).orElseThrow(()->new RuntimeException("Quiz not found"));
		quiz.setQuestions(questionClient.getQuestionOfQuiz(id));
		return quiz;
	}

}
