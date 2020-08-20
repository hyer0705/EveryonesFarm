package com.kh.farmapp.foodsales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.foodsales.model.service.SellQuestionService;

import common.dto.Farmer;
import common.dto.Product;
import common.dto.SellQuestion;
import common.dto.UserTB;

@Controller
public class SellQuestionController {
	
	@Autowired
	private SellQuestionService sellQuestionService;

	//판매페이지 질문 목록
//	@RequestMapping
//	public ModelAndView SellQuestionList(Product product) {
//		ModelAndView mav = new ModelAndView();
//		return mav;
//	}
	
	//판매페이지 질문 세부사항
//	@RequestMapping
//	public ModelAndView SellQuestionDetail(UserTB user, Farmer farmer, Product product, SellQuestion sellQuestion) {
//		ModelAndView mav = new ModelAndView();
//		return mav;
//	}
	
	//판매페이지 글 작성
//	@RequestMapping("")
//	public String SellQuestionWrite(UserTB user) {
//		return null;
//		
//	}
	
	
}
