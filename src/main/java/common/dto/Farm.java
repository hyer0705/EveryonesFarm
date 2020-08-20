package common.dto;

public class Farm {

	// member field
	private int farmNo;
	private String farmName;
	private String phone;
	private String address;
	private String introduce;
	private String farmReason;
	private String farmMind;
	private String farmSell;
	private int visit;
	private int farmerNo;

	public int getFarmNo() {
		return farmNo;
	}

	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
	}

	public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getFarmReason() {
		return farmReason;
	}

	public void setFarmReason(String farmReason) {
		this.farmReason = farmReason;
	}

	public String getFarmMind() {
		return farmMind;
	}

	public void setFarmMind(String farmMind) {
		this.farmMind = farmMind;
	}

	public String getFarmSell() {
		return farmSell;
	}

	public void setFarmSell(String farmSell) {
		this.farmSell = farmSell;
	}

	public int getVisit() {
		return visit;
	}

	public void setVisit(int visit) {
		this.visit = visit;
	}

	public int getFarmerNo() {
		return farmerNo;
	}

	public void setFarmerNo(int farmerNo) {
		this.farmerNo = farmerNo;
	}

	@Override
	public String toString() {
		return "Farm [farmNo=" + farmNo + ", farmName=" + farmName + ", phone=" + phone + ", address=" + address
				+ ", introduce=" + introduce + ", farmReason=" + farmReason + ", farmMind=" + farmMind + ", farmSell="
				+ farmSell + ", visit=" + visit + ", farmerNo=" + farmerNo + "]";
	}

}
