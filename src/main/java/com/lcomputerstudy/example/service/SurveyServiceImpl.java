package com.lcomputerstudy.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
