package com.kh.farmapp.foodsales.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.foodsales.model.dao.SellQuestionDao;

import common.dto.Product;
import common.dto.Review;
import common.dto.SellQuestion;
import common.dto.UserTB;

@Service
public class SellQuestionServiceImpl implements SellQuestionService {

	@Autowired
	private SellQuestionDao sellquestionDao;

	@Override
	public List<Map<String, Object>> sellQnAList(SellQuestion sellQuestion, Review review, UserTB user, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> sellQnADetail(SellQuestion sellQuestion, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int wirteSellQnA(SellQuestion sellQuestion, UserTB user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteSellQnA(SellQuestion sellQuestion) {
		// TODO Auto-generated method stub
		return 0;
	}

}
