package com.kh.farmapp.main.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import common.dto.Application;
import common.dto.Farm;
import common.dto.FarmNews;
import common.dto.Product;

/**
 * MainDao 를 상속받는 클래스
 * Dao 구현 클래스
 */
@Repository
public class MainDaoImpl implements MainDao {
	
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public List<Product> selectTop3SeasonalFood() {
		return null;
	}

	@Override
	public List<Farm> selectTop3Farm() {
		return null;
	}

	@Override
	public List<FarmNews> selectLatestFarmNews() {
		return null;
	}
	
	@Override
	public List<Map<String, Object>> selectTest() {
		return session.selectList("TEST.testSelect");
	}

}
