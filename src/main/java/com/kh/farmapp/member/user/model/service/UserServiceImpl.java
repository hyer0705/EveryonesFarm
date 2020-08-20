package com.kh.farmapp.member.user.model.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.member.user.model.dao.UserDao;

import common.dto.UserTB;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
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
	public void joinMailSend(UserTB user, String urlPath) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public UserTB findId(UserTB user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public UserTB findPw(UserTB user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public UserTB findUserId(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void findPwMailSend(UserTB user, String urlPath) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean updatePw(UserTB user) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
