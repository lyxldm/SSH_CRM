package cn.ldm.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

import cn.ldm.bean.BaseDict;
import cn.ldm.service.BaseDictService;
import freemarker.template.utility.Execute;
import net.sf.json.JSONArray;

public class BaseAction extends ActionSupport{
	String dict_type_code;
	public String getDict_type_code() {
		return dict_type_code;
	}
	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}
	BaseDictService bdc;
	@Test
	public String execute() throws IOException{
		DetachedCriteria dc = DetachedCriteria.forClass(BaseDict.class);
		dc.add(Restrictions.eq("dict_type_code", dict_type_code));
		List list = bdc.getBaseDict(dc);
		String json = JSONArray.fromObject(list).toString();
		ServletActionContext.getResponse().setContentType("appplication/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(json);
		return null;
 	}
	public BaseDictService getBdc() {
		return bdc;
	}
	public void setBdc(BaseDictService bdc) {
		this.bdc = bdc;
	} 
	
}
