package common.dto;

public class FarmDiaryFile {

	private int farmFileNo;
	private String originName;
	private String fileRename;
	private String savePath;
	private int farmDailyNo;

	public int getFarmFileNo() {
		return farmFileNo;
	}

	public void setFarmFileNo(int farmFileNo) {
		this.farmFileNo = farmFileNo;
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

	public int getFarmDailyNo() {
		return farmDailyNo;
	}

	public void setFarmDailyNo(int farmDailyNo) {
		this.farmDailyNo = farmDailyNo;
	}

	@Override
	public String toString() {
		return "FarmDiaryFile [farmFileNo=" + farmFileNo + ", originName=" + originName + ", fileRename=" + fileRename
				+ ", savePath=" + savePath + ", farmDailyNo=" + farmDailyNo + "]";
	}

}
