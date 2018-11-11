package cn.ldm.interceptor;

import java.util.Map;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import cn.ldm.bean.User;

public class LoginInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		if(user != null){
			System.out.println("已经登录");
			return invocation.invoke();
		}else{
			System.out.println("需要登录");
			return "toLogin";
		}
	}
	
}	
