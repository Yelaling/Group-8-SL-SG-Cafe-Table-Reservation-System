package com.reserve.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booktable {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String customerName;
	private long contact;
	private int tableNo;
	private String ac;
	private int peoples;
	private String date1;
	private String time;
	
	
	public Booktable() {}


	public Booktable(int id, String customerName, long contact, int tableNo, String ac, int peoples, String date1,
			String time) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.contact = contact;
		this.tableNo = tableNo;
		this.ac = ac;
		this.peoples = peoples;
		this.date1 = date1;
		this.time = time;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public int getTableNo() {
		return tableNo;
	}


	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}


	public String getAc() {
		return ac;
	}


	public void setAc(String ac) {
		this.ac = ac;
	}


	public int getPeoples() {
		return peoples;
	}


	public void setPeoples(int peoples) {
		this.peoples = peoples;
	}


	public String getDate1() {
		return date1;
	}


	public void setDate1(String date1) {
		this.date1 = date1;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "Booktable [id=" + id + ", customerName=" + customerName + ", contact=" + contact + ", tableNo="
				+ tableNo + ", ac=" + ac + ", peoples=" + peoples + ", date1=" + date1 + ", time=" + time + "]";
	}


	
	

	}