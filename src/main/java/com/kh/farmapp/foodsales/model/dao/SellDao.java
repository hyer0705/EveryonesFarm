package com.kh.farmapp.foodsales.model.dao;

import java.util.List;
import java.util.Map;

import common.dto.Basket;
import common.dto.Product;
import common.dto.ProductFile;
import common.dto.ProductOption;



public interface SellDao {

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
	
	public Map<String,Object> sellfood(Product product, ProductOption productOption);

	/**
	 * 장바구니에 판매상품 담기
	 * @return
	 */
	public int addBasket();
	
	
	/**
	 * 장바구니 상품 번호 
	 * 
	 * @param sellList - 판매 목록 
	 * @return List
	 */
	
//	public int produtNo(Basket basket, Product product, ProductFile productFile);
	
	/**
	 * 장바구니 옵션 번호
	 * 
	 */
//	public int optionNo(Basket basket, Product product, ProductOption productOption);
	
}
