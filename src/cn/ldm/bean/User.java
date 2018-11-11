package cn.ldm.bean;

import org.junit.Test;

public class User {
	private Integer id;
	private String user_name;
	private String user_pwd;;
	private String user_phone;
	private BaseDict user_source;
	private BaseDict user_industry;
	private BaseDict user_level;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public BaseDict getUser_source() {
		return user_source;
	}
	public void setUser_source(BaseDict user_source) {
		this.user_source = user_source;
	}
	public BaseDict getUser_industry() {
		return user_industry;
	}
	public void setUser_industry(BaseDict user_industry) {
		this.user_industry = user_industry;
	}
	public BaseDict getUser_level() {
		return user_level;
	}
	public void setUser_level(BaseDict user_level) {
		this.user_level = user_level;
	}
	
}
