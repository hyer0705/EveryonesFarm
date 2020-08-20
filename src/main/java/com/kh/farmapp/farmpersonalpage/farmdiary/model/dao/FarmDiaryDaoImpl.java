package com.kh.farmapp.farmpersonalpage.farmdiary.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import common.dto.FarmDiary;
import common.dto.FarmDiaryFile;
import common.dto.Farmer;

@Repository
public class FarmDiaryDaoImpl implements FarmDiaryDao {

	@Override
	public int insertFarmDiary() {
		return 0;
	}

	@Override
	public List<FarmDiary> selectFarmDiaryList() {
		
		// 클래스 다이어그램 용 DTO 객체 선언
		Farmer farmer = new Farmer();
		FarmDiary farmDiary = new FarmDiary();
		FarmDiaryFile fdFile = new FarmDiaryFile();
		
		return null;
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
