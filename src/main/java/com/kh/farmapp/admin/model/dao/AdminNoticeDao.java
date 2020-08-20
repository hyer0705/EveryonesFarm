package com.kh.farmapp.admin.model.dao;

import java.util.List;

import common.dto.Notice;

/**
 * 관리자 페이지 중 공지사항&자주 묻는 질문 관리 페이지의 Dao interface
 */
public interface AdminNoticeDao {

	/**
	 * 공지사항 목록 조회
	 * @return List<Notice> - 조회 결과 반환
	 */
	public List<Notice> selectAllNoticeList();

	/**
	 * 자주 묻는 질문 목록 조회
	 * @return List<Notice> - 조회 결과 반환
	 */
	public List<Notice> selectAllQnaList();

	/**
	 * 공지사항 번호를 통해 특정 공지사항 조회
	 * @param noticeNo - 조회할 공지사항 번호를 갖는 Notice 객체
	 * @return Notice - 조회 결과 반환
	 */
	public Notice selectNoticeByNoticeNo(Notice noticeNo);

	/**
	 * 자주 묻는 질문 번호를 통해 특정 자주 묻는 질문 조회
	 * @param qnaNo - 조회할 자주 묻는 질문 번호를 갖는 Notice 객체
	 * @return Notice - 조회 결과 반환
	 */
	public Notice selectQnaByQnaNo(Notice qnaNo);

	/**
	 * 공지사항 삽입
	 * @param notice - 공지사항 작성 정보를 저장하고 있는 Notice 객체
	 * @return int - 작성 결과(insert 결과)
	 */
	public int insertNotice(Notice notice);

	/**
	 * 자주 묻는 질문 삽입
	 * @param qna - 자주 묻는 질문 작성 정보를 저장하고 있는 Notice 객체
	 * @return int - 작성 결과(insert 결과)
	 */
	public int insertQna(Notice qna);

	/**
	 * 자주 묻는 질문 수정
	 * @param qna - 자주 묻는 질문의 수정 정보를 저장하고 있는 Notice 객체
	 * @return int - 수정 결과(update 결과)
	 */
	public int updateQna(Notice qna);

	/**
	 * 공지사항 삭제
	 * @param noticeNo - 공지사항 번호 정보를 갖는 Notice 객체
	 * @return int - 삭제 결과
	 */
	public int deleteNoticeByNoticeNo(Notice noticeNo);

	/**
	 * 자주 묻는 질문 삭제
	 * @param qnaNo - 자주 묻는 질문 번호 정보를 갖는 Notice 객체
	 * @return int - 삭제 결과
	 */
	public int deleteQnaByQnaNo(Notice qnaNo);


}
