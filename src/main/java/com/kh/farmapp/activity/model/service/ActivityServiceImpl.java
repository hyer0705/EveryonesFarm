package com.kh.farmapp.activity.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.activity.model.dao.ActivityDao;

import common.dto.Application;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityDao activityDao;

	@Override
	public Map<String, Object> selectActivityList(int currentPage, int cntPerPage, String isHelp) {
		return null;
	}

	@Override
	public Map<String, Object> selectActivityDetail(int activityNo) {
		return null;
	}

	@Override
	public Map<String, Object> selectActivityByTitle(String isHelp, String title) {
		return null;
	}

	@Override
	public int insertApplication(Application application) {
		return 0;
	}
	
}
