package cn.ldm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.ldm.bean.Customer;
import cn.ldm.bean.User;
import cn.ldm.bean.Visit;
import cn.ldm.service.VisitService;
import freemarker.template.utility.Execute;

public class VisitAction extends ActionSupport implements ModelDriven<Visit>{
	Visit visit = new Visit();
	private VisitService vs;
	
	public VisitService getVs() {
		return vs;
	}
	public void setVs(VisitService vs) {
		this.vs = vs;
	}
	public String execute(){
		vs.saveVisit(visit);
		return "success";
	}
	@Override
	public Visit getModel() {
		// TODO Auto-generated method stub
		return visit;
	}
	
}
