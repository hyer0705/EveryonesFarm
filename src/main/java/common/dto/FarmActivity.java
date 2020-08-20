package common.dto;

public class FarmActivity {

	private int activityNo;
	private int farmNo;
	private String sort;
	private String title;
	private String content;
	private int availNumber;
	private int price;
	private int isHelp;
	private int isApproval;

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

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
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

	public int getIsApproval() {
		return isApproval;
	}

	public void setIsApproval(int isApproval) {
		this.isApproval = isApproval;
	}

	@Override
	public String toString() {
		return "FarmActivity [activityNo=" + activityNo + ", farmNo=" + farmNo + ", sort=" + sort + ", title=" + title
				+ ", content=" + content + ", availNumber=" + availNumber + ", price=" + price + ", isHelp=" + isHelp
				+ ", isApproval=" + isApproval + "]";
	}

}
