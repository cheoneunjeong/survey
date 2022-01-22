package com.lcomputerstudy.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lcomputerstudy.example.domain.Answer;
import com.lcomputerstudy.example.domain.Question;
import com.lcomputerstudy.example.domain.Survey;

@Mapper
public interface SurveyMapper {

	List<Survey> getsurveylist();

	void insertSurvey(Survey survey);

	void insertQuestions(Question q);

	void insertAnswers(Answer a);

	Survey getSurveyDetail(int s_num);

	List<Question> getQuestionDetail(int s_num);

	List<Answer> getAnswerDetail(int q_num);

}
