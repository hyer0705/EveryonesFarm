package com.kh.farmapp.farmnews.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import common.dto.FarmNews;

/**
 * FarmNewsDao 상속 클래스
 * FarmNewsDao 구현 클래스
 */
@Repository
public class FarmNewsDaoImpl implements FarmNewsDao{

	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<FarmNews> selectAllFarmNews() {
		// TODO Auto-generated method stub
		return null;
	}

}
