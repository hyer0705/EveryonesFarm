package common.dto;

public class FarmActivity {

	// member field
	private int activityNo;
	private int farmNo;
	private String title;
	private String content;
	private int availNumber;
	private int price;
	private int isHelp;
	
	// getter(), setter()
	public int getActivityNo() {
		return activityNo;
	}
	public void setActivityNo(int activityNo) {
		this.activityNo = activityNo;
	}
	public int getFarmNo() {
		return farmNo;
	}
	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
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
	public int getAvailNumber() {
		return availNumber;
	}
	public void setAvailNumber(int availNumber) {
		this.availNumber = availNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getIsHelp() {
		return isHelp;
	}
	public void setIsHelp(int isHelp) {
		this.isHelp = isHelp;
	}

	// toString()
	@Override
	public String toString() {
		return "FarmActivity [activityNo=" + activityNo + ", farmNo=" + farmNo + ", title=" + title + ", content="
				+ content + ", availNumber=" + availNumber + ", price=" + price + ", isHelp=" + isHelp + "]";
	}
}
