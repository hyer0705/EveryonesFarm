package com.kh.farmapp.farmnews.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.farmapp.farmnews.model.service.FarmNewsService;


/**
 * 농업 소식 페이지
 */
@Controller
public class FarmNewsController {

	// log 를 남기기 위한 Logger 객체
	private static final Logger logger = LoggerFactory.getLogger(FarmNewsController.class);
	
	@Autowired
	private FarmNewsService farmNewsService;

	@RequestMapping(value = "/farmnews/fnlist", method = RequestMethod.GET)
	public String farmnewsMain() {
		return "";
	}
	
}
