package common.dto;

import java.util.Date;

// 영농일지
public class FarmingDailylog {

	// member field
	private int dailylogNo;
	private int farmerNo;
	private Date writeDate;
	private String content;
	private String workingAmount;
	private String workingTime;
	private int workingMember;
	private String workingDate;
	private String weather;
	private double rain;
	private double maxTemp;
	private double minTemp;
	
	// getter(), setter()
	public int getDailylogNo() {
		return dailylogNo;
	}
	public void setDailylogNo(int dailylogNo) {
		this.dailylogNo = dailylogNo;
	}
	public int getFarmerNo() {
		return farmerNo;
	}
	public void setFarmerNo(int farmerNo) {
		this.farmerNo = farmerNo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWorkingAmount() {
		return workingAmount;
	}
	public void setWorkingAmount(String workingAmount) {
		this.workingAmount = workingAmount;
	}
	public String getWorkingTime() {
		return workingTime;
	}
	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}
	public int getWorkingMember() {
		return workingMember;
	}
	public void setWorkingMember(int workingMember) {
		this.workingMember = workingMember;
	}
	public String getWorkingDate() {
		return workingDate;
	}
	public void setWorkingDate(String workingDate) {
		this.workingDate = workingDate;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public double getRain() {
		return rain;
	}
	public void setRain(double rain) {
		this.rain = rain;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}

	// toString()
	@Override
	public String toString() {
		return "FarmingDailylog [dailylogNo=" + dailylogNo + ", farmerNo=" + farmerNo + ", writeDate=" + writeDate
				+ ", content=" + content + ", workingAmount=" + workingAmount + ", workingTime=" + workingTime
				+ ", workingMember=" + workingMember + ", workingDate=" + workingDate + ", weather=" + weather
				+ ", rain=" + rain + ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + "]";
	}

}