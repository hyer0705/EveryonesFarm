package com.kh.farmapp.farmpersonalpage.farmdiary.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.farmpersonalpage.farmdiary.model.dao.FarmDiaryDao;

@Service
public class FarmDiaryServiceImpl implements FarmDiaryService{
	
	@Autowired
	private FarmDiaryDao farmdiaryDao;

	@Override
	public Map<String, Object> selectFarmDiaryList(int currentPage, int cntPerPage) {
		return null;
	}

	@Override
	public Map<String, Object> selectFarmDiaryDetail() {
		return null;
	}

	@Override
	public int writeFarmDiary() {
		return 0;
	}

	@Override
	public int deleteFarmDiary() {
		return 0;
	}

	@Override
	public int modifyFarmDiary() {
		return 0;
	}

}
