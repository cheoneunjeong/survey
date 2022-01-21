package com.lcomputerstudy.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcomputerstudy.example.domain.Answer;
import com.lcomputerstudy.example.domain.Question;
import com.lcomputerstudy.example.domain.Survey;
import com.lcomputerstudy.example.mapper.SurveyMapper;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Autowired SurveyMapper surveymaper;
	
	@Override
	public List<Survey> getsurveylist() {
		// TODO Auto-generated method stub
		return surveymaper.getsurveylist();
	}

	@Override
	public void insertSurvey(Survey survey) {
		surveymaper.insertSurvey(survey);
		
	}

	@Override
	public void insertQuestions(Question q) {
		surveymaper.insertQuestions(q);
		
	}

	@Override
	public void insertAnswers(Answer a) {
		surveymaper.insertAnswers(a);
		
	}

}
