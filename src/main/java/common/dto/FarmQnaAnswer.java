package common.dto;

import java.util.Date;

public class FarmQnaAnswer {

	// member field
	private int farmQnaAnswerNo;
	private String title;
	private String content;
	private Date regDate;
	private int farmNo;
	private int farmerNo;
	private int farmQnaQuestionNo;

	public int getFarmQnaAnswerNo() {
		return farmQnaAnswerNo;
	}

	public void setFarmQnaAnswerNo(int farmQnaAnswerNo) {
		this.farmQnaAnswerNo = farmQnaAnswerNo;
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getFarmNo() {
		return farmNo;
	}

	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
	}

	public int getFarmerNo() {
		return farmerNo;
	}

	public void setFarmerNo(int farmerNo) {
		this.farmerNo = farmerNo;
	}

	public int getFarmQnaQuestionNo() {
		return farmQnaQuestionNo;
	}

	public void setFarmQnaQuestionNo(int farmQnaQuestionNo) {
		this.farmQnaQuestionNo = farmQnaQuestionNo;
	}

	@Override
	public String toString() {
		return "FarmQnaAnswer [farmQnaAnswerNo=" + farmQnaAnswerNo + ", title=" + title + ", content=" + content
				+ ", regDate=" + regDate + ", farmNo=" + farmNo + ", farmerNo=" + farmerNo + ", farmQnaQuestionNo="
				+ farmQnaQuestionNo + "]";
	}

}
