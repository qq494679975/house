package com.softxm.hs.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Tmenu;
import com.softxm.hs.model.Ttip;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.service.MenuService;
import com.softxm.hs.service.UserService;

public class MenuAction extends BaseWebAction implements ModelDriven<Tmenu> {

	@Autowired
	private MenuService menuService;
	@Autowired
	private UserService userService;
	private Tmenu tmenu = new Tmenu();
	private List<Tmenu> menus;
	private boolean flag = false;
	private Map<Long, String> menusMap;
	private Ttip tip;

	public Ttip getTip() {
		return tip;
	}

	public Map<Long, String> getMenusMap() {
		return menusMap;
	}

	@Override
	public Tmenu getModel() {
		// TODO Auto-generated method stub
		return tmenu;
	}

	public boolean isFlag() {
		return flag;
	}

	public List<Tmenu> getMenus() {
		return menus;
	}

	/**
	 * 用户登陆时候得到所有菜单
	 * 
	 * @return
	 * @throws Exception
	 */
	public String getAllMenu() throws Exception {
		menus = menuService.getAllMenu(this.findLoginUser().getUiid());
		tip = userService.getuserTip(findLoginUser().getUiid());
		flag = true;
		return "menus";
	}

	/**
	 * 菜单列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public String menulist() throws Exception {
		menus = menuService.getAllMenu();
		return "showMenuPage";
	}

	/**
	 * 进入新建菜单的页面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String getAllFather() throws Exception {
		menus = menuService.getFatherMenu();
		menusMap = new HashMap<Long, String>();
		for (int i = 0; i < menus.size(); i++) {
			menusMap.put(menus.get(i).getMid(), menus.get(i).getMname());
		}
		return "toAddPage";
	}

	/**
	 * 新建一个菜单
	 * 
	 * @return
	 * @throws Exception
	 */
	public String newMenu() throws Exception {

		menuService.newMenu(tmenu);
		return success("增加成功", true, "oa3");
	}

	/**
	 * 进入更新的页面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String toUpdatePage() throws Exception {
		tmenu = menuService.getOneMenu(tmenu.getMid());
		return "toUpdatePage";
	}

	/**
	 * 完成更新的操作
	 */
	public String updateMenu() throws Exception {
		menuService.updateMenu(tmenu);
		return success("更新成功", true, "oa3");
	}

	/**
	 * 删除操作 伪删除
	 * 
	 * @return
	 * @throws Exception
	 */
	public String delMenu() throws Exception {
		String message=menuService.delMenu(tmenu);
		return success(message, false, "oa3");
	}

	/**
	 * 上移
	 * 
	 * @return
	 * @throws Exception
	 */
	public String upMenu() throws Exception {
		menuService.upMenu(tmenu);
		return success("上移成功", false, "oa3");
	}

	/**
	 * 下移
	 * 
	 * @return
	 * @throws Exception
	 */
	public String downMenu() throws Exception {
		menuService.downMenu(tmenu);
		return success("下移成功", false, "oa3");
	}

	/**
	 * 判断是否唯一
	 */
	public String menuIsOnly() throws Exception {
		flag = menuService.menuIsOnly(tmenu.getMfatherid(), tmenu.getMname());
		return "roleisonly";
	}

	public String menuIsOnlyup() throws Exception {
		flag = menuService.menuIsOnly(tmenu.getMfatherid(), tmenu.getMname(),tmenu.getMid());
		return "roleisonly";
	}
}
