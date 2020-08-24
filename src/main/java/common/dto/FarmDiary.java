package common.dto;

import java.util.Date;

public class FarmDiary {

	// member field
	private int dailyNo;
	private String title;
	private int hit;
	private Date enrollDate;
	private String youtubeLink;
	private String content;
	private int farmNo;

	// getter(), setter()
	public int getDailyNo() {
		return dailyNo;
	}

	public void setDailyNo(int dailyNo) {
		this.dailyNo = dailyNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getYoutubeLink() {
		return youtubeLink;
	}

	public void setYoutubeLink(String youtubeLink) {
		this.youtubeLink = youtubeLink;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getFarmNo() {
		return farmNo;
	}

	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
	}

	// toString()
	@Override
	public String toString() {
		return "FarmDiary [dailyNo=" + dailyNo + ", title=" + title + ", hit=" + hit + ", enrollDate=" + enrollDate
				+ ", youtubeLink=" + youtubeLink + ", content=" + content + ", farmNo=" + farmNo + "]";
	}

}
