package cn.ldm.action;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.ldm.bean.BaseDict;
import cn.ldm.bean.PageBean;
import cn.ldm.bean.User;
import cn.ldm.service.UserService;
import cn.ldm.service.UserServiceImp;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	private UserService userService;
	private String name;
	private int currentPage = 1;
	private String flag;
	
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	private PageBean pageBean = new PageBean();
	List list;
	
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String saveUser(){
		userService.saveUser(user);
		return "success";
	}
	public String getCount(){
		List list = userService.getCount();
		ActionContext.getContext().put("list", list);
		return "toCount";
	}
	public String getLogin(){
		
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		dc.add(Restrictions.eq("user_name", user.getUser_name()));
		dc.add(Restrictions.eq("user_pwd", user.getUser_pwd()));
		try {
			Integer num = userService.getLogin(dc);
		} catch (Exception e) {
			// TODO: handle exception
			ActionContext.getContext().put("error", e.getMessage());
			return "error";
		}
		ActionContext.getContext().getSession().put("user", user);
		return "success"; 
	}
	public String list(){
		if(name == null){
			PageBean pageBean1 = (PageBean) ActionContext.getContext().getSession().get("pageBean");
			String name1 = pageBean1.getName();
			name=name1;
		}
		pageBean.setName(name);
		pageBean.setCurrentPage(currentPage);
		//∑÷“≥≤È—Ø
		list = userService.getList(name,(pageBean.getCurrentPage()-1)*3,3);
		pageBean.setList(list);
		pageBean.setUserCount(userService.getUserCount(name));
		if(pageBean.getUserCount()%pageBean.getPageSiZe() == 0){
			pageBean.setPageCount(pageBean.getUserCount()/pageBean.getPageSiZe());
		}else{
			pageBean.setPageCount(pageBean.getUserCount()/pageBean.getPageSiZe()+1);
		}
		ActionContext.getContext().getSession().put("list", list);
		ActionContext.getContext().getSession().put("pageBean", pageBean);
		return "toList";
	}
	
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
}
