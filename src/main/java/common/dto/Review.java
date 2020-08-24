package common.dto;

import java.util.Date;

public class Review {

	// member field
	private int reviewNo;
	private int productNo;
	private String content;
	private int userNo;
	private int farmerNo;
	private Date regDate;
	private int reviewScore; // 나중에 double로 사용할 것인지 int 로 사용할 것인지 고민하기

	// getter(), setter()
	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
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

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
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
		return "Review [reviewNo=" + reviewNo + ", productNo=" + productNo + ", content=" + content + ", userNo="
				+ userNo + ", farmerNo=" + farmerNo + ", regDate=" + regDate + ", reviewScore=" + reviewScore + "]";
	}
}
