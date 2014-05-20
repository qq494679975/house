package com.softxm.hs.action;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Telectricmoney;
import com.softxm.hs.model.Thousemoney;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.service.HouseMService;

public class HouseAction extends BaseWebAction implements
		ModelDriven<Thousemoney> {
	private Thousemoney thousemoney = new Thousemoney();
	@Autowired
	private HouseMService houseMService;
	private List<Tuserinfo> user;

	@Override
	public Thousemoney getModel() {
		// TODO Auto-generated method stub
		return thousemoney;
	}

	public Map<Long, String> getUsernamelist() {
		Map<Long, String> map = new HashMap<Long, String>();
		for (int i = 0; i < user.size(); i++) {
			map.put(user.get(i).getUiid(), user.get(i).getUiusername());
		}
		return map;
	}

	/**
	 * 总的房租管理，房租列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public String houseMlist() throws Exception {
		pageModel = houseMService.getHouseList(thousemoney, currentPage,
				pageSize);
		return "houseMlist";
	}

	/**
	 * 总的房租管理，进入添加页面
	 * 
	 * @return
	 * @throws Exception
	 */
	public String toaddpage() throws Exception {
		user = houseMService.getAllUser();
		return "toaddpage";
	}

	/**
	 * 总的房租管理，添加房租
	 * 
	 * @return
	 * @throws Exception
	 */
	public String newHouseM() throws Exception {
		houseMService.newHouseM(thousemoney);
		return success("添加成功", false, "oa32");
	}

	/**
	 * 总的房租管理 进入修改房租
	 * 
	 * @return
	 * @throws Exception
	 */
	public String toUpdatePage() throws Exception {
		thousemoney = houseMService.getHouseMById(thousemoney.getHmid());
		return "toUpdatePage";
	}

	/**
	 * 总的房租管理 修改房租
	 * 
	 * @return
	 * @throws Exception
	 */
	public String updateHouseM() throws Exception {
		houseMService.updateHouseM(thousemoney);
		return success("修改成功", true, "oa32");
	}

	/**
	 * 总的房租管理 删除房租s
	 * 
	 * @return
	 * @throws Exception
	 */
	public String delHouseM() throws Exception {
		houseMService.delHouseM(thousemoney.getHmid());
		return success("删除成功", false, "oa32");
	}
	/**
	 * 查看房租
	 * @return
	 * @throws Exception
	 */
	public String showHouseM() throws Exception
	{
		thousemoney=houseMService.getHouseMById(thousemoney.getHmid());
		return "showHouseM";
	}
	/**
	 * 总的房租管理 提交房租
	 * @return
	 * @throws Exception
	 */
	public String isrevice()throws Exception
	{
		String message = houseMService.isReviceHouseMoney(thousemoney.getHmid());
		return success(message, false, "oa31");
	}
	/**
	 * 个人房租管理 房租列表
	 * @return
	 * @throws Exception
	 */
	public String getPersonHouse()throws Exception
	{
		thousemoney.setUiid(findLoginUser().getUiid());
		pageModel = houseMService.getPersonHouse(thousemoney, currentPage,
				pageSize);
		return "getPersonHouse";
	}
	/**
	 * 导出个人房租EXCEL
	 */
	public String getPersonExcel() throws Exception
	{
		Workbook wb = new HSSFWorkbook();
		// Workbook wb = new XSSFWorkbook();
		CreationHelper createHelper = wb.getCreationHelper();
		HSSFCellStyle cellStyleTitle = (HSSFCellStyle) wb.createCellStyle();
		//cellStyleTitle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND); // 填充单元格
		cellStyleTitle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// //居中显示
		
		cellStyleTitle.setWrapText(true);
		
		
		Sheet sheet = wb.createSheet("new sheet"); 
		
		sheet.setColumnWidth((short)4,(short)6);  
		List <Thousemoney> lists = houseMService.getAllHouseByUserId(findLoginUser().getUiid());
		
		Row row = sheet.createRow((short)0);
		Cell c0 =row.createCell(0); c0.setCellValue("序号"); c0.setCellStyle(cellStyleTitle); 
		Cell c1 =row.createCell(1); c1.setCellValue("时间"); c1.setCellStyle(cellStyleTitle);
		Cell c4 =row.createCell(2); c4.setCellValue("总钱数"); c4.setCellStyle(cellStyleTitle);
		Cell c5 =row.createCell(3); c5.setCellValue("提交时间"); c5.setCellStyle(cellStyleTitle);
		
		for(int i =0;i<lists.size();i++)
		{
			
			Row row1 = sheet.createRow((short)i+1);
			Cell c01 =row1.createCell(0); c01.setCellValue(i+1); c01.setCellStyle(cellStyleTitle);
			Cell c11 =row1.createCell(1); c11.setCellValue(lists.get(i).getTime()); c11.setCellStyle(cellStyleTitle);
			Cell c41 =row1.createCell(2); c41.setCellValue(lists.get(i).getHmmoney()); c41.setCellStyle(cellStyleTitle);
			try{
				Cell c51 =row1.createCell(3); c51.setCellValue(lists.get(i).getHmtime().toLocaleString()); c51.setCellStyle(cellStyleTitle);
			
				}catch (Exception e) {
					Cell c51 =row1.createCell(3); c51.setCellValue("还未提交"); c51.setCellStyle(cellStyleTitle);
					
				}
	}
		try {
			response.setContentType("application/octet-stream");
			String fileName = URLEncoder.encode("data.xls", "UTF-8");
			response.setHeader("Content-Disposition", "attachment;filename="
					+ fileName);
			response.setContentLength(123123);
			wb.write(response.getOutputStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 导出所有的房租
	 */
	public String getAllExcel() throws Exception
	{
		Workbook wb = new HSSFWorkbook();
		// Workbook wb = new XSSFWorkbook();
		CreationHelper createHelper = wb.getCreationHelper();
		HSSFCellStyle cellStyleTitle = (HSSFCellStyle) wb.createCellStyle();
		//cellStyleTitle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND); // 填充单元格
		cellStyleTitle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// //居中显示
		
		cellStyleTitle.setWrapText(true);
		
		
		Sheet sheet = wb.createSheet("new sheet"); 
		
		sheet.setColumnWidth((short)4,(short)6);  
		List <Thousemoney> lists = houseMService.getAllHouse();
		
		Row row = sheet.createRow((short)0);
		Cell c0 =row.createCell(0); c0.setCellValue("用户名"); c0.setCellStyle(cellStyleTitle); 
		Cell c1 =row.createCell(1); c1.setCellValue("时间"); c1.setCellStyle(cellStyleTitle);
		Cell c4 =row.createCell(2); c4.setCellValue("总钱数"); c4.setCellStyle(cellStyleTitle);
		Cell c5 =row.createCell(3); c5.setCellValue("提交时间"); c5.setCellStyle(cellStyleTitle);
		
		for(int i =0;i<lists.size();i++)
		{
			Row row1 = sheet.createRow((short)i+1);
			Cell c01 =row1.createCell(0); c01.setCellValue(lists.get(i).getTuserinfo().getUiusername()); c01.setCellStyle(cellStyleTitle);
			Cell c11 =row1.createCell(1); c11.setCellValue(lists.get(i).getTime()); c11.setCellStyle(cellStyleTitle);
			Cell c41 =row1.createCell(2); c41.setCellValue(lists.get(i).getHmmoney()); c41.setCellStyle(cellStyleTitle);
			try{
			Cell c51 =row1.createCell(3); c51.setCellValue(lists.get(i).getHmtime().toLocaleString()); c51.setCellStyle(cellStyleTitle);
		
			}catch (Exception e) {
				Cell c51 =row1.createCell(3); c51.setCellValue("还未提交"); c51.setCellStyle(cellStyleTitle);
				
			}
		}
		try {
			response.setContentType("application/octet-stream");
			String fileName = URLEncoder.encode("data.xls", "UTF-8");
			response.setHeader("Content-Disposition", "attachment;filename="
					+ fileName);
			response.setContentLength(123123);
			wb.write(response.getOutputStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
