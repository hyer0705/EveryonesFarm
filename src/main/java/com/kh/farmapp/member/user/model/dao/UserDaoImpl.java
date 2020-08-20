package com.kh.farmapp.member.user.model.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import common.dto.UserTB;

@Repository
public class UserDaoImpl implements UserDao{ 
 
	@Override
	public int insertUser(UserTB user) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public UserTB selectUser(Map<String, Object> commandMap) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int findUserId(String userPhone) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int updatePw(UserTB user) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
