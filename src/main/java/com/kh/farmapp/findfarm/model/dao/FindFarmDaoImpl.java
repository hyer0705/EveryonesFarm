package com.kh.farmapp.findfarm.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import common.dto.Farm;
import common.dto.FarmFile;
import common.util.Paging;

@Repository
public class FindFarmDaoImpl implements FindFarmDao {

	@Override
	public List<Farm> selectFarmList(Paging paging) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FarmFile> selectFarmFileList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Farm> selectFarmByItem(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
