package com.kh.farmapp.mypage.farmer.model.dao;

import java.util.List;
import java.util.Map;

import common.dto.Application;
import common.dto.FarmingDailylog;
import common.dto.Order;
import common.dto.Product;
import common.dto.UserTB;
import common.util.Paging;

public interface FamerMypageDao {
	/**
	 * 영농일지 리스트
	 * @param p 페이지 수
	 * @return 리스트 목록 조회 반환
	 */
	public List<FarmingDailylog> selectDiaryList(Paging p);
	
	/**
	 * @param diary - 영농일지 등록
	 */
	public int insertDiary(FarmingDailylog diary);

	/**
	 * @param data - 영농일지 파일 등록
	 */
	public void insertFile(Map<String, String> data);
	
	/**
	 * @return 전체 판매 게시글 수
	 */
	public int selectContentCnt();
	/**
	 * @param page
	 * @return 판매 게시글 목록
	 */
	public List<Product> selectSellList(Paging p);
	/**
	 * @return 전체 영농일지 게시글 수
	 */
	public int selectContentCnt2();

	/**
	 * 영농일지 리스트
	 * @param p 페이지 수
	 */
	public List<FarmingDailylog> selectDailyList(Paging p);

	/**
	 * @return 전체 활동 내역 게시글 수
	 */
	public int selectContentCnt3();

	
	/**
	 * @param commandMap
	 * @return 유저 정보  나타내기
	 */
	public UserTB selectMember(Map<String, Object> commandMap);

	/**
	 * @param application
	 * @return 활동내역 정보 나타내기
	 */
	public Map<String, Object> applicationList(Application application);

	
	/**
	 * 
	 * @param order
	 * @return 주문 현황 리스트 나타내기 
	 */
	public String orderList(Order order);

}
