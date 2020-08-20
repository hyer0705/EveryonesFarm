package com.kh.farmapp.farmpersonalpage.farmexp.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import common.dto.Farm;
import common.dto.FarmActivity;
import common.dto.FarmActivityFile;

@Repository
public class FarmExpDaoImpl implements FarmExpDao {

	@Override
	public int insertFarmExp() {
		return 0;
	}

	@Override
	public List<FarmActivity> selectFarmExpList() {
		
		// 클래스 다이어그램 용 DTO 객체 선언
		Farm farm = new Farm();
		FarmActivity farmActivity = new FarmActivity();
		FarmActivityFile faFile = new FarmActivityFile();
		
		return null;
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
