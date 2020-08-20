package common.dto;

import java.util.Date;

/**
 * 판매 페이지에서 판매자와 구매자간의 문의 정보를 저장하는 DTO
 */
public class SellQuestion {

	private int sellQuestionNo;
	private int productNo;
	private String title;
	private String content;
	private Date writeDate;
	private int userNo;
	private int isFarmer;

	public int getSellQuestionNo() {
		return sellQuestionNo;
	}

	public void setSellQuestionNo(int sellQuestionNo) {
		this.sellQuestionNo = sellQuestionNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
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

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getIsFarmer() {
		return isFarmer;
	}

	public void setIsFarmer(int isFarmer) {
		this.isFarmer = isFarmer;
	}

	@Override
	public String toString() {
		return "SellQuestion [sellQuestionNo=" + sellQuestionNo + ", productNo=" + productNo + ", title=" + title
				+ ", content=" + content + ", writeDate=" + writeDate + ", userNo=" + userNo + ", isFarmer=" + isFarmer
				+ "]";
	}

}
