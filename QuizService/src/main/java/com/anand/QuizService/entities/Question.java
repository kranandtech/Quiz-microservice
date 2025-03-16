package com.anand.QuizService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	
	private Long QuestionId;
	private String question;
	private long quizId;

}
