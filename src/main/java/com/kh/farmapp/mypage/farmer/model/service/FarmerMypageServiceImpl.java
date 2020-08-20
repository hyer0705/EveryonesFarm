package com.kh.farmapp.mypage.farmer.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kh.farmapp.mypage.farmer.model.dao.FamerMypageDao;

import common.dto.Application;
import common.dto.FarmingDailylog;
import common.dto.Order;
import common.dto.Product;
import common.dto.UserTB;
import common.util.FileUtil;
import common.util.Paging;

@Service
public class FarmerMypageServiceImpl implements FarmerMypageService {

	@Autowired
	private FamerMypageDao famerMypageDao;

//	@Override
//	public Login info(String id) {
//		return famerMypageDao.selectById(id);
//	}

	@Override // 판매 목록 리스트
	public List<Map<String, Object>> selectSellList(int currentPage, int cntPerPage) {
		Map<String, Object> commandMap = new HashMap<String, Object>();
		Paging p = new Paging(famerMypageDao.selectContentCnt(), currentPage, cntPerPage);
		List<Product> nlist = famerMypageDao.selectSellList(p);
		commandMap.put("nlist", nlist);
		commandMap.put("paging", p);
//		return commandMap;
		return null;
	}

	@Override // 영농일지 리스트
	public List<Map<String, Object>> selectdiaryList(int cPage, int cntPerPage) {
		Map<String, Object> commandMap = new HashMap<String, Object>();
		Paging p = new Paging(famerMypageDao.selectContentCnt2(), cPage, cntPerPage);
		List<FarmingDailylog> nlist = famerMypageDao.selectDiaryList(p);
		commandMap.put("nlist", nlist);
		commandMap.put("paging", p);
//		return commandMap;
		return null;
	}

	@Override // 영농일지 삽입
	public int insertDiary(FarmingDailylog diary, List<MultipartFile> files, String root) {
		// 사용자가 올린 게시글을 게시판 테이블에 등록
		int result = famerMypageDao.insertDiary(diary);
		// 파일 업로드를 위한 fileUtil 생성
		FileUtil fileUtil = new FileUtil();
		// 파일을 업로드하고, tb_file 테이블에 저장할 데이터를 반환
		List<Map<String, String>> filedata = fileUtil.fileUpload(files, root);
		// 사용자가 업로드한 파일의 수만큼 반복문으로 돌면서
		for (Map<String, String> data : filedata) {
			// file 테이블에 파일과 관련된 정보를 저장
			famerMypageDao.insertFile(data);
		}
		return result;
	}

	@Override // 활동 신청내역 리스트
	public List<Map<String, Object>> selectactivityList(int cPage, int cntPerPage) {
		Map<String, Object> commandMap = new HashMap<String, Object>();
		Paging p = new Paging(famerMypageDao.selectContentCnt3(), cPage, cntPerPage);
		List<FarmingDailylog> nlist = famerMypageDao.selectDailyList(p);
		commandMap.put("nlist", nlist);
		commandMap.put("paging", p);
//		return commandMap;
		return null;
	}

	@Override
	public UserTB selectMember(Map<String, Object> commandMap) {
		return famerMypageDao.selectMember(commandMap);
	}

	@Override
	public List<Map<String, Object>> applicationList(Application application) {
//		return famerMypageDao.applicationList(application);
		return null;
	}

	@Override
	public List<Map<String, Object>> orderList(Order order) {
//		return famerMypageDao.orderList(order);
		return null;
	}

}
