package common.dto;

import java.util.Date;

public class Order {

	private int orderNo;
	private int optionNo;
	private int userNo;
	private Date orderDate;
	private String paymentStatus;
	private int paymentPrice;

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", optionNo=" + optionNo + ", userNo=" + userNo + ", orderDate="
				+ orderDate + ", paymentStatus=" + paymentStatus + ", paymentPrice=" + paymentPrice + "]";
	}

	public void setter() {
	}

	public Object getter() {
		return null;
	}
}
