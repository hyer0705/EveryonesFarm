package common.dto;

public class FarmActivityFile {

	// member field
	private int activityFileNo;
	private int activityNo;
	private String originName;
	private String fileRename;
	private String savePath;
	private int isThumbnail;

	// getter(), setter()
	public int getActivityFileNo() {
		return activityFileNo;
	}

	public void setActivityFileNo(int activityFileNo) {
		this.activityFileNo = activityFileNo;
	}

	public int getActivityNo() {
		return activityNo;
	}

	public void setActivityNo(int activityNo) {
		this.activityNo = activityNo;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getFileRename() {
		return fileRename;
	}

	public void setFileRename(String fileRename) {
		this.fileRename = fileRename;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
	public int getIsThumbnail() {
		return isThumbnail;
	}

	public void setIsThumbnail(int isThumbnail) {
		this.isThumbnail = isThumbnail;
	}

	// toString()
	@Override
	public String toString() {
		return "FarmActivityFile [activityFileNo=" + activityFileNo + ", activityNo=" + activityNo + ", originName="
				+ originName + ", fileRename=" + fileRename + ", savePath=" + savePath + ", isThumbnail=" + isThumbnail
				+ "]";
	}

}
