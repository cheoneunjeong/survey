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

	@Autowired SurveyMapper surveymapper;
	
	@Override
	public List<Survey> getsurveylist() {
		// TODO Auto-generated method stub
		return surveymapper.getsurveylist();
	}

	@Override
	public void insertSurvey(Survey survey) {
		surveymapper.insertSurvey(survey);
		
	}

	@Override
	public void insertQuestions(Question q) {
		surveymapper.insertQuestions(q);
		
	}

	@Override
	public void insertAnswers(Answer a) {
		surveymapper.insertAnswers(a);
		
	}

	@Override
	public Survey getSurveyDetail(int s_num) {
		// TODO Auto-generated method stub
		return surveymapper.getSurveyDetail(s_num);
	}

	@Override
	public List<Question> getQuestionDetail(int s_num) {
		// TODO Auto-generated method stub
		return surveymapper.getQuestionDetail(s_num);
	}

	@Override
	public List<Answer> getAnswerDetail(int q_num) {
		// TODO Auto-generated method stub
		return surveymapper.getAnswerDetail(q_num);
	}

}
