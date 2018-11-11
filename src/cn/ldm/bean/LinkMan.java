package cn.ldm.bean;

public class LinkMan {
	private Integer link_id;
	private String link_name;
	private Integer link_phone;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getLink_id() {
		return link_id;
	}
	public void setLink_id(Integer link_id) {
		this.link_id = link_id;
	}
	public String getLink_name() {
		return link_name;
	}
	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}
	public Integer getLink_phone() {
		return link_phone;
	}
	public void setLink_phone(Integer link_phone) {
		this.link_phone = link_phone;
	}
	
}
