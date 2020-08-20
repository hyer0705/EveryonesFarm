package com.kh.farmapp.admin.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.farmapp.admin.model.service.AdminProductService;

import common.dto.Product;

/**
 * 상품 관리 페이지 Controller
 */
@Controller
public class AdminProductController {

	// log 를 남기기 위한 Logger 객체
	private static final Logger logger = LoggerFactory.getLogger(AdminProductController.class);

	// service 객체
	@Autowired
	private AdminProductService adminProductService;
	
	// 판매 상품 신청 목록 페이지
	@RequestMapping(value = "/productadmin/productlist", method = RequestMethod.GET)
	public String adminProductList() {
		return "";
	}
	
	// 판매 상품 승인
	@RequestMapping(value = "/productadmin/approveproduct", method = RequestMethod.POST)
	public void approveProduct(Product p) {
	}
	
	// 판매 상품 보류
	@RequestMapping(value = "/productadmin/putproductonhold", method = RequestMethod.POST)
	public void putProductOnHold(Product p) {
	}
	
}
