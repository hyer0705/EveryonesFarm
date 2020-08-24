package common.dto;

public class ProductFile {

	// member field
	private int fileNo;
	private int productNo;
	private String originName;
	private String fileRename;
	private String path;
	private int isThumbnail;

	// getter(), setter()
	public int getFileNo() {
		return fileNo;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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
		return "ProductFile [fileNo=" + fileNo + ", productNo=" + productNo + ", originName=" + originName
				+ ", fileRename=" + fileRename + ", path=" + path + ", isThumbnail=" + isThumbnail + "]";
	}
}
