package com.kh.farmapp.activity.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import common.dto.Application;
import common.dto.Farm;
import common.dto.FarmActivity;
import common.dto.FarmActivityFile;
import common.util.Paging;

@Repository
public class ActivityDaoImpl implements ActivityDao {

	@Override
	public List<FarmActivity> selectActivityList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FarmActivityFile> selectActivityFileList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FarmActivity selectActivityDetail(int activityNo) {
		
		// 클래스 다이어그램 용 객체 선언
		Farm farm = new Farm();
		
		return null;
	}

	@Override
	public List<Map<String, String>> selectFileWithActivity(int activityNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FarmActivity selectActivityByTitle(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> selectFileWithActivityTitle(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertApplication(Application application) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
