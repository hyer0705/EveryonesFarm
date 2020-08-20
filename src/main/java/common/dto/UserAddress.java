package common.dto;

import java.util.Date;

/**
 * 일반 회원의 주소를 저장하는 DTO
 */
public class UserAddress {

	// 주소 번호
	private int addressNo;
	// 주소 사용 최근 날짜
	private Date recentDate;
	// 주소 사용 횟수
	private int count;
	// 첫 번째 주소
	private String firstAddress;
	// 두번째 주소(상세 주소)
	private String secondaddress;
	// 사용자 번호
	private int userNo;

	private int isFarmer;

	public int getAddressNo() {
		return addressNo;
	}

	public void setAddressNo(int addressNo) {
		this.addressNo = addressNo;
	}

	public Date getRecentDate() {
		return recentDate;
	}

	public void setRecentDate(Date recentDate) {
		this.recentDate = recentDate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getFirstAddress() {
		return firstAddress;
	}

	public void setFirstAddress(String firstAddress) {
		this.firstAddress = firstAddress;
	}

	public String getSecondaddress() {
		return secondaddress;
	}

	public void setSecondaddress(String secondaddress) {
		this.secondaddress = secondaddress;
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
		return "UserAddress [addressNo=" + addressNo + ", recentDate=" + recentDate + ", count=" + count
				+ ", firstAddress=" + firstAddress + ", secondaddress=" + secondaddress + ", userNo=" + userNo
				+ ", isFarmer=" + isFarmer + "]";
	}

}
