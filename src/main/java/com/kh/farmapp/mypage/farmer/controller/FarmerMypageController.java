package com.kh.farmapp.mypage.farmer.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.mypage.farmer.model.service.FarmerMypageService;

import common.dto.FarmingDailylog;


@Controller
public class FarmerMypageController {
	@Autowired
	private FarmerMypageService farmerMypageService;

	private static final Logger logger = LoggerFactory.getLogger(FarmerMypageController.class);

//	@RequestMapping(value = "/mypage")
//	public void farmermypage(HttpSession session, Model model) {
//	}

	// 상품 판매 리스트 보여주기
//	@RequestMapping(value = "/mypage/product")
//	public ModelAndView productList(@RequestParam(required = false, defaultValue = "1") int cPage) {
//		ModelAndView mav = new ModelAndView();
//		int cntPerPage = 10;
//		List<Map<String, Object>> commandMap = farmerMypageService.selectSellList(cPage, cntPerPage);
//		mav.addObject("paging", commandMap.get("paging"));
//		mav.addObject("productData", commandMap);
//		mav.setViewName("product/productList");
//		return mav;
//	}

	// 영농일지 작성 폼
//	@RequestMapping("/mypage/diaryForm")
//	public void diaryForm() { }
	
//	@RequestMapping("/mypage/diaryFormImpl")
//	public ModelAndView diaryForm(//사용자가 작성한 게시글 정보가 자동으로 매핑된다.
//			FarmingDailylog diary,
//			//파일업로드를 위한 MultipartFile객체를 만들어서
//			//리스트 담아준다.
//			@RequestParam List<MultipartFile> files
//			//ServletContext.getRealPath("/")메서드를 
//			//사용하기 위한 매개변수
//			//HttpServletRequest, HttpServletResponse, HttpSession
//			//같은 Servlet의 기본적인 객체들도 매개변수를 통해 받을 수 있다.
//			, HttpSession session
//		) {
//			ModelAndView mav = new ModelAndView();
//			String root  = session.getServletContext().getRealPath("/");
			//session에서 회원 정보를 꺼냄
//			Member seesionMember = (Member)session.getAttribute("logInInfo");
//			if(seesionMember != null) {
//				//notice 객체에 작성자 정보를 기입
//				diary.setUserId(seesionMember.getUserId());
//			}else {
//				diary.setUserId("비회원");
//			}
//			
//			farmerMypageService.insertNotice(diary, files, root);
//			mav.setViewName("board/boardForm");
//			return mav;
//	}
	
	// 영농일지 리스트 보여주기
//	@RequestMapping(value = "/mypage/diary")
//	public ModelAndView diaryList(@RequestParam(required = false, defaultValue = "1") int cPage) {
//		ModelAndView mav = new ModelAndView();
//		int cntPerPage = 10;
//		List<Map<String, Object>> commandMap = farmerMypageService.selectdiaryList(cPage, cntPerPage);
//		mav.addObject("paging", commandMap.get("paging"));
//		mav.addObject("productData", commandMap);
//		mav.setViewName("diary/diaryList");
//		return mav;
//	}

	// 활동 신청 내역 리스트
//	@RequestMapping(value = "/mypage/activity")
//	public ModelAndView activityList(@RequestParam(required = false, defaultValue = "1") int cPage) {
//		ModelAndView mav = new ModelAndView();
//		int cntPerPage = 10;
//		Map<String, Object> commandMap = farmerMypageService.selectactivityList(cPage, cntPerPage);
//		mav.addObject("paging", commandMap.get("paging"));
//		mav.addObject("activityData", commandMap);
//		mav.setViewName("activity/activityList");
//		return mav;
//	}
}
