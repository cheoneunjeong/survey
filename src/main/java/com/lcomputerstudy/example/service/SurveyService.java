package com.lcomputerstudy.example.service;

import java.util.List;

import com.lcomputerstudy.example.domain.Answer;
import com.lcomputerstudy.example.domain.Question;
import com.lcomputerstudy.example.domain.Survey;

public interface SurveyService {

	public List<Survey> getsurveylist();

	public void insertSurvey(Survey survey);

	public void insertQuestions(Question q);

	public void insertAnswers(Answer a);
}
