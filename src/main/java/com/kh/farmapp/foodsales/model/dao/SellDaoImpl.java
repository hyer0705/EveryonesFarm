package com.kh.farmapp.foodsales.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import common.dto.Basket;
import common.dto.Farmer;
import common.dto.Product;
import common.dto.ProductFile;
import common.dto.ProductOption;
import common.dto.UserTB;

@Repository
public class SellDaoImpl implements SellDao {

	@Override
	public List<Map<String, Object>> sellList(Product product) {
		
		// 클래스 다이어그램 용 DTO 선언
		ProductFile pf = new ProductFile();
		Farmer farmer = new Farmer();
		
		return null;
	}

	@Override
	public Map<String, Object> sellfood(Product product, ProductOption productOption) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int addBasket() {
		
		// 클래스 다이어그램 용 DTO 객체 선언
		UserTB u = new UserTB();
		Basket b = new Basket();
		
		return 0;
	}

//	@Override
//	public int produtNo(Basket basket, Product product, ProductFile productFile) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int optionNo(Basket basket, Product product, ProductOption productOption) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
