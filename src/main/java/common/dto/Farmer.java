package common.dto;

/**
 * 농업인 회원 DTO
 */
public class Farmer {

	// 농업인 회원 번호
	private int farmerNo;
	// 농업인 회원 아이디
	private String farmerId;
	// 농업인 회원 비밀번호
	private String farmerPw;
	// 농업인 회원 이름
	private String name;
	// 농업인 회원 이메일
	private String Email;
	// 농업인 회원 전화 번호
	private String phone;

	// 농업인 회원 승인 여부(관리자에 의해 승인됨)
	private int isConfirm;
	// 농업인 회원 탈퇴 여부
	private int isLeave;

	private int isPause;

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
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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

	@Override
	public String toString() {
		return "Farmer [farmerNo=" + farmerNo + ", farmerId=" + farmerId + ", farmerPw=" + farmerPw + ", name=" + name
				+ ", Email=" + Email + ", phone=" + phone + ", isConfirm=" + isConfirm + ", isLeave=" + isLeave
				+ ", isPause=" + isPause + "]";
	}

}
