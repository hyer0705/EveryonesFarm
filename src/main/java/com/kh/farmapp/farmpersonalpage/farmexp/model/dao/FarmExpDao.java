package com.kh.farmapp.farmpersonalpage.farmexp.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import common.dto.FarmActivity;

public interface FarmExpDao {
	
	//게시글 삽입 
	public int insertFarmExp();
	
	//게시글 목록
	public List<FarmActivity> selectFarmExpList();
	
	//게시굴 수정 
	public int modifyFarmExp();
	
	//게시글 삭제 
	public int deleteFarmExp();
	
}
