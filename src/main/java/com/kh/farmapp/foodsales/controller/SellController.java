package com.kh.farmapp.foodsales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.foodsales.model.service.SellService;

import common.dto.Basket;
import common.dto.Product;
import common.dto.ProductOption;

@Controller
public class SellController {

	@Autowired
	private SellService sellService;
	
	//판매 목록 조회
//	@RequestMapping("")
//	public ModelAndView sellList(Product product, ProductOption productOption) {
//	ModelAndView mav = new ModelAndView();
//	return mav;
//			
//	}
	
	//판매 상세페이지 이동
//	@RequestMapping("")
//	public ModelAndView sellpage() {
//	ModelAndView mav = new ModelAndView();
//	return mav;
//	}
	
	//장바구니
//	@RequestMapping("")
//	public ModelAndView sellBasket(Product product, Basket basket, ProductOption productOption) {
//	ModelAndView mav = new ModelAndView();
//	return mav;
//	}
	
}
