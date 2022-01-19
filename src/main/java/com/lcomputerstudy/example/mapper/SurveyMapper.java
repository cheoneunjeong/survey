package com.lcomputerstudy.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lcomputerstudy.example.domain.Survey;

@Mapper
public interface SurveyMapper {

	List<Survey> getsurveylist();

}
