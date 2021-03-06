package common.dto;

import java.util.Date;

/**
 * 1대1문의 - 질문 DTO
 */
public class QuestionOneonone {

	// member field
	private int questionNo;
	private String title;
	private String content;
	private int userNo;
	private int farmerNo;
	private Date regDate;
	private int isAnswered;
	
	// getter(), setter()
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
	public int getFarmerNo() {
		return farmerNo;
	}
	public void setFarmerNo(int farmerNo) {
		this.farmerNo = farmerNo;
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

	// toString()
	@Override
	public String toString() {
		return "QuestionOneonone [questionNo=" + questionNo + ", title=" + title + ", content=" + content + ", userNo="
				+ userNo + ", farmerNo=" + farmerNo + ", regDate=" + regDate + ", isAnswered=" + isAnswered + "]";
	}

}
