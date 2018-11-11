package cn.ldm.bean;

import java.util.Date;

import sample.CustomerRecord;

public class Visit {
	private Integer visit_id;
	private Date visit_time;
	private Date visit_nextTime;
	private String visit_addr;
	private User user;
	private Customer customer;
	public Integer getVisit_id() {
		return visit_id;
	}
	public void setVisit_id(Integer visit_id) {
		this.visit_id = visit_id;
	}
	public Date getVisit_time() {
		return visit_time;
	}
	public void setVisit_time(Date visit_time) {
		this.visit_time = visit_time;
	}
	public Date getVisit_nextTime() {
		return visit_nextTime;
	}
	public void setVisit_nextTime(Date visit_nextTime) {
		this.visit_nextTime = visit_nextTime;
	}
	public String getVisit_addr() {
		return visit_addr;
	}
	public void setVisit_addr(String visit_addr) {
		this.visit_addr = visit_addr;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
 	 
}
