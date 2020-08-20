package com.kh.farmapp.farmpersonalpage.farmQnA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.farmpersonalpage.farmQnA.model.service.FarmQnAService;

@Controller
public class FarmQnAController {
	
	@Autowired
	private FarmQnAService farmqnaService;
	
//	@RequestMapping("farmqna/farmqnalist.do")
//	public ModelAndView farmqnaList(
//			@RequestParam(required=false, defaultValue="1") int cPage) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//	}
	
//	@RequestMapping("farmqna/farmqnadetail.do")
//	public ModelAndView farmqnaDetail(int nIdx) {
//		
//		ModelAndView mav = new ModelAndView(); 
//		
//		return mav;
//	}
	
//	@RequestMapping("farmqna/farmqnawrite.do")
//	public String farmqnaWrite() {
//		return null;
//		
//	}
}
