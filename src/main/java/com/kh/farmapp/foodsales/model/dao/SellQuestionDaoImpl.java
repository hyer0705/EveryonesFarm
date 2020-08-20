package com.kh.farmapp.foodsales.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import common.dto.Farmer;
import common.dto.Product;
import common.dto.SellAnswer;
import common.dto.SellQuestion;
import common.dto.UserTB;

@Repository
public class SellQuestionDaoImpl implements SellQuestionDao {

	@Override
	public List<Map<String, Object>> questionSelect(SellQuestion sellQuestion, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int questionWrite(SellQuestion sellQuestion, UserTB user, Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int questionUpdate(SellQuestion sellQuestion, UserTB user, Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int questionDelete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int answerSelect(SellQuestion sellQuestion, UserTB user, Product product) {
		
		// 클래스 다이어그램 용 DTO 객체 선언
		SellAnswer sa = new SellAnswer();
		
		return 0;
	}

	@Override
	public int answerWrite(SellQuestion sellQuestion, UserTB user, Farmer farmer, Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int answerUpdate(SellQuestion sellQuestion, UserTB user, Farmer farmer, Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int answerDelte() {
		// TODO Auto-generated method stub
		return 0;
	}

	





	
	
	
}
