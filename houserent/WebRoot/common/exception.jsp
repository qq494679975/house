<%@page import="com.opensymphony.xwork2.interceptor.ExceptionHolder"%>

<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	ActionContext actionContext = ActionContext.getContext();
	ValueStack stack= actionContext.getValueStack();
	ExceptionHolder o=(ExceptionHolder)stack.getRoot().get(0);
	o.getException().printStackTrace();
	String message = o.getException().getMessage();
%>
{
	"statusCode":"300",
	"message":"<%=message%>",
	"navTabId":"",
	"rel":"",
	"callbackType":"",
	"forwardUrl":"",
	"confirmMsg":""
}
