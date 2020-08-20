package com.kh.farmapp.farmpersonalpage.farmdiary.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import common.dto.FarmDiary;


public interface FarmDiaryDao {
		
	// ** 나중에 상세 페이지 조회도 만들었으면 좋겠어요~~~
	
	//게시글 삽입 메소드
	public int insertFarmDiary();

	//게시글 목록 메소드
	public List<FarmDiary> selectFarmDiaryList();
	
	//게시글 삭제 메소드
	public int deleteFarmDiary();
	
	//게시글 수정 메소드
	public int modifyFarmDiary();
}
