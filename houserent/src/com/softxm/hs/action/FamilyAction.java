package com.softxm.hs.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Tdictionary;
import com.softxm.hs.model.Tuserfamily;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.service.FamilyService;

public class FamilyAction extends BaseWebAction implements
		ModelDriven<Tuserfamily> {
	private Tuserfamily tuserfamily = new Tuserfamily();
	@Autowired
	private FamilyService familyService;
	private List<Tuserfamily> families;
	private Map<Long, String> familyrole;
	private Map<Long, String> familytype;;

	public Map<Long, String> getFamilytype() {
		return familytype;
	}

	public Map<Long, String> getFamilyrole() {
		return familyrole;
	}

	public List<Tuserfamily> getFamilies() {
		return families;
	}

	@Override
	public Tuserfamily getModel() {
		return tuserfamily;
	}

	public int getAllnum() {
		int count = 0;
		if (families != null) {
			count = families.size();
			;
		}
		return count;
	}

	public Double getAllmoney() {
		double money = 0;

		if (families != null) {
			for (int i = 0; i < families.size(); i++) {
				money += families.get(i).getUfmoney();
			}
		}
		return money;
	}

	/**
	 * 个人家庭信息管理
	 * 
	 * @return
	 * @throws Exception
	 */
	public String getAllFamilies() throws Exception {
		families = familyService.getAllFamilies(findLoginUser().getUiid());
		return "familtlist";
	}

	/**
	 * 进入添加个人家庭信息页面
	 */
	public String toAddPage() throws Exception {
		getRoles();
		return "toAddPage";
	}

	private void getRoles() {
		List<Tdictionary> list = familyService.getFamilyRole();
		System.out.println(list);
		familyrole = new HashMap<Long, String>();
		for (int i = 0; i < list.size(); i++) {
			familyrole.put(list.get(i).getDdid(), list.get(i).getDname());
		}
	}

	/**
	 * 添加个人家庭信息
	 */
	public String newFamily() throws Exception {
		Tuserinfo tuserinfo = new Tuserinfo();
		tuserinfo.setUiid(findLoginUser().getUiid());
		tuserfamily.setTuserinfo(tuserinfo);
		familyService.newFamily(tuserfamily);
		return success("添加成功", true, "oa22");
	}

	/**
	 * 进去个人家庭信息修改的页面
	 */
	public String toUpdatePage() throws Exception {
		getRoles();
		tuserfamily=familyService.getFamilyById(tuserfamily.getUfid());
		return "toUpdatePage";
	}
	/**
	 * 修改个人家庭信息
	 */
	public String updateFamily() throws Exception
	{
		familyService.updateFamily(tuserfamily);
		return success("修改成功", true, "oa22");
	}
	/**
	 * 删除个人家庭信息
	 */
	public String deleteFamily()throws Exception
	{
		familyService.deleteFamily(tuserfamily.getUfid());
		return success("删除成功", false, "oa22");
	}
	/**
	 * 总的家庭信息列表
	 */
	public String allFamilyList() throws Exception
	{
		getfamilytype();
		pageModel=familyService.getAllFamilyList(currentPage,pageSize,tuserfamily);
		return "allFamilyList";
	}
	/**
	 * 总的家庭 得到家庭类型
	 */
	private void getfamilytype() {
		List<Tdictionary> tdictionars = familyService.getFamilyDic();
		familytype = new HashMap<Long, String>();
		for (int i = 0; i < tdictionars.size(); i++) {
			familytype.put(tdictionars.get(i).getDdid(), tdictionars.get(i)
					.getDname());
		}
	}
	/**
	 * 总的家庭   查看家庭信息
	 */
	public String toAllFamilyPage() throws Exception
	{
		families = familyService.getAllFamilies(tuserfamily.getUiid());
		return "toAllFamilyPage";
	}
	
	/**
	 * 总的家庭  进入家庭修改页面
	 */
	public String toUpdatePageAllFamily() throws Exception
	{
		getRoles();
		tuserfamily=familyService.getFamilyById(tuserfamily.getUfid());
		return "toUpdatePageAllFamily";
	}
	
	/**
	 * 总的家庭  修改总的家庭信息
	 */
	public String updateAllFamily() throws Exception
	{
		familyService.updateFamily(tuserfamily);
		return success("修改成功", true, "oa25");
	}
	/**
	 * 总的家庭  删除家庭信息
	 */
	public String deleteAllFamily() throws Exception
	{
		familyService.deleteFamily(tuserfamily.getUfid());
		return success("删除成功", false, "oa25");
	}
}
