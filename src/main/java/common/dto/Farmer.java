package common.dto;

/**
 * 농업인 회원 DTO
 */
public class Farmer {

	// member field
	private int farmerNo;
	private String farmerId;
	private String farmerPw;
	private String name;
	private String email;
	private String phone;
	private int isConfirm;
	private int isLeave;
	private int isPause;
	private String zonecode;
	private String firstAddress;
	private String secondAddress;
	
	// getter(), setter()
	public int getFarmerNo() {
		return farmerNo;
	}
	public void setFarmerNo(int farmerNo) {
		this.farmerNo = farmerNo;
	}
	public String getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}
	public String getFarmerPw() {
		return farmerPw;
	}
	public void setFarmerPw(String farmerPw) {
		this.farmerPw = farmerPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getIsConfirm() {
		return isConfirm;
	}
	public void setIsConfirm(int isConfirm) {
		this.isConfirm = isConfirm;
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
		return "Farmer [farmerNo=" + farmerNo + ", farmerId=" + farmerId + ", farmerPw=" + farmerPw + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", isConfirm=" + isConfirm + ", isLeave=" + isLeave
				+ ", isPause=" + isPause + ", zonecode=" + zonecode + ", firstAddress=" + firstAddress
				+ ", secondAddress=" + secondAddress + "]";
	}

}
