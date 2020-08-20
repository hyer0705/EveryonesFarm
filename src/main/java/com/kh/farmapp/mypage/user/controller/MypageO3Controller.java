package com.kh.farmapp.mypage.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.mypage.user.model.service.MyPageService;

import common.dto.QuestionOneonone;

public class MypageO3Controller {
	
	private MyPageService mypageService;
	
	//일대일 문의 질문 리스트
		public ModelAndView o3List(@RequestParam(required=false, defaultValue="1") int cPage) {
			return null;
		}
		
		//일대일 문의 디테일 보기
		public String o3Detail(int qNo) {
			return "";
		}
		
		//일대일 문의 작성하기
		public ModelAndView o3Upload(QuestionOneonone qO3, HttpSession session) {
			return null;
		}
		
		//일대일 문의 수정
		public String o3Modify(int qNo , String userId
				, HttpSession session) {
			return"";
		}
		
		//일대일 문의 삭제
		public String o3Delete(int qNo, String userId
				, HttpSession session) {
			return"";
		}

}
