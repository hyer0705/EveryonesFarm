package com.kh.farmapp.foodsales.model.service;

import java.util.List;
import java.util.Map;

import common.dto.Product;
import common.dto.Review;
import common.dto.SellQuestion;
import common.dto.UserTB;

public interface SellQuestionService {

	/**
	 * 리뷰 판매 QnA 리스트 조회
	 * 
	 * @param map
	 * @return String
	 */
	public List<Map<String, Object>> sellQnAList(SellQuestion sellQuestion, Review review, UserTB user, Product product);
	
	/**
	 * 리뷰 판매 QnA 세부 사항
	 * 
	 * @param map
	 * @return String
	 */
	public Map<String, Object> sellQnADetail(SellQuestion sellQuestion, Product product);
	
	/**
	 * 리뷰 판매 QnA 작성
	 * 
	 * @return String
	 * 
	 */
	public int wirteSellQnA(SellQuestion sellQuestion, UserTB user);
	
	/**
	 * 리뷰 판매 QnA 삭제
	 * 
	 * @return String
	 * 
	 */
	public int deleteSellQnA(SellQuestion sellQuestion);
		
}
