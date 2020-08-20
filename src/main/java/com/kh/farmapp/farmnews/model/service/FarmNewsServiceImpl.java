package com.kh.farmapp.farmnews.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.farmnews.model.dao.FarmNewsDao;

import common.dto.FarmNews;
/**
 * FarmNewsService 상속 클래스
 * FarmNewsService 구현 클래스
 */
@Service
public class FarmNewsServiceImpl implements FarmNewsService{

	@Autowired
	private FarmNewsDao farmNewsDao;
	
	@Override
	public List<FarmNews> selectAllFarmNews() {
		return farmNewsDao.selectAllFarmNews();
	}

}
