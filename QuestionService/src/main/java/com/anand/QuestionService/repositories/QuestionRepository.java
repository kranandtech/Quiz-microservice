package com.anand.QuestionService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.QuestionService.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	List<Question> findByQuizId(Long quizId);

}
