package common.dto;

public class Basket {

	// member field
	private int userNo;
	private int isFarmer;
	private int productNo;
	private int optionNo;

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

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getOptionNo() {
		return optionNo;
	}

	public void setOptionNo(int optionNo) {
		this.optionNo = optionNo;
	}

	@Override
	public String toString() {
		return "Basket [userNo=" + userNo + ", isFarmer=" + isFarmer + ", productNo=" + productNo + ", optionNo="
				+ optionNo + "]";
	}

}
