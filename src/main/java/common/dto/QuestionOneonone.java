package common.dto;

import java.util.Date;

/**
 * 1대1문의 - 질문 DTO
 */
public class QuestionOneonone {

	// member field
	// 질문 번호
	private int questionNo;
	// 제목
	private String title;
	// 내용
	private String content;
	// 질문자(일반인 또는 농업인 회원)
	private int userNo;
	// 작성 날짜
	private Date regDate;
	// 답변 여부(관리자가 답변했는지 여부)
	private int isAnswered;
	// 농업인 사용자 여부(농업인인지 아닌지)
	private int isFarmer;

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
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

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getIsAnswered() {
		return isAnswered;
	}

	public void setIsAnswered(int isAnswered) {
		this.isAnswered = isAnswered;
	}

	public int getIsFarmer() {
		return isFarmer;
	}

	public void setIsFarmer(int isFarmer) {
		this.isFarmer = isFarmer;
	}

	@Override
	public String toString() {
		return "QuestionOneonone [questionNo=" + questionNo + ", title=" + title + ", content=" + content + ", userNo="
				+ userNo + ", regDate=" + regDate + ", isAnswered=" + isAnswered + ", isFarmer=" + isFarmer + "]";
	}

}
