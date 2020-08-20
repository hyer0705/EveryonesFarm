package common.dto;

import java.util.Date;

public class TBOrder {

	private int orderNo;
	private int optionNo;
	private int userNo;
	private Date orderDate;
	private int paymentStatus;
	private int paymentPrice;
	private int isFarmer;

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getOptionNo() {
		return optionNo;
	}

	public void setOptionNo(int optionNo) {
		this.optionNo = optionNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getPaymentPrice() {
		return paymentPrice;
	}

	public void setPaymentPrice(int paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

	public int getIsFarmer() {
		return isFarmer;
	}

	public void setIsFarmer(int isFarmer) {
		this.isFarmer = isFarmer;
	}

	@Override
	public String toString() {
		return "TBOrder [orderNo=" + orderNo + ", optionNo=" + optionNo + ", userNo=" + userNo + ", orderDate="
				+ orderDate + ", paymentStatus=" + paymentStatus + ", paymentPrice=" + paymentPrice + ", isFarmer="
				+ isFarmer + "]";
	}

}
