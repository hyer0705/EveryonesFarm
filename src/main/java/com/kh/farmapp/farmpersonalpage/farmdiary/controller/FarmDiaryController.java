package com.kh.farmapp.farmpersonalpage.farmdiary.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.farmpersonalpage.farmdiary.model.service.FarmDiaryService;


@Controller
public class FarmDiaryController {
	
	@Autowired
	private FarmDiaryService farmdiaryService;
	
//	@RequestMapping("farmdiary/farmdiarylist.do")
//	public ModelAndView farmdiaryList() {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//	}
//	
//	@RequestMapping("farmdiary/farmdiarydetail.do")
//	public ModelAndView farmdiaryDetail() {
//		
//		ModelAndView mav = new ModelAndView(); 
//		
//		return mav;
//	}
//	
//	@RequestMapping("farmdiary/farmdiarywrite.do")
//	public String farmdiaryWrite() {
//		return null;
//		
//	}
//	
//	@RequestMapping("farmdiary/farmdiarymodify")
//	public void diaryModify() {
//		
//	}
//	
//	@RequestMapping("farmdiary/farmdiarylist.do")
//	public ModelAndView farmdiaryModify() {
//		
//		ModelAndView mav = new ModelAndView(); 
//		
//		mav.setViewName("farmdiary/farmdiarymodify");
//		
//		return null;
//		
//	}
}
