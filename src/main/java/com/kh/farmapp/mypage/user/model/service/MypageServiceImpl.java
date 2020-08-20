package com.kh.farmapp.mypage.user.model.service;

import java.util.Map;

import com.kh.farmapp.mypage.user.model.dao.MyPageDao;

import common.dto.Application;
import common.dto.Basket;
import common.dto.Order;
import common.dto.Product;
import common.dto.QuestionOneonone;
import common.dto.UserAddress;
import common.dto.UserTB;

public class MypageServiceImpl implements MyPageService{

	
	private MyPageDao mypageDto;
	
	@Override
	public int modifyUser(UserTB user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyprofile(UserTB user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int leave(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public QuestionOneonone o3List() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionOneonone o3Detail(int qNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int o3Upload(QuestionOneonone qO3) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int o3Modify(int qNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int o3Delete(int qNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Application appliActList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application appliHelpList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Basket basketList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addProduct(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order orderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product orderDetail(int orderNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAddress getAddress(UserTB user) {
		// TODO Auto-generated method stub
		return null;
	}

}
