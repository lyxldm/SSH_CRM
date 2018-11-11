package cn.ldm.bean;

import java.util.List;


public class PageBean {
	private String name;
	private int currentPage = 1;
	private int pageSiZe = 3;
	private int pageCount;
	private int userCount;
	private List list;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSiZe() {
		return pageSiZe;
	}
	public void setPageSiZe(int pageSiZe) {
		this.pageSiZe = pageSiZe;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getUserCount() {
		return userCount;
	}
	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public PageBean(String name) {
		super();
		this.name = name;
	}
	public PageBean(String name, int currentPage) {
		super();
		this.name = name;
		this.currentPage = currentPage;
	}
	public PageBean() {
		super();
	}
	public PageBean(String name, int currentPage, int pageSiZe, int pageCount, int userCount, List list) {
		super();
		this.name = name;
		this.currentPage = currentPage;
		this.pageSiZe = pageSiZe;
		this.pageCount = pageCount;
		this.userCount = userCount;
		this.list = list;
	}
	
	
}
