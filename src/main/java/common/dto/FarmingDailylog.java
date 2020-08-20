package common.dto;

import java.util.Date;

// 영농일지
public class FarmingDailylog {

	private int diaryNo;
	private int userNo;
	private Date writeDate;
	private String content;
	private String workingAmount;
	private String workingTime;
	private int workingMember;
	private Date workingDate;
	private String weather;
	private int rain;
	private int maxTemp;
	private int minTemp;

	public int getDiaryNo() {
		return diaryNo;
	}

	public void setDiaryNo(int diaryNo) {
		this.diaryNo = diaryNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
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

	public Date getWorkingDate() {
		return workingDate;
	}

	public void setWorkingDate(Date workingDate) {
		this.workingDate = workingDate;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public int getRain() {
		return rain;
	}

	public void setRain(int rain) {
		this.rain = rain;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	@Override
	public String toString() {
		return "FarmingDailylog [diaryNo=" + diaryNo + ", userNo=" + userNo + ", writeDate=" + writeDate + ", content="
				+ content + ", workingAmount=" + workingAmount + ", workingTime=" + workingTime + ", workingMember="
				+ workingMember + ", workingDate=" + workingDate + ", weather=" + weather + ", rain=" + rain
				+ ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + "]";
	}

}