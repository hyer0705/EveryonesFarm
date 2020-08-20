package com.kh.farmapp.admin.notice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.farmapp.admin.model.service.AdminNoticeService;

import common.dto.Notice;

/**
 * 공지사항 & 자주 묻는 질문 관리 페이지
 */
@Controller
public class AdminNoticeController {

	// log 를 남기기 위한 Logger 객체
	private static final Logger logger = LoggerFactory.getLogger(AdminNoticeController.class);

	// service 객체
	@Autowired
	private AdminNoticeService adminNoticeService;
	
	// 공지사항 관리 목록 페이지
	@RequestMapping(value = "/noticeadmin/noticelist", method = RequestMethod.GET)
	public String adminNoticeList() {
		return "";
	}
	
	// 자주 묻는 질문 관리 목록 페이지
	@RequestMapping(value = "/noticeadmin/qnalist", method = RequestMethod.GET)
	public String adminQnaList() {
		return "";
	}
	
	// 공지사항 관리 공지사항 상세 페이지
	@RequestMapping(value = "/noticeadmin/noticedetail", method = RequestMethod.GET)
	public String adminNoticeDetail(Notice noticeNo) {
		return "";
	}
	
	// 자주 묻는 질문 관리 자주 묻는 질문 상세 페이지
	@RequestMapping(value = "/noticeadmin/qnadetail", method = RequestMethod.GET)
	public String adminQnaDetail(Notice qnaNo) {
		return "";
	}
	
	// 공지사항 관리 공지사항 작성 폼 페이지
	@RequestMapping(value = "/noticeadmin/writenotice", method = RequestMethod.GET)
	public void adminNoticeWrite() {
	}
	
	// 공지사항 관리 공지사항 작성
	@RequestMapping(value = "/noticeadmin/writenotice", method = RequestMethod.POST)
	public String adminNoticeWriteProc(Notice notice) {
		return "";
	}
	
	// 자주 묻는 질문 관리 자주 묻는 질문 작성 폼 페이지
	@RequestMapping(value = "/noticeadmin/writeqna", method = RequestMethod.GET)
	public void adminQnaWrite() {
	}
	
	// 자주 묻는 질문 관리 자주 묻는 질문 작성
	@RequestMapping(value = "/noticeadmin/writeqna", method = RequestMethod.POST)
	public String adminQnaWriteProc(Notice notice) {
		return "";
	}
	
	// 자주 묻는 질문 관리 자주 묻는 질문 수정 폼 페이지
	@RequestMapping(value = "/noticeadmin/modifyqna", method = RequestMethod.GET)
	public void adminQnaModify() {
	}
	
	// 자주 묻는 질문 관리 자주 묻는 질문 수정
	@RequestMapping(value = "/noticeadmin/modifyqna", method = RequestMethod.POST)
	public String adminQnaModifyProc(Notice notice) {
		return "";
	}
	
	// 공지사항 관리 공지사항 삭제
	@RequestMapping(value = "/noticeadmin/deletenotice", method = RequestMethod.POST)
	public String deleteNotice(Notice notice) {
		return "";
	}
	
	// 자주 묻는 질문 관리 자주 묻는 질문 삭제
	@RequestMapping(value = "/noticeadmin/deleteqna", method = RequestMethod.POST)
	public String deleteQna(Notice notice) {
		return "";
	}
	
}
