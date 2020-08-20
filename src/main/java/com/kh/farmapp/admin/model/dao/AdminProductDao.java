package com.kh.farmapp.admin.model.dao;

import java.util.List;
import java.util.Map;

import common.dto.Product;

/**
 * 상품 관리 페이지의 Dao interface
 */
public interface AdminProductDao {

	/**
	 * 상품 관리 페이지에서 판매 상품 신청을 한 판매 상품 목록을 조회한다.
	 * 
	 * @return List<Map<String, Object>> - 조회 결과 반환
	 */
	public List<Map<String, Object>> selectAllProduct();

	/**
	 * 판매 상품의 productSas 컬럼을 update 한다.
	 * @param approve - 승인될 Product 객체
	 * @return int - update 결과
	 */
	public int updateProductSas(Product approve);

	/**
	 * 판매 상품의 productSas 컬럼을 update 한다.
	 * @param cancel - 보류(반려)될 Product 객체
	 * @return int - update 결과
	 */
	public int updateProductSasIsCancel(Product cancel);

}
