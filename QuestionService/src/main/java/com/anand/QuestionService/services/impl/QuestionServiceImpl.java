package com.anand.QuestionService.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anand.QuestionService.entities.Question;
import com.anand.QuestionService.repositories.QuestionRepository;
import com.anand.QuestionService.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	private QuestionRepository questionRepository;
	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
		
	}

	public QuestionServiceImpl(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public List<Question> get() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getOne(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question not found"));
	}

	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(quizId);
	}
	

}
