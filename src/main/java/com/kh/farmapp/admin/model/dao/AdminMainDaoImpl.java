package com.kh.farmapp.admin.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import common.dto.Farm;
import common.dto.Farmer;
import common.dto.QuestionOneonone;
import common.dto.UserTB;

/**
 * AdminMainDao 를 상속 받는 클래스
 * AdminMainDao 를 구현 하는 클래스
 */
@Repository
public class AdminMainDaoImpl implements AdminMainDao{

	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<Map<String, Object>> selectLatestFarmerApplicationList() {
		
		// 클래스 다이어그램 용 DTO 객체
		Farmer farmer = new Farmer();
		Farm farm = new Farm();
		
		return null;
	}

	@Override
	public List<Map<String, Object>> selectLatestUserQuestionList() {
		
		// 클래스 다이어그램 용 DTO 객체
		QuestionOneonone question = new QuestionOneonone();
		UserTB questioner = new UserTB();
		
		return null;
	}

	@Override
	public List<Map<String, Object>> selectLatestFarmerQuestionList() {
		
		QuestionOneonone question = new QuestionOneonone();
		Farmer questioner = new Farmer();
		
		return null;
	}

}
