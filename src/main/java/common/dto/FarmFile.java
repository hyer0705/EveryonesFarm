package common.dto;

public class FarmFile {

	// member field
	private int farmFileNo;
	private int farmNo;
	private String originName;
	private String fileRename;
	private String savePath;

	public int getFarmFileNo() {
		return farmFileNo;
	}

	public void setFarmFileNo(int farmFileNo) {
		this.farmFileNo = farmFileNo;
	}

	public int getFarmNo() {
		return farmNo;
	}

	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
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

	@Override
	public String toString() {
		return "FarmFile [farmFileNo=" + farmFileNo + ", farmNo=" + farmNo + ", originName=" + originName
				+ ", fileRename=" + fileRename + ", savePath=" + savePath + "]";
	}

}
