package com.kh.farmapp.farmnews.model.dao;

import java.util.List;

import common.dto.FarmNews;

/**
 * 농업 소식 페이지에 대한 Dao Interface
 */
public interface FarmNewsDao {

	/**
	 * 모든 농업 소식 조회 한다.
	 * @return List<FarmNews> - 조회 결과 반환
	 */
	public List<FarmNews> selectAllFarmNews();

}
