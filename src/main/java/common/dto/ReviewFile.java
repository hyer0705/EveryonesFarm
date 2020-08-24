package common.dto;

public class ReviewFile {

	// member field
	private int reviewFileNo;
	private int reviewNo;
	private String originName;
	private String fileRename;
	private String savePath;
	private int isThumbnail;

	// getter(), setter()
	public int getReviewFileNo() {
		return reviewFileNo;
	}

	public void setReviewFileNo(int reviewFileNo) {
		this.reviewFileNo = reviewFileNo;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
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
		return "ReviewFile [reviewFileNo=" + reviewFileNo + ", reviewNo=" + reviewNo + ", originName=" + originName
				+ ", fileRename=" + fileRename + ", savePath=" + savePath + ", isThumbnail=" + isThumbnail + "]";
	}
	
}
