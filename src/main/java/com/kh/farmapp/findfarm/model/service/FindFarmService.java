package com.kh.farmapp.findfarm.model.service;

import java.util.Map;

public interface FindFarmService {

	/**전체 농장 리스트 조회
	 * 
	 * @param currentPage, cntPerPage - 페이징 변수
	 * @return Map<Strint, Object> - 전체 농장 리스트, 전체 농장 파일, 페이징 정보를 담은 Map
	 */
	public Map<String, Object> selectFarmList(int currentPage, int cntPerPage);
	
	
	/**검색 결과 리스트 조회
	 * 
	 * @param currentPage, cntPerPage - 페이징 변수
	 * @param map - 검색 필터, 검색어를 담은 Map
	 * @return Map<String, Object> - 조회된 농장 리스트, 농장 파일, 페이징 정보를 담은 Map
	 */
	public Map<String, Object> selectFarmByItem(int currentPage, int cntPerPage, Map<String, String> map);
	
}
