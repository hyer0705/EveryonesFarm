package com.kh.farmapp.farmpersonalpage.farmQnA.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.farmpersonalpage.farmQnA.model.dao.FarmQnADao;

@Service
public class FarmQnAServiceImpl implements FarmQnAService {
	
	@Autowired
	private FarmQnADao farmqnaDao;
	
	@Override
	public List<Map<String, Object>> selectFarmQnaList(int currentPage, int cntPerPage) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Map<String, Object> selectQnADetail() {
		return null;
	}

	@Override
	public int writeFarmQnA() {
		return 0;
	}

	@Override
	public int deleteFarmQnA() {
		return 0;
	}

}
