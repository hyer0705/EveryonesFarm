package com.kh.farmapp.admin.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.admin.model.dao.AdminOneOnOneDao;

import common.dto.AnsweredOneonone;
import common.dto.QuestionOneonone;
/**
 * AdminOneOnOneService 를 상속 받는 클래스
 * AdminOneOnOneService 구현 하는 클래스
 */
@Service
public class AdminOneOnOneServiceImpl implements AdminOneOnOneService{

	@Autowired
	private AdminOneOnOneDao adminOneOnOneDao;
	
	@Override
	public List<Map<String, Object>> selectAllUserOneOnOneList() {
		return adminOneOnOneDao.selectAllUserOneOnOneList();
	}

	@Override
	public List<Map<String, Object>> selectAllFarmerOneOnOneList() {
		return adminOneOnOneDao.selectAllFarmerOneOnOneList();
	}

	@Override
	public List<Map<String, Object>> selectUserOneOnOneByNo(QuestionOneonone qNo) {
		return adminOneOnOneDao.selectUserOneOnOneByNo(qNo);
	}

	@Override
	public List<Map<String, Object>> selectFarmerOneOnOneByNo(QuestionOneonone qNo) {
		return adminOneOnOneDao.selectFarmerOneOnOneByNo(qNo);
	}

	@Override
	public int writeAnswerToUser(AnsweredOneonone a) {
		return adminOneOnOneDao.insertAnswerToUser(a);
	}

	@Override
	public int writeAnswerToFarmer(AnsweredOneonone a) {
		return adminOneOnOneDao.insertAnswerToFarmer(a);
	}

	@Override
	public int updateAnswerToUser(AnsweredOneonone a) {
		return adminOneOnOneDao.updateAnswertToUser(a);
	}

	@Override
	public int updateAnswerToFarmer(AnsweredOneonone a) {
		return adminOneOnOneDao.updateAnswerToFarmer(a);
	}

	@Override
	public int deleteAnswerToUserByNo(AnsweredOneonone aNo) {
		return adminOneOnOneDao.deleteAnswerToUserByNo(aNo);
	}

	@Override
	public int deleteAnswerToFarmerByNo(AnsweredOneonone aNo) {
		return adminOneOnOneDao.deleteAnswerToFarmerByNo(aNo);
	}

}
