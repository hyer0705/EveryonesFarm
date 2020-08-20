package common.dto;

import java.util.Date;

public class ProductOption {

	// member field
	private int optionNo;
	private int productNo;
	private String name;
	private int price;
	private int amount;
	private String quality;
	private Date expirationDate;

	public int getOptionNo() {
		return optionNo;
	}

	public void setOptionNo(int optionNo) {
		this.optionNo = optionNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "ProductOption [optionNo=" + optionNo + ", productNo=" + productNo + ", name=" + name + ", price="
				+ price + ", amount=" + amount + ", quality=" + quality + ", expirationDate=" + expirationDate + "]";
	}

}
