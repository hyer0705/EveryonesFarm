package com.kh.farmapp.farmpersonalpage.farmQnA.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


public interface FarmQnADao {
	
	//게시글 삽입
	public int insertFarmQnA();
	
	//게시글 목록
	public List<Map<String, Object>> selectFarmQnAList();
	
	//게시글 삭제
	public int deleteFarmQnA();
}
