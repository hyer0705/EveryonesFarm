package com.kh.farmapp.admin.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.admin.model.dao.AdminProductDao;

import common.dto.Product;

/**
 * AdminProductService 를 상속 받는 클래스
 * AdminProductService 를 구현 하는 클래스
 */
@Service
public class AdminProductServiceImpl implements AdminProductService{

	@Autowired
	private AdminProductDao adminProductDao;
	
	@Override
	public List<Map<String, Object>> selectAllProduct() {
		return adminProductDao.selectAllProduct();
	}

	@Override
	public int approveProduct(Product approve) {
		return adminProductDao.updateProductSas(approve);
	}

	@Override
	public int putProductOnHold(Product cancel) {
		return adminProductDao.updateProductSasIsCancel(cancel);
	}

}
