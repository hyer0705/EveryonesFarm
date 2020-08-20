package com.kh.farmapp.farmpersonalpage.farmQnA.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import common.dto.FarmQnAQuestion;
import common.dto.FarmQnaAnswer;
import common.dto.Farmer;
import common.dto.UserTB;

@Repository
public class FarmQnADaoImpl implements FarmQnADao {

	@Override
	public int insertFarmQnA() {
		return 0;
	}

	@Override
	public List<Map<String, Object>> selectFarmQnAList() {
		
		// 클래스 다이어그램 용 DTO 객체 선언
		UserTB user = new UserTB();
		Farmer farmer = new Farmer();
		FarmQnAQuestion fQuestion = new FarmQnAQuestion();
		FarmQnaAnswer fAnswer = new FarmQnaAnswer();
		
		return null;
	}
	@Override
	public int deleteFarmQnA() {
		return 0;
	}

}
