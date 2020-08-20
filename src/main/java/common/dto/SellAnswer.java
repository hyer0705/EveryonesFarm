package common.dto;

import java.util.Date;

// 판매자 문의 답변
public class SellAnswer {

	// member field
	private int sellAnswerNo;
	private String content;
	private Date regDate;
	private int sellQuestionNo;
	private int farmerNo;

	public int getSellAnswerNo() {
		return sellAnswerNo;
	}

	public void setSellAnswerNo(int sellAnswerNo) {
		this.sellAnswerNo = sellAnswerNo;
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

	public int getSellQuestionNo() {
		return sellQuestionNo;
	}

	public void setSellQuestionNo(int sellQuestionNo) {
		this.sellQuestionNo = sellQuestionNo;
	}

	public int getFarmerNo() {
		return farmerNo;
	}

	public void setFarmerNo(int farmerNo) {
		this.farmerNo = farmerNo;
	}

	@Override
	public String toString() {
		return "SellAnswer [sellAnswerNo=" + sellAnswerNo + ", content=" + content + ", regDate=" + regDate
				+ ", sellQuestionNo=" + sellQuestionNo + ", farmerNo=" + farmerNo + "]";
	}

}
