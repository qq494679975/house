package com.softxm.hs.action.common;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;
import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tuserinfo;

public class BaseWebAction extends ActionSupport implements
		ServletRequestAware, ServletContextAware, SessionAware,ServletResponseAware {
	protected ServletContext application;
	private String callbackType;
	// 结束定义提示信息
	// 分页开始
	protected int currentPage = 1;
	private String message;
	private String navTabId;
	protected PageModel pageModel;
	protected int pageSize = 10;
	protected HttpServletRequest request;
	protected Map sessionMap;
	protected HttpServletResponse response;
	// 分页结束
	// 定义提示信息
	private int statusCode = 200;

	public String getCallbackType() {
		return callbackType;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public String getMessage() {
		return message;
	}

	public String getNavTabId() {
		return navTabId;
	}

	public PageModel getPageModel() {
		return pageModel;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void keepLoginUser(Tuserinfo info) {
		sessionMap.put("LOGIN_USER", info);
	}

	public Tuserinfo findLoginUser() {
		return (Tuserinfo) sessionMap.get("LOGIN_USER");
	}
	
	public void removeUser()
	{
		sessionMap.clear();
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setServletContext(ServletContext application) {
		this.application = application;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public String success(String message, boolean isClose, String navTabId) {
		this.message = message;
		if (isClose) {
			callbackType = "closeCurrent";
		}
		this.navTabId = navTabId;
		return "center";
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
	}

}