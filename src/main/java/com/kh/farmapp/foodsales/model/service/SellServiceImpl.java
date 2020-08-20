package com.kh.farmapp.foodsales.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.foodsales.model.dao.SellDao;

import common.dto.Basket;
import common.dto.Product;
import common.dto.ProductFile;
import common.dto.ProductOption;


@Service
public class SellServiceImpl implements SellService {

	@Autowired
	private SellDao sellDao;

	@Override
	public List<Map<String, Object>> sellList(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> sellfood(Product product, ProductFile productFile, ProductOption productOption) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int addBasket() {
		// TODO Auto-generated method stub
		return sellDao.addBasket();
	}

//	@Override
//	public int produtNo(Product product, Basket basket) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int optionNo(Product product, ProductOption productOption, Basket basket) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
