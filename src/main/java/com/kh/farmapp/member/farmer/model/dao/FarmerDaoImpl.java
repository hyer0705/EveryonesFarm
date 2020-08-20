package com.kh.farmapp.member.farmer.model.dao;

import java.util.Map;

import common.dto.Farm;
import common.dto.Farmer;

public class FarmerDaoImpl implements FarmerDao{

	@Override
	public int insertFarmer(Farmer farmer) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Farmer selectFarmer(Map<String, Object> commandMap) {
		
		// 클래스 다이어그램 용 객체 선언
		Farmer farmer = new Farmer();
		Farm farm = new Farm();
		
		return null;
	}
	
	@Override
	public int findFarmerId(String farmerPhone) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int updatePw(Farmer farmer) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
