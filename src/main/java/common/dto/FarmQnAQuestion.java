package common.dto;

import java.util.Date;

public class FarmQnAQuestion {

	// member field
	private int farmQnaQuestionNo;
	private int userNo;
	private int farmerNo;
	private int farmNo;
	private String title;
	private String content;
	private Date regDate;
	private int hits;

	// getter(), setter()
	public int getFarmQnaQuestionNo() {
		return farmQnaQuestionNo;
	}

	public void setFarmQnaQuestionNo(int farmQnaQuestionNo) {
		this.farmQnaQuestionNo = farmQnaQuestionNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getFarmNo() {
		return farmNo;
	}

	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
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

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getFarmerNo() {
		return farmerNo;
	}

	public void setFarmerNo(int farmerNo) {
		this.farmerNo = farmerNo;
	}

	// toString()
	@Override
	public String toString() {
		return "FarmQnAQuestion [farmQnaQuestionNo=" + farmQnaQuestionNo + ", userNo=" + userNo + ", farmerNo="
				+ farmerNo + ", farmNo=" + farmNo + ", title=" + title + ", content=" + content + ", regDate=" + regDate
				+ ", hits=" + hits + "]";
	}
	
}
