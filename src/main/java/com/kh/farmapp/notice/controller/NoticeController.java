package com.kh.farmapp.notice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.farmapp.notice.model.service.NoticeService;

@Controller
public class NoticeController {

	// log 를 남기기 위한 Logger 객체
	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value = "/notice/noticelist", method = RequestMethod.GET)
	public String noticeMain() {
		return "";
	}
	
}
