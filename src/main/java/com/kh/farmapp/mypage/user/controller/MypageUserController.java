package com.kh.farmapp.mypage.user.controller;

import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import com.kh.farmapp.mypage.user.model.service.MyPageService;

import common.dto.UserTB;

public class MypageUserController {

	private MyPageService mypageService;

	//마이 페이지 메인으로 보내는 메서드
	public String mypage() {
		return "";
	}

	//회원 정보를 수정한다
	public String modifyPirvate(UserTB user, HttpSession session, Model model) {
		return null;
	}

	//회원 사진을 수정한다.
	public String modifyprofile(UserTB user, HttpSession session, Model model) {
		return "";
	}

	//회원 탈퇴 하는 메서드
	public String leave(HttpSession session,
			UserTB user, String userId) {
		return "";
	}




}
