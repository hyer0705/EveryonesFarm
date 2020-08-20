package com.kh.farmapp.farmpersonalpage.farmexp.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.farmpersonalpage.farmexp.model.dao.FarmExpDao;

@Service
public class FarmExpServiceImpl implements FarmExpService {
	
	@Autowired
	private FarmExpDao farmexpDao;
	
	@Override
	public List<Map<String, Object>> selectAllFarmActivityList(//현재 페이지
																int currentPage,
																//페이지당 노출할 게시굴 수
																int cntPerPag) {
		return null;
	} 	

	@Override
	public int writeFarmExp() {
		return 0;
	}
	
	@Override
	public int modifyFarmExp() {
		return 0;
	}
	
	@Override
	public int deleteFarmExp() {
		return 0;
	}

}
