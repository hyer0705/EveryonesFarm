package common.dto;

public class ProductFile {

	private int fileNo;
	private int productNo;
	private String originName;
	private String fileRename;
	private String path;

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

	@Override
	public String toString() {
		return "ProductFile [fileNo=" + fileNo + ", productNo=" + productNo + ", originName=" + originName
				+ ", fileRename=" + fileRename + ", path=" + path + "]";
	}

}
