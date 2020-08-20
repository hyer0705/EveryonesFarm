package com.kh.farmapp.findfarm.model.dao;

import java.util.List;
import java.util.Map;

import common.dto.Farm;
import common.dto.FarmFile;
import common.util.Paging;

public interface FindFarmDao {
	
	/**전체 농장 리스트 조회
	 * 
	 * @param paging - 페이징 객체
	 * @return List<Farm> - 전체 농장 리스트
	 */
	public List<Farm> selectFarmList(Paging paging);
	
	
	/**전체 농장 파일 리스트 조회
	 * 
	 * @return List<FarmFile> - 전체 파일 리스트
	 */
	public List<FarmFile> selectFarmFileList();
	
	
	/**필터, 주소, 검색어를 통해 농장 조회
	 * 
	 * @param map - 페이징 객체, 주소, 필터, 검색어를 담은 Map
	 * @return List<Farm> - 조회된 농장 리스트
	 */
	public List<Farm> selectFarmByItem(Map<String, Object> map);
	
	

}
