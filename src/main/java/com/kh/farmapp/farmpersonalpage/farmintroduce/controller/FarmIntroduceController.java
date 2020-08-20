package com.kh.farmapp.farmpersonalpage.farmintroduce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FarmIntroduceController {
	
	@RequestMapping("farmintroduce/farmintroduceupload.do")
	public ModelAndView imgUpload() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("farmdiary/farmimg.do");
		
		return mav;
		
	}
	
	@RequestMapping("farmintroduce/farmimg.do")
	public void boardForm() {
		System.out.println("이미지 업로드 완료");

	}
}
