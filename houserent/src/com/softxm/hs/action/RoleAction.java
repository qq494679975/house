package com.softxm.hs.action;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Tmenu;
import com.softxm.hs.model.Trole;
import com.softxm.hs.service.RoleService;

public class RoleAction extends BaseWebAction implements ModelDriven<Trole> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5247616204838652829L;
	private Trole trole = new Trole();
	@Autowired
	private RoleService roleService;
	private List<Tmenu> menus;
	private boolean roleflag;

	public boolean isRoleflag() {
		return roleflag;
	}

	public List<Tmenu> getMenus() {
		return menus;
	}

	@Override
	public Trole getModel() {
		return trole;
	}
	/**
	 * 角色列表
	 * @return
	 * @throws Exception
	 */
	public String rolelist() throws Exception {
		pageModel = roleService
				.getRoles(this.currentPage, this.pageSize, trole);
		return "rolelist";
	}
	/**
	 * 进入新建角色页面
	 * @return
	 * @throws Exception
	 */
	public String intoAddPage() throws Exception {
		menus = roleService.getAllMenus();
		return "toaddpage";
	}
	/**
	 * 新建角色
	 * @return
	 * @throws Exception
	 */
	public String newRole() throws Exception {

		roleService.newRole(trole);
		return success("添加成功", true, "oa2");
	}
	/**
	 * 进入更新角色菜单的页面
	 * @return
	 * @throws Exception
	 */
	public String updaterolepage() throws Exception {
		menus = roleService.getAllMenus();
		System.out.println(trole.getRid());
		trole = roleService.getRole(trole.getRid());
		
		if (trole.getTmenus() != null && trole.getTmenus().size() > 0) {
			Iterator<Tmenu> iterator = trole.getTmenus().iterator();
			while (iterator.hasNext()) {
				Tmenu menus =  iterator.next();
				trole.getRoles().add(menus.getMid());
			}
		}
		return "updaterolepage";
	}
	/**
	 * 更新角色
	 * @return
	 * @throws Exception
	 */
	public String update() throws Exception {
		roleService.updateRole(trole);
		return success("更新成功", true, "oa2");
	}
	/**
	 * 删除角色
	 * @return
	 * @throws Exception
	 */
	public String deleterole() throws Exception
	{
		String message=roleService.deleteRole(trole);
		return success(message, false, "oa2");
	}
	/**
	 * 判断角色是否存在
	 * @return
	 * @throws Exception
	 */
	public String roleisonly() throws Exception
	{
		roleflag=roleService.roleIsOnly(trole.getRname());
		return "roleisonly";
	}
	/**
	 * 判断角色是否存在
	 * @return
	 * @throws Exception
	 */
	public String roleIsonly() throws Exception
	{
		roleflag=roleService.roleIsOnly(trole.getRname(),trole.getRid());
		return "roleisonly";
	}
}
