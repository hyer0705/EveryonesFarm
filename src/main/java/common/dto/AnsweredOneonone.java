package common.dto;

import java.util.Date;

/**
 * 1대1문의 - 답변 DTO
 */
public class AnsweredOneonone {

	// member field
	// 답변 번호
	private int answeredNo;
	// 제목
	private String title;
	// 내용
	private String content;
	// 답변 작성자(관리자) 번호
	private int adminNo;
	// 작성날짜
	private Date regDate;
	// 질문 번호
	private int questionNo;
	// 농업인 회원의 질문인지 아닌지 확인?
	// 이 컬럼도 필요 없을 거 같음
	private int isFarmer;

	public int getAnsweredNo() {
		return answeredNo;
	}

	public void setAnsweredNo(int answeredNo) {
		this.answeredNo = answeredNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public int getIsFarmer() {
		return isFarmer;
	}

	public void setIsFarmer(int isFarmer) {
		this.isFarmer = isFarmer;
	}

	@Override
	public String toString() {
		return "AnsweredOneonone [answeredNo=" + answeredNo + ", title=" + title + ", content=" + content + ", adminNo="
				+ adminNo + ", regDate=" + regDate + ", questionNo=" + questionNo + ", isFarmer=" + isFarmer + "]";
	}

}
