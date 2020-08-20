package com.kh.farmapp.farmpersonalpage.farmexp.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

public interface FarmExpService {

	//게시글 목록
	public List<Map<String, Object>> selectAllFarmActivityList(//현재 페이지
																int currentPage,
																//페이지당 노출할 게시굴 수
																int cntPerPag);
	
	//글쓰기
	public int writeFarmExp();
	
	//수정
	public int modifyFarmExp();
	
	//삭제
	public int deleteFarmExp();
}
