package com.kh.farmapp.mypage.user.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.mypage.user.model.service.MyPageService;

public class MypageBasketController {

	private MyPageService mypageService;


	//장바구니 리스트 -ajax
	public ModelAndView basketList(@RequestParam(required=false, defaultValue="1") int cPage) {
		return null;
	}


	//선택된 제품들의 가격의 합을 구하는 메서드
	public String addProduct(Map<String , Object> map) {
		return null;
	}

	//구매 목록 리스트
	public ModelAndView orderList(@RequestParam(required=false, defaultValue="1") int cPage) {
		return null;
	}

	//구매 목록 리스트 상세 정보
	public String orderDetail(int orderNo) {
		return "";
	}

}
