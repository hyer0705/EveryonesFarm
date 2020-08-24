package com.kh.farmapp.mypage.farmer.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import common.dto.Application;
import common.dto.FarmingDailylog;
import common.dto.TBOrder;
import common.dto.UserTB;

public interface FarmerMypageService {

	/**
	 * 회원 상세정보
	 * 
	 * @param id - 로그인 아이디
	 */
//	public Login info(String id);
	
	
	public UserTB selectMember(Map<String, Object> commandMap);
	
	/**
	 * 판매 현황 리스트 나타내기
	 * @param currentPage - 현재 페이지
	 * @param cntPerPage - 페이지당 노출할 게시글 수
	 */
	public List<Map<String,Object>> selectSellList(int currentPage, int cntPerPage);


	/**
	 * 영농 일지 리스트 나타내기
	 * @param cPage - 현재 페이지
	 * @param cntPerPage - 페이지당 노출할 게시글 수
	 */
	public List<Map<String, Object>> selectdiaryList(int cPage, int cntPerPage);



	/**
	 * @param diary 영농일지 작성
	 * @param files 파일 올리기
	 * @param root 위치
	 */
	public int insertDiary(FarmingDailylog diary, List<MultipartFile> files, String root);


	
	/**
	 * @cPage - 현재 페이지
	 * @param cntPerPage - 페이지당 노출할 게시글 수
	 */
	public List<Map<String, Object>> selectactivityList(int cPage, int cntPerPage);

	/**
	 *@param currentPage - 현재 페이지
	 * @param cntPerPage - 페이지당 노출할 게시글 수
	 * @return 활동내역 리스트
	 */
	public List<Map<String,Object>> applicationList(Application application);
	
	/**
	 * 
	 * @param order
	 * @return 주문 현황 리스트로 나타내기
	 */
	public List<Map<String, Object>> orderList(TBOrder order);
}
