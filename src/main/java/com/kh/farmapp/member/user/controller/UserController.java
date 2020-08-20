package com.kh.farmapp.member.user.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.farmapp.member.user.model.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//로그인 메인 창 띄우기
//	@RequestMapping
//	public String login() {
//		
//		return null;
//	}
//	
//	//일반 회원 로그인 창
//	@RequestMapping
//	public String userlogin() {
//		
//		return null;
//	}
//	
//	//회원가입 창 띄우기
//	@RequestMapping
//	public String join() {
//		return null;
//	}
//	
//	//회원가입
//	@RequestMapping("")
//	public ModelAndView joinImpl() {
//		ModelAndView mav = new ModelAndView();
//		return mav;
//	}
//	
//	//로그인
//	@RequestMapping("")
//	public String loginImpl() {
//		return null;
//	}
//	
//	//아이디 중복 체크
//	@RequestMapping("")
//	public String idCheck(String UserId) {
//		return null;
//	}
//	
//	//가입 이메일 보내기
//	@RequestMapping
//	public ModelAndView joinEmailCheck() {
//		ModelAndView mav = new ModelAndView();
//		return mav;
//	}
//	
//	//비밀번호 찾기 이메일 보내기
//	@RequestMapping
//	public ModelAndView findPwEmail() {
//		ModelAndView mav = new ModelAndView();
//		return mav;
//	}
//	
//	//로그아웃
//	public void logout(HttpSession session, HttpServletResponse response) {
//		
//	}
}
