package com.kh.farmapp.admin.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import common.dto.AnsweredOneonone;
import common.dto.Farmer;
import common.dto.QuestionOneonone;
import common.dto.UserTB;

/**
 * AdminOneOnOneDao 를 상속 받는 클래스
 * AdminOneOnOneDao 구현 하는 클래스
 */
@Repository
public class AdminOneOnOneDaoImpl implements AdminOneOnOneDao{

	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<Map<String, Object>> selectAllUserOneOnOneList() {
		
		// 클래스 다이어그램 용 객체
		QuestionOneonone q = new QuestionOneonone();
		UserTB user = new UserTB();
		
		return null;
	}

	@Override
	public List<Map<String, Object>> selectAllFarmerOneOnOneList() {

		// 클래스 다이어그램 용 객체
		QuestionOneonone q = new QuestionOneonone();
		Farmer farmer = new Farmer();
		
		return null;
	}

	@Override
	public List<Map<String, Object>> selectUserOneOnOneByNo(QuestionOneonone qNo) {
		
		// 클래스 다이어그램 용 객체
		QuestionOneonone q = new QuestionOneonone();
		AnsweredOneonone a = new AnsweredOneonone();
		UserTB user = new UserTB();
		
		return null;
	}

	@Override
	public List<Map<String, Object>> selectFarmerOneOnOneByNo(QuestionOneonone qNo) {
		
		// 클래스 다이어그램 용 객체
		QuestionOneonone q = new QuestionOneonone();
		AnsweredOneonone a = new AnsweredOneonone();
		Farmer farmer = new Farmer();
		
		return null;
	}

	@Override
	public int insertAnswerToUser(AnsweredOneonone a) {
		
		return 0;
	}

	@Override
	public int insertAnswerToFarmer(AnsweredOneonone a) {
		
		return 0;
	}

	@Override
	public int updateAnswertToUser(AnsweredOneonone a) {
		return 0;
	}

	@Override
	public int updateAnswerToFarmer(AnsweredOneonone a) {
		return 0;
	}

	@Override
	public int deleteAnswerToUserByNo(AnsweredOneonone aNo) {
		return 0;
	}

	@Override
	public int deleteAnswerToFarmerByNo(AnsweredOneonone aNo) {
		return 0;
	}
	
}
