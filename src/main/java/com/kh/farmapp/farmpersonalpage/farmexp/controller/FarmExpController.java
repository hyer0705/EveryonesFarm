package com.kh.farmapp.farmpersonalpage.farmexp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.farmpersonalpage.farmexp.model.service.FarmExpService;


@Controller
public class FarmExpController {
	
	@Autowired
	private FarmExpService farmexpService;
	
//	@RequestMapping("farmexp/farmexplist.do")
//	public ModelAndView farmexpList(
//			@RequestParam(required=false, defaultValue="1") int cPage) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//	}
	
//	@RequestMapping("farmexp/farmexpwrite.do")
//	public String farmexpWrite() {
//		return null;
//		
//	}
	
//	@RequestMapping("farmexp/farmexpmodify")
//	public void farmexpModify() {
//		
//	}
}
