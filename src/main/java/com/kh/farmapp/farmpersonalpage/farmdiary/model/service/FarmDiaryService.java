package com.kh.farmapp.farmpersonalpage.farmdiary.model.service;


import java.util.Map;

import org.springframework.stereotype.Service;

public interface FarmDiaryService  {
	
	//게시글 목록 조회
	public Map<String, Object> selectFarmDiaryList(//현재 페이지
													int currentPage,
													//페이지당 노출할 게시굴 수
													int cntPerPage);

	//게시물 상세 조회
	public Map<String, Object> selectFarmDiaryDetail();
	
	//글쓰기
	public int writeFarmDiary();
	
	//삭제
	public int deleteFarmDiary();
	
	//수정
	public int modifyFarmDiary();
}
