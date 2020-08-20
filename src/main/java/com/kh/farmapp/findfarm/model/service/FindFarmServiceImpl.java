package com.kh.farmapp.findfarm.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.findfarm.model.dao.FindFarmDao;

@Service
public class FindFarmServiceImpl implements FindFarmService {

	@Autowired
	private FindFarmDao findFarmDao;

	@Override
	public Map<String, Object> selectFarmList(int currentPage, int cntPerPage) {
		return null;
	}

	@Override
	public Map<String, Object> selectFarmByItem(int currentPage, int cntPerPage, Map<String, String> map) {
		return null;
	}
	
}
