package com.kh.farmapp.farmnews.model.service;

import java.util.List;

import common.dto.FarmNews;

/**
 * 농업 소식 페이지에 대한 Service interface
 */
public interface FarmNewsService {

	/**
	 * 모든 농업 소식 조회 요청
	 * @return List<FarmNews> - 조회 결과 반환
	 */
	public List<FarmNews> selectAllFarmNews();
}
