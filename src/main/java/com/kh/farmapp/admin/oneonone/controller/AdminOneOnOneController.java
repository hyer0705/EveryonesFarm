package com.kh.farmapp.admin.oneonone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.farmapp.admin.model.service.AdminOneOnOneService;

import common.dto.AnsweredOneonone;
import common.dto.QuestionOneonone;


@Controller
public class AdminOneOnOneController {

	// log 를 남기기 위한 Logger 객체
	private static final Logger logger = LoggerFactory.getLogger(AdminOneOnOneController.class);

	// service 객체
	@Autowired
	private AdminOneOnOneService adminOneOnOneService;

	// 일반 회원 1대1 문의 목록 페이지
	@RequestMapping(value = "/oneononeadmin/uoneononelist", method = RequestMethod.GET)
	public String adminUserOneOnOneList() {
		return "";
	}
	
	// 농업인 회원 1대1 문의 목록 페이지
	@RequestMapping(value = "/oneononeadmin/foneononelist", method = RequestMethod.GET)
	public String adminFarmerOneOnOneList() {
		return "";
	}
	
	// 일반 회원 1대1 문의 상세 페이지
	@RequestMapping(value = "/oneononeadmin/uoneononedetail", method = RequestMethod.GET)
	public String adminUserOneOnOneDetail(QuestionOneonone q) {
		return "";
	}
	
	// 농업인 회원 1대1 문의 상세 페이지
	@RequestMapping(value = "/oneononeadmin/foneononedetail", method = RequestMethod.GET)
	public String adminFarmerOneOnOneDetail(QuestionOneonone q) {
		return null;
	}
	
	// 일반 회원 1대1 답변 작성 폼 페이지
	@RequestMapping(value = "/oneononeadmin/writetouser", method = RequestMethod.GET)
	public void writeAnswerToUser() {
	}
	
	// 일반 회원 1대1 답변 작성
	@RequestMapping(value = "/oneononeadmin/writetouser", method = RequestMethod.POST)
	public String writeAnswerToUserProc(AnsweredOneonone answer) {
		return "";
	}
	
	// 농업인 회원 1대1 답변 작성 폼 페이지
	@RequestMapping(value = "/oneononeadmin/writetofarmer", method = RequestMethod.GET)
	public void writeAnswerToFarmer() {
	}
	
	// 농업인 회원 1대1 답변 작성
	@RequestMapping(value = "/oneononeadmin/writetofarmer", method = RequestMethod.POST)
	public String writeAnswerToFarmerProc(AnsweredOneonone answer) {
		return "";
	}
	
	// 일반 회원 1대1 답변 수정 폼 페이지
	@RequestMapping(value = "/oneononeadmin/updatetouser", method = RequestMethod.GET)
	public void modifyAnswerToUser() {
	}
	
	// 일반 회원 1대1 답변 수정
	@RequestMapping(value = "/oneononeadmin/updatetouser", method = RequestMethod.POST)
	public String modifyAnswerToUserProc(AnsweredOneonone modifyAnswer) {
		return "";
	}
	
	// 농업인 회원 1대1 답변 수정 폼 페이지
	@RequestMapping(value = "/oneononeadmin/updatetofarmer", method = RequestMethod.GET)
	public void modifyAnswerToFarmer() {
	}
	
	// 농업인 회원 1대1 답변 수정
	@RequestMapping(value = "/oneononeadmin/updatetofarmer", method = RequestMethod.POST)
	public String modifyAnswerToFarmerProc(AnsweredOneonone modifyAnswer) {
		return "";
	}
	
	// 일반인 회원 1대1 답변 삭제
	@RequestMapping(value = "/oneononeadmin/deletetouser", method = RequestMethod.POST)
	public String deleteAnswerToUser(AnsweredOneonone deleteAnswer) {
		return "";
	}
	
	// 농업인 회원 1대1 답변 삭제
	@RequestMapping(value = "/oneononeadmin/deletetofarmer", method = RequestMethod.POST)
	public String deleteAnswerToFarmer(AnsweredOneonone deleteAnswer) {
		return "";
	}
	
}
