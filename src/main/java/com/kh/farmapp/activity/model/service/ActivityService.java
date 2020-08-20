package com.kh.farmapp.activity.model.service;

import java.util.Map;

import common.dto.Application;


public interface ActivityService {

	/**
	 * 활동 목록 조회
	 * @param currentPage - 현재 페이지
	 * @param cntPerPage - 페이지당 개수
	 * @param isHelp - 일손돕기인지 여부
	 * @return Map<String, Object> - 조회한 목록, 파일, 페이징 객체를 담은 Map
	 */
	public Map<String, Object> selectActivityList(int currentPage, int cntPerPage, String isHelp);
	
	/**
	 * 활동 상세보기
	 * @param activityNo - 활동 번호
	 * @return Map<String, Object> - 활동, 파일을 담은 Map
	 */
	public Map<String, Object> selectActivityDetail(int activityNo);
	
	/**
	 * 활동명으로 활동 검색
	 * @param isHelp - 일손돕기인지 여부
	 * @param title - 활동명
	 * @return Map<String, Object> - 조회한 목록, 파일, 페이징 객체를 담은 Map
	 */
	public Map<String, Object> selectActivityByTitle(String isHelp, String title);
	
	/**
	 * 활동 신청 제출
	 * @param application - 신청 정보 객체
	 * @return int - 신청 정보 삽입 결과
	 */
	public int insertApplication(Application application);
	
}
