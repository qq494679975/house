package com.softxm.hs.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Tdictionary;
import com.softxm.hs.service.DictionaryService;

public class DictionaryAction extends BaseWebAction implements
		ModelDriven<Tdictionary> {
	private Tdictionary tdictionary = new Tdictionary();
	@Autowired
	private DictionaryService dictionaryService;
	private List<Tdictionary> tdictionarys;
	private Map<Long, String> bigdic;
	private boolean dicflag;

	public Map<Long, String> getBigdic() {
		return bigdic;
	}

	public List<Tdictionary> getTdictionarys() {
		return tdictionarys;
	}

	@Override
	public Tdictionary getModel() {
		// TODO Auto-generated method stub
		return tdictionary;
	}

	/**
	 * 数据字典列表
	 */
	public String dictionarylist() throws Exception {
		tdictionarys = dictionaryService.getAllDictionary();
		return "dictionaryList";
	}

	/**
	 * 进入添加页面
	 */
	public String toAddPage() throws Exception {
		tdictionarys = dictionaryService.getFatherDictionary();

		bigdic = new HashMap<Long, String>();

		for (int i = 0; i < tdictionarys.size(); i++) {
			bigdic.put(tdictionarys.get(i).getDdid(), tdictionarys.get(i)
					.getDname());
		}
		return "toAddPage";
	}

	/**
	 * 添加新的数据字典
	 */
	public String newDictionary() throws Exception {
		dictionaryService.newDictionary(tdictionary);
		return success("添加成功", true, "oa4");
	}

	/**
	 * 进入修改页面
	 */
	public String toUpdatePage() throws Exception {
		tdictionarys = dictionaryService.getFatherDictionary();

		bigdic = new HashMap<Long, String>();

		for (int i = 0; i < tdictionarys.size(); i++) {
			bigdic.put(tdictionarys.get(i).getDdid(), tdictionarys.get(i)
					.getDname());
		}
		tdictionary = dictionaryService.getOneDictionary(tdictionary.getDdid());
		return "toUpdatePage";
	}
	/**
	 * 更新数据字典
	 */
	public String updatedic()throws Exception
	{
		dictionaryService.update(tdictionary);
		return success("更新成功", true, "oa4");
	}
	/**
	 * 删除数据字典
	 * @return
	 * @throws Exception
	 */
	public String deleteDic()throws Exception
	{
		String text=dictionaryService.deleteDic(tdictionary);
		return  success(text, false, "oa4");
	}
	/**
	 * 判断数据字典是否存在
	 * @return
	 * @throws Exception
	 */
	public String dicIsOnly()throws Exception
	{
		dicflag=dictionaryService.dicIsOnly(tdictionary.getDfatherid(),tdictionary.getDname());
		return "dicIsOnly";
	}
	public boolean isDicflag() {
		return dicflag;
	}
	
	public String dicIsOnlyUp() throws Exception
	{
		dicflag = dictionaryService.dicIsOnly(tdictionary.getDname().trim(),tdictionary.getDfatherid(),tdictionary.getDdid());
		return "dicIsOnly";
	}
}
