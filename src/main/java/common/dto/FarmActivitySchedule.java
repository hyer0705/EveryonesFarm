package common.dto;

public class FarmActivitySchedule {

	// member field
	private int scheduleNo;
	private int activityNo;
	private String time;
	private String content;
	private String etc;
	
	// getter(), setter()
	public int getScheduleNo() {
		return scheduleNo;
	}
	public void setScheduleNo(int scheduleNo) {
		this.scheduleNo = scheduleNo;
	}
	public int getActivityNo() {
		return activityNo;
	}
	public void setActivityNo(int activityNo) {
		this.activityNo = activityNo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}

	// toString()
	@Override
	public String toString() {
		return "FarmActivitySchedule [scheduleNo=" + scheduleNo + ", activityNo=" + activityNo + ", time=" + time
				+ ", content=" + content + ", etc=" + etc + "]";
	}
}
