package com.kh.farmapp.findfarm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.findfarm.model.service.FindFarmService;

@Controller
public class FindFarmController {

	@Autowired
	private FindFarmService findFarmService;
	
	
	/* View 확인용 GET 메소드 */
//	@RequestMapping("findfarm/farmList.do")
//	public void farmList() {
//		
//	}

	
	/* 농장 전체 목록
	 * 
	 * 농장 전체 조회, 농장 전체 이미지 조회, 페이지네이션
	 * 
	 * */
//	@RequestMapping("findfarm/farmlist.do")
//	public ModelAndView farmList(
//			@RequestParam(required=false, defaultValue="1") int cPage) {
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//	}
	
	/* 농장 검색
	 * 
	 *  address - 지역 검색
	 *  filter - 농장명검색 또는 농장주검색(필터)
	 *  item - 사용자가 입력한 검색어
	 *  
	 *  지역 선택 여부에 따라, 필터 종류에 따라 검색
	 *  
	 *  */
//	@RequestMapping("findfarm/searchfarm.do")
//	public ModelAndView searchFarm(
//			@RequestParam(required=false, defaultValue="1") int cPage,
//			String address, String filter, String item) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//		
//	}
	
}
