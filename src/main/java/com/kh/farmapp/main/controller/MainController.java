package com.kh.farmapp.main.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.farmapp.main.model.service.MainService;

@Controller
public class MainController {

	// log 를 남기기 위한 Logger 객체
	// log 는 추후에 추가하기
//	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	// Service 객체
	@Autowired
	private MainService mainService;
	
	/**
	 * '모두의 농장' 메인 홈페이지
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		// 현재날짜 불러오기
		// 캘린더 객체 선언
		Calendar current = Calendar.getInstance();
		
		// Date 를 String 으로 바꿔줄 SimpleDateFormat 객체 선언
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		// 현재 년도 값을 넣을 변수
		String currYear = sdf.format(current.getTime());
		
		// 현재 년도 뷰에 값으로 보내주기
		model.addAttribute("currYear", currYear);
		
		return "/main/index";
	}
	
}
