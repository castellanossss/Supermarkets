package model;

import java.util.Date;

public class Sale {
	private int id;
	private Date date;
	private Customer customer;
	private long discount;
	private float finalBill;
	
	public Sale(int id, Date date, Customer customer, long discount, float finalBill) {
		super();
		this.id = id;
		this.date = date;
		this.customer = customer;
		this.discount = discount;
		this.finalBill = finalBill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getDiscount() {
		return discount;
	}

	public void setDiscount(long discount) {
		this.discount = discount;
	}

	public float getFinalBill() {
		return finalBill;
	}

	public void setFinalBill(float finalBill) {
		this.finalBill = finalBill;
	}

}
