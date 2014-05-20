package com.softxm.hs.interceptor;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Login_SecurityInterceptor implements Interceptor {
	public static final String USER = "LOGIN_USER";

	public void destroy() {

	}

	public void init() {

	}

	/**
	 * 返回值：为result的name
	 */
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		Map sessionMap = actionContext.getSession();
		if(sessionMap.get(USER)!=null){
			//继续执行其他的拦截器或者Action
			String result = actionInvocation.invoke();
			return result;
		}
		String action = actionInvocation.getProxy().getActionName();
		String methodName = actionInvocation.getProxy().getMethod();
		if(action.equals("menucrud")&&methodName.equals("getAllMenu")){
			return "login";
		}else{
			HttpServletResponse response = (HttpServletResponse) actionContext.get(StrutsStatics.HTTP_RESPONSE);
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("{\"statusCode\":\"301\",\"message\":\"您的登录已超时，请重新登录！\"}");
			out.flush();
			out.close();
			return null;
		}
	}
}
