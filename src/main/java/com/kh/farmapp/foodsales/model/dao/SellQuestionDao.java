package com.kh.farmapp.foodsales.model.dao;

import java.util.List;
import java.util.Map;

import common.dto.Farmer;
import common.dto.Product;
import common.dto.SellQuestion;
import common.dto.UserTB;

public interface SellQuestionDao {

	/**
	 * 문의 조회
	 * 
	 * @param questionSelect - 문의 조회
	 * @return String 
	 */
	public List <Map<String,Object>> questionSelect(SellQuestion sellQuestion, Product product);
	
	
	/**
	 * 문의작성
	 * 
	 * @param questionWrite - 문의 작성
	 * @return String
	 */
	public int questionWrite(SellQuestion sellQuestion, UserTB user, Product product);
	
	/**
	 * 문의 수정
	 * 
	 * @param questionAnswer - 문의 답변
	 * @return String
	 */
	public int questionUpdate(SellQuestion sellQuestion, UserTB user, Product product);
	
	/**
	 * 문의삭제
	 * 
	 * @param questionDelete - 문의 삭제
	 * @return String
	 */
	public int questionDelete();
	
	/**
	 * 답변 조회
	 * 
	 * @param answerSelete - 답변 조회
	 * @return String 
	 */
	public int answerSelect(SellQuestion sellQuestion, UserTB user, Product product);
	
	/**
	 * 답변 작성
	 * 
	 * @param answerWrite - 답변 작성
	 * @return String 
	 */
	public int answerWrite(SellQuestion sellQuestion, UserTB user, Farmer farmer, Product product);
	
	/**
	 * 답변 수정
	 * 
	 * @param answerUpdate - 답변 수정
	 * @return String 
	 */
	public int answerUpdate(SellQuestion sellQuestion, UserTB user, Farmer farmer, Product product);
	
	/**
	 * 답변 삭제
	 * 
	 * @param answerDelte - 답변 삭제
	 * @return String 
	 */
	public int answerDelte();
	
}
