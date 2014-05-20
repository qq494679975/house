package com.softxm.hs.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Tsenduser;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.service.SendUserService;
import com.softxm.hs.service.UserService;

public class SendUserAction extends BaseWebAction implements ModelDriven<Tsenduser> {
	private Tsenduser tsenduser = new Tsenduser();
	@Autowired
	private UserService service;
	private Tuserinfo tuserinfo;
	public Tuserinfo getTuserinfo() {
		return tuserinfo;
	}
	public void setTuserinfo(Tuserinfo tuserinfo) {
		this.tuserinfo = tuserinfo;
	}
	@Autowired
	private SendUserService sendUserService;
	private String result;
	private String message;
	public String getMessage() {
		return message;
	}
	public String getResult() {
		return result;
	}
	@Override
	public Tsenduser getModel() {
		// TODO Auto-generated method stub
		return tsenduser;
	}
	
	/**
	 * 用户登陆
	 * 
	 * @return
	 * @throws Exception
	 */
	public String userLogin() throws Exception {
		String code = (String) sessionMap.get("rand");
		if (!code.equals(tuserinfo.getCode())) {
			message = ("验证码错误");
			return LOGIN;
		}
		Tuserinfo temp = service.getUserByUserName(tuserinfo.getUiusername());
		if (temp == null) {
			message = ("用户名不存在");
			return LOGIN;
		}
		if (temp.getUiisdel().equals("1")) {
			message = ("用户名已经被删除，请联系管理员");
			return LOGIN;
		}
		if (temp.getUiislock().equals("1")) {
			message = ("应该用户出现异常，请联系管理员");
			return LOGIN;
		}
		if (!temp.getUipassword().equals(tuserinfo.getUipassword())) {
			message = ("密码错误");
			return LOGIN;
		}
		keepLoginUser(temp);
        request.getSession().setAttribute("loginroles", temp.getTroles());
		
		request.getSession().setAttribute("logintime", new java.util.Date());
		
		message = "true";
		return LOGIN;
	}
	/**
	 * 保存申请人
	 */
	public String addSendUser() throws Exception
	{
		result= sendUserService.saveSendUser(tsenduser);
		return "addSendUser";
	}
	/**
	 * 申请人列表
	 */
	public String sendUserList() throws Exception
	{
		pageModel=sendUserService.sendUserList(currentPage,pageSize,tsenduser);
		return "sendUserList";
	}
	/**
	 * 审核申请人
	 */
	public String sendUserPass()throws Exception
	{
		tsenduser.setSupasstime(new Date());
		tsenduser.setUiid(findLoginUser().getUiid());
		sendUserService.sendUserPass(tsenduser);
		return success("审核操作成功,审核立即生效",true, "oa11");
	}
	/**
	 * 查看申请单
	 */
	public String sendUserOrder()throws Exception
	{
		tsenduser=sendUserService.getSendUserOrder(tsenduser.getSuid());
		return "sendUserOrder";
	}
	/**
	 * 删除申请单
	 */
	public String deleteUserOrder()throws Exception
	{
		sendUserService.deleteSendUserOrder(tsenduser.getSuid());
		return success("删除申请单成功", false, "oa11");
	}
}
