package com.kh.farmapp.foodsales.model.service;

import java.util.List;
import java.util.Map;

import common.dto.Basket;
import common.dto.Product;
import common.dto.ProductFile;
import common.dto.ProductOption;



public interface SellService {

	/**
	 * 판매 목록 조회
	 * 
	 * @param sellList - 판매 목록 
	 * @return List
	 */
	
	public List <Map<String,Object>> sellList(Product product);
	
	/**
	 * 판매 음식 소개
	 * 
	 * @param sellList - 판매 목록 
	 * @return List
	 */
	
	public Map<String,Object> sellfood(Product product, ProductFile productFile, ProductOption productOption);
	
	/**
	 * 장바구니 넣기
	 * @return
	 */
	public int addBasket();
	
	/**
	 * 장바구니 상품 번호 
	 * 
	 * @param sellList - 판매 목록 
	 * @return List
	 */
	
//	public int produtNo(Product product, Basket basket);
	
	/**
	 * 장바구니 옵션 번호
	 * 
	 */
//	public int optionNo(Product product, ProductOption productOption, Basket basket);
	
}
