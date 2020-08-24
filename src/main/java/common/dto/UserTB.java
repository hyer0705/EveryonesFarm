package common.dto;

/**
 * 일반 회원 정보 DTO
 */
public class UserTB {

	// member field
	private int userNo;
	private String userId;
	private String userPw;
	private String userName;
	private String email;
	private String phone;
	private int isLeave;
	private int isPause;
	private String zonecode;
	private String firstAddress;
	private String secondAddress;
	
	// getter(), setter()
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getIsLeave() {
		return isLeave;
	}
	public void setIsLeave(int isLeave) {
		this.isLeave = isLeave;
	}
	public int getIsPause() {
		return isPause;
	}
	public void setIsPause(int isPause) {
		this.isPause = isPause;
	}
	public String getZonecode() {
		return zonecode;
	}
	public void setZonecode(String zonecode) {
		this.zonecode = zonecode;
	}
	public String getFirstAddress() {
		return firstAddress;
	}
	public void setFirstAddress(String firstAddress) {
		this.firstAddress = firstAddress;
	}
	public String getSecondAddress() {
		return secondAddress;
	}
	public void setSecondAddress(String secondAddress) {
		this.secondAddress = secondAddress;
	}

	// toString()
	@Override
	public String toString() {
		return "UserTB [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", email=" + email + ", phone=" + phone + ", isLeave=" + isLeave + ", isPause=" + isPause
				+ ", zonecode=" + zonecode + ", firstAddress=" + firstAddress + ", secondAddress=" + secondAddress
				+ "]";
	}
}
