package cn.ldm.action;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.ldm.bean.BaseDict;
import cn.ldm.bean.LinkMan;
import cn.ldm.service.LinkService;
import freemarker.template.utility.Execute;

public class LinkManAction extends ActionSupport implements ModelDriven<LinkMan>{
		LinkMan LinkMan = new LinkMan();
		private int currentPage = 1;
		private String name;
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
		LinkService ls;
		public String execute(){
			System.out.println(LinkMan.getLink_phone());
			ls.saveLink(LinkMan);
			return "success";
		}
		
		public String list(){
			if(name==null){
				name=(String) ActionContext.getContext().getSession().get("name");
			}
			System.out.println(name);
			System.out.println(currentPage);
			DetachedCriteria dc = DetachedCriteria.forClass(LinkMan.class);
			dc.add(Restrictions.eq("link_name", name));
			List list= ls.getList(dc,currentPage);
			ActionContext.getContext().getSession().put("list", list);
			ActionContext.getContext().getSession().put("currentPage", currentPage);
			ActionContext.getContext().getSession().put("name",name);
			System.out.println(list.size());
			return "success";
		}
	@Override
	public LinkMan getModel() {
		// TODO Auto-generated method stub
		return LinkMan;
	}
	public LinkService getLs() {
		return ls;
	}
	public void setLs(LinkService ls) {
		this.ls = ls;
	}
	
}
