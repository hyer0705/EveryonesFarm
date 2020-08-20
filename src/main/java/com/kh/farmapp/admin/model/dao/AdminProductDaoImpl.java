package com.kh.farmapp.admin.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import common.dto.Farmer;
import common.dto.Product;

/**
 * AdminProductDao 을 상속 받는 클래스
 * AdminProductDao 를 구현 하는 클래스
 */
@Repository
public class AdminProductDaoImpl implements AdminProductDao{

	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<Map<String, Object>> selectAllProduct() {
		
		// 클래스 다이어그램을 위한 객체
		Product product = new Product();
		Farmer farmer = new Farmer();
		
		return null;
	}

	@Override
	public int updateProductSas(Product approve) {
		
		return 0;
	}

	@Override
	public int updateProductSasIsCancel(Product cancel) {
		
		return 0;
	}

}
