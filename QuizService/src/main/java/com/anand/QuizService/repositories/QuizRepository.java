package com.anand.QuizService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.QuizService.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
