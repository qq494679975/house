package com.softxm.hs.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Tdictionary;
import com.softxm.hs.model.Trole;
import com.softxm.hs.model.Ttip;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.service.DictionaryService;
import com.softxm.hs.service.UserService;

public class UserAction extends BaseWebAction implements ModelDriven<Tuserinfo> {

	private Tuserinfo tuserinfo = new Tuserinfo();
	@Autowired
	private UserService service;
	@Autowired
	private DictionaryService dictionaryService;

	private Map<Long, String> familytype;
	private Map<Long, String> roles;
	private Ttip tip;
	private boolean userislive;

	// 小贴士信息
	private int noticenum;

	private int emailnum;
	/**
	 * 用户充钱
	 * @return
	 * @throws Exception
	 */
	public String addmoney() throws Exception
	{
		String message = service.addmoney(tuserinfo);
		if("充值成功".equals(message))
		{
			return success(message, true, "oa5");
		}
		return success(message, false, "oa5");
	}

	/**
	 * 删除用户
	 * 
	 * @return
	 * @throws Exception
	 */
	public String deleteUser() throws Exception {
		service.deleteUser(tuserinfo);
		return success("删除成功", false, "oa5");
	}
	/**
	 * 得到所有角色
	 */
	private void getAllRoles() {
		List<Trole> temp = service.getAllRoles();
		roles = new HashMap<Long, String>();
		for (int i = 0; i < temp.size(); i++) {
			roles.put(temp.get(i).getRid(), temp.get(i).getRname());
		}
	}

	public int getEmailnum() {
		return emailnum;
	}

	/**
	 * 得到家庭类型
	 */
	private void getfamilytype() {
		List<Tdictionary> tdictionars = dictionaryService.getFamilyDic();
		familytype = new HashMap<Long, String>();
		for (int i = 0; i < tdictionars.size(); i++) {
			familytype.put(tdictionars.get(i).getDdid(), tdictionars.get(i)
					.getDname());
		}
	}

	public Map<Long, String> getFamilytype() {
		return familytype;
	}
	public Tuserinfo getModel() {
		return tuserinfo;
	}

	public int getNoticenum() {
		return noticenum;
	}

	public Map<Long, String> getRoles() {
		return roles;
	}

	public Ttip getTip() {
		return tip;
	}

	public boolean isUserislive() {
		return userislive;
	}

	/**
	 * 冻结和解冻用户
	 */
	public String lockOrUnlock() {
		service.updateLock(tuserinfo);
		return success("操作成功", false, "oa5");
	}

	/**
	 * 保存新建用户
	 */
	public String newUser() throws Exception {
		service.newUser(tuserinfo);
		return success("添加成功", true, "oa5");
	}

	/**
	 * 读取小贴士上的公告数目和邮件数目
	 */
	public String readTip() throws Exception {
		emailnum = service.queryEmailNum(findLoginUser().getUiid());
		noticenum = service.queryNoticeNum(findLoginUser().getUiid());
		return "readTip";
	}

	public void setTip(Ttip tip) {
		this.tip = tip;
	}

	/**
	 * 进入添加用户页面
	 */
	public String toAddPage() throws Exception {
		getAllRoles();
		getfamilytype();
		return "toAddPage";
	}

	/**
	 * 进入小贴士页面设置
	 */
	public String toTipPage() throws Exception {
		tip = service.getuserTip(findLoginUser().getUiid());
		return "toTipPage";
	}

	/**
	 * 进入更新用户页面
	 */
	public String toUpdatePage() throws Exception {
		tuserinfo = service.getUserByUserId(tuserinfo.getUiid());
		getAllRoles();
		getfamilytype();
		return "toUpdatePage";
	}

	/**
	 * 修改密码
	 */
	public String updatePassword() throws Exception {
		if (!findLoginUser().getUipassword().equals(tuserinfo.getUipassword())) {
			this.addFieldError("olderror", "原始密码错误");
			return INPUT;
		}
		if (!tuserinfo.getNewpassword().equals(tuserinfo.getPasswordtemp())) {
			this.addFieldError("olderror", "两次密码不一致");
			return INPUT;
		}
		if (tuserinfo.getNewpassword().equals(findLoginUser().getUipassword())) {
			this.addFieldError("olderror", "新密码和旧密码一致");
			return INPUT;
		}
		service.updatePassword(tuserinfo.getNewpassword(), findLoginUser()
				.getUiid());
		removeUser();
		return success("密码修改成功,请重新登录", true, "oa10");
	}

	/**
	 * 修改个人信息
	 */
	public String updatePersonMessage() throws Exception {
		service.updateUserMessage(tuserinfo);
		tuserinfo = service.getUserByUserId(tuserinfo.getUiid());
		keepLoginUser(tuserinfo);
		return success("修改个人信息成功", true, "oa8");
	}

	

	/**
	 * 更新用户
	 */
	public String updateUser() throws Exception {
		service.updateUser(tuserinfo);
		return success("更新成功", true, "oa5");
	}

	/**
	 * 更新小贴士
	 */
	public String updateUserTip() throws Exception {
		tip.setTid(findLoginUser().getUiid());
		service.updateUserTip(tip);
		return "updateUserTip";
	}

	/**
	 * 用户退出
	 * 
	 * @return
	 * @throws Exception
	 */
	public String user_out() throws Exception {
		removeUser();
		return "out";
	}
	/**
	 * 判断用户是否可以用(返回否)
	 * @return
	 * @throws Exception
	 */
	public String userIsLive() throws Exception
	{
		userislive=service.userIsLive(tuserinfo.getUiusername());
		return "userislive";
	}
	/**
	 * 用户列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public String userlist() throws Exception {
		this.pageModel = service.getUserList(currentPage, pageSize, tuserinfo);
		getfamilytype();
		return "userlist";
	}
	/**
	 * 判断用户是否存在(返回是)
	 * @return
	 * @throws Exception
	 */
	public String userLive() throws Exception
	{
		userislive=!service.userIsLive(tuserinfo.getUiusername());
		return "userislive";
	}
	public String getUser()throws Exception
	{
		tuserinfo = service.getUserByUserId(findLoginUser().getUiid());
		return "getuser";
	}
	/**
	 * 用户余额清零
	 * @return
	 * @throws Exception
	 */
	public String delmoney() throws Exception
	{
		service.changeMoneyZero(tuserinfo.getUiid());
		return success("用户余额清零", true, "oa5");
	}
}
