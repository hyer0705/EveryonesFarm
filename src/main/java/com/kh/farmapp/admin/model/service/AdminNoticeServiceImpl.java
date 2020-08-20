package com.kh.farmapp.admin.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.farmapp.admin.model.dao.AdminNoticeDao;

import common.dto.Notice;


/**
 * AdminNoticeService 를 상속 받는 클래스
 * AdminNoticeService 를 구현 하는 클래스
 */
@Service
public class AdminNoticeServiceImpl implements AdminNoticeService {

	// dao
	@Autowired
	private AdminNoticeDao adminNoticeDao;
	
	// 공지사항 목록 조회
	@Override
	public List<Notice> selectAllNoticeList() {
		return adminNoticeDao.selectAllNoticeList();
	}

	// 자주 묻는 질문 목록 조회
	@Override
	public List<Notice> selectAllQnaList() {
		return adminNoticeDao.selectAllQnaList();
	}

	// 공지사항 번호를 통해 특정 공지사항 조회
	@Override
	public Notice selectNoticeByNoticNo(Notice noticeNo) {
		return adminNoticeDao.selectNoticeByNoticeNo(noticeNo);
	}

	// 자주 묻는 질문 번호를 통해 특정 자주 묻는 질문 조회
	@Override
	public Notice selectQnaByQnaNo(Notice qnaNo) {
		return adminNoticeDao.selectQnaByQnaNo(qnaNo);
	}

	// 공지사항 작성
	@Override
	public int writeNotice(Notice notice) {
		return adminNoticeDao.insertNotice(notice);
	}

	// 자주 묻는 질문 작성
	@Override
	public int writeQna(Notice qna) {
		return adminNoticeDao.insertQna(qna);
	}

	// 자주 묻는 질문 수정
	@Override
	public int modifyQna(Notice qna) {
		return adminNoticeDao.updateQna(qna);
	}

	// 공지사항 삭제
	@Override
	public int deleteNoticeByNoticeNo(Notice noticeNo) {
		return adminNoticeDao.deleteNoticeByNoticeNo(noticeNo);
	}

	// 자주 묻는 질문 삭제
	@Override
	public int deleteQnaByQnaNo(Notice qnaNo) {
		return adminNoticeDao.deleteQnaByQnaNo(qnaNo);
	}

}
