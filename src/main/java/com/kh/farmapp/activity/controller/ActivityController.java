package com.kh.farmapp.activity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.activity.model.service.ActivityService;

import common.dto.Application;

@Controller
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	
	/* View 확인용 GET 메소드 */
//	@RequestMapping("/activity/experienceList.do")
//	public void experienceList() {
//	}
//	
//	@RequestMapping("/activity/helpList.do")
//	public void helpList() {
//	}

	
	/**
	 * 농장체험 전체 목록 조회
	 * @param cPage - 현재 페이지
	 * @return ModelAndView - List, View
	 */
//	@RequestMapping("/activity/experiencelist.do")
//	public ModelAndView experienceList(
//			@RequestParam(required=false, defaultValue="1") int cPage) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		mav.setViewName("activity/experienceList");
//		
//		return mav;
//		
//	}

	/**
	 * 일손돕기 전체 목록 조회
	 * @param cPage - 현재 페이지
	 * @return ModelAndView - List, View
	 */
//	@RequestMapping("/activity/helplist.do")
//	public ModelAndView helpList(
//			@RequestParam(required=false, defaultValue="1") int cPage) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//		
//	}
	
	/**
	 * 농장체험 상세보기
	 * @param activityNo - 활동 번호
	 * @return ModelAndView - Activity, view
	 */
//	@RequestMapping("/activity/experiencedetail.do")
//	public ModelAndView experienceDetail(int activityNo) {
//		
//		ModelAndView mav = new ModelAndView();
//
//		return mav;
//		
//	}

	/**
	 * 일손돕기 상세보기
	 * @param activityNo - 활동 번호
	 * @return ModelAndView - Activity, view
	 */
//	@RequestMapping("/activity/helpdetail.do")
//	public ModelAndView helpDetail(int activityNo) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//		
//	}
	
	/**
	 * 활동 검색
	 * @param isHelp - 일손돕기인지 여부
	 * @param title - 활동명
	 * @return ModelAndView - List, View
	 */
//	@RequestMapping("/activity/searchactivity.do")
//	@ResponseBody
//	public ModelAndView searchActivity(String isHelp, String title) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//		
//	}
	
	/**
	 * 농장체험 신청 폼
	 * @param activityNo - 활동 번호
	 * @return ModelAndView - Activity, View
	 */
//	@RequestMapping("/activity/experienceapplicationForm.do")
//	public ModelAndView experienceApplicationForm(int activityNo) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//		
//	}

	/**
	 * 일손돕기 신청 폼
	 * @param activityNo - 활동 번호
	 * @return ModelAndView - Activity, View
	 */
//	@RequestMapping("/activity/helpapplicationForm.do")
//	public ModelAndView helpApplicationForm(int activityNo) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//		
//	}
	
	/**
	 * 활동 신청서 제출
	 * @param application - 활동 신청 정보 객체
	 * @return ModelAndView - View
	 */
//	@RequestMapping("/activity/applicationSubmit.do")
//	public ModelAndView activityApplicationSubmit(Application application) {
//		
//		ModelAndView mav = new ModelAndView();
//		
//		return mav;
//
//	}
	
	
}
