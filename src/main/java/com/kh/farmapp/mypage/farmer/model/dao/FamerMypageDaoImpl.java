package com.kh.farmapp.mypage.farmer.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import common.dto.Application;
import common.dto.FarmingDailylog;
import common.dto.Product;
import common.dto.TBOrder;
import common.dto.UserTB;
import common.util.Paging;

@Repository
public class FamerMypageDaoImpl implements FamerMypageDao {

//	@Autowired
//	SqlSessionTemplate session;

	/**
	 * 주어진 id를 이용해 회원정보 조회
	 * 
	 * @param id - 조회 대상 id
	 * @return Login - 조회된 회원 정보
	 */
//	public Login selectById(String id) {
//		return null;
//	}

	public List<FarmingDailylog> selectDiaryList(Paging p) {
//		return sqlSession.selectList("Diary.selectDiaryList", p);
		return null;
	}

	public int insertDiary(FarmingDailylog diary) {
//		return sqlSession.insert("Diary.insertNotice", diary);
		return 0;
	}

	public void insertFile(Map<String, String> map) {
//		return sqlSession.insert("Diary.insertFile", map);
	}

	public int selectContentCnt() {
//		return sqlSession.selectOne("Product.selectContentCnt");
		return 0;
	}

	public List<Product> selectSellList(Paging page) {
//		return sqlSession.selectSellList("Product.selectSellList", page);
		return null;
	}

	public int selectContentCnt2() {
//		return sqlSession.selectOne("Diary.selectContentCnt2");
		return 0;
	}

	public List<FarmingDailylog> selectDailyList(Paging p) {
//		return sqlSession.selectDailyList("Daily.selectDailyList", p);
		return null;
	}

	public int selectContentCnt3() {
//		return sqlSession.selectOne("Daily.selectContentCnt3");
		return 0;
	}

	@Override
	public UserTB selectMember(Map<String, Object> commandMap) {
		return null;
	}

	@Override
	public Map<String, Object> applicationList(Application application) {
		return null;
	}

	@Override
	public String orderList(TBOrder order) {
		// TODO Auto-generated method stub
		return null;
	}

}
