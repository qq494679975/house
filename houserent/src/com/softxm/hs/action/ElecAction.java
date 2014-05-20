package com.softxm.hs.action;

import java.awt.Color;
import java.awt.Font;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.softxm.hs.action.common.BaseWebAction;
import com.softxm.hs.model.Telectricmoney;
import com.softxm.hs.model.Tuserinfo;
import com.softxm.hs.model.Twatermoney;
import com.softxm.hs.service.ElectricMoneyService;

public class ElecAction extends BaseWebAction implements
		ModelDriven<Telectricmoney> {
	private Telectricmoney telectricmoney = new Telectricmoney();
	@Autowired
	private ElectricMoneyService electricMoneyService;
	private List<Tuserinfo> user;

	@Override
	public Telectricmoney getModel() {
		// TODO Auto-generated method stub
		return telectricmoney;
	}
	/**
	 * 总的管理:总的电费 列表
	 * @return
	 * @throws Exception
	 */
	public String electricmoneyList() throws Exception
	{
		pageModel=electricMoneyService.electricmoneyList(currentPage,pageSize,telectricmoney);
		return "electricmoneyList";
	}
	/**
	 * 总的管理:查看电费:
	 */
	public String showElectric() throws Exception
	{
		telectricmoney=electricMoneyService.getElectricById(telectricmoney.getEmid());
		return "showElectric";
	}
	/**
	 * 总的管理:进入添加页面
	 */
	public String toUpdatePage() throws Exception
	{
		user=electricMoneyService.getUsernamelist();
		return "toUpdatePage";
	}
	public Map<Long,String> getUsernamelist()
	{
		Map<Long,String> map = new HashMap<Long, String>();
		for(int i =0;i<user.size();i++)
		{
			map.put(user.get(i).getUiid(), user.get(i).getUiusername());
		}
		return map;
	}
	/**
	 * 总的管理:添加电费
	 */
	public String newElec() throws Exception
	{
		electricMoneyService.newElec(telectricmoney);
		return success("添加成功", false, "oa27");
	}
	/**
	 * 总的管理：删除电费
	 */
	public String delElec() throws Exception
	{
		electricMoneyService.delElec(telectricmoney.getEmid());
		return success("删除成功", false, "oa27");
	}
	/**
	 * 总的管理:确认提交电费
	 */
	public String isrevice() throws Exception
	{
		String message = electricMoneyService.isrevice(telectricmoney.getEmid());
		return success(message, false, "oa21");
	}
	/**
	 * 总的管理:进去更新电费页面
	 */
	public String toUpdatePage1() throws Exception
	{
		user=electricMoneyService.getUsernamelist();
		telectricmoney = electricMoneyService.getElectricById(telectricmoney.getEmid());
		System.out.println(telectricmoney);
		return "toUpdatePage1";
	}
	/**
	 * 总的管理:更新电费
	 */
	public String updateElec() throws Exception
	{
		electricMoneyService.UpdtaetElectric(telectricmoney);
		return success("更新成功", true, "oa27");
	}
	/**
	 * 个人电费
	 */
	public String personElecList() throws Exception
	{
		telectricmoney.setUiid(findLoginUser().getUiid());
		pageModel=electricMoneyService.getPersonList(currentPage,pageSize,telectricmoney);
		return "personElecList";
	}
	/**
	 * 导出个人电费EXCEL
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
		List <Telectricmoney> lists = electricMoneyService.getAllWaterByUserId(findLoginUser().getUiid());
		
		Row row = sheet.createRow((short)0);
		Cell c0 =row.createCell(0); c0.setCellValue("序号"); c0.setCellStyle(cellStyleTitle); 
		Cell c1 =row.createCell(1); c1.setCellValue("时间"); c1.setCellStyle(cellStyleTitle);
		Cell c2 =row.createCell(2); c2.setCellValue("数目/度"); c2.setCellStyle(cellStyleTitle);
		Cell c3 =row.createCell(3); c3.setCellValue("度/元"); c3.setCellStyle(cellStyleTitle);
		Cell c4 =row.createCell(4); c4.setCellValue("总钱数"); c4.setCellStyle(cellStyleTitle);
		Cell c5 =row.createCell(5); c5.setCellValue("提交时间"); c5.setCellStyle(cellStyleTitle);
		
		for(int i =0;i<lists.size();i++)
		{
			
			Row row1 = sheet.createRow((short)i+1);
			Cell c01 =row1.createCell(0); c01.setCellValue(i+1); c01.setCellStyle(cellStyleTitle);
			Cell c11 =row1.createCell(1); c11.setCellValue(lists.get(i).getTime()); c11.setCellStyle(cellStyleTitle);
			Cell c21 =row1.createCell(2); c21.setCellValue(lists.get(i).getEmnum()); c21.setCellStyle(cellStyleTitle);
			Cell c31 =row1.createCell(3); c31.setCellValue(lists.get(i).getEmmoney()/lists.get(i).getEmnum()); c31.setCellStyle(cellStyleTitle);
			Cell c41 =row1.createCell(4); c41.setCellValue(lists.get(i).getEmmoney()); c41.setCellStyle(cellStyleTitle);
			try{
				Cell c51 =row1.createCell(5); c51.setCellValue(lists.get(i).getEmtime().toLocaleString()); c51.setCellStyle(cellStyleTitle);
			
				}catch (Exception e) {
					Cell c51 =row1.createCell(5); c51.setCellValue("还未提交"); c51.setCellStyle(cellStyleTitle);
					
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
	 * 导出所有的电费
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
		List <Telectricmoney> lists = electricMoneyService.getAllWater();
		
		Row row = sheet.createRow((short)0);
		Cell c0 =row.createCell(0); c0.setCellValue("用户名"); c0.setCellStyle(cellStyleTitle); 
		Cell c1 =row.createCell(1); c1.setCellValue("时间"); c1.setCellStyle(cellStyleTitle);
		Cell c2 =row.createCell(2); c2.setCellValue("数目/度"); c2.setCellStyle(cellStyleTitle);
		Cell c3 =row.createCell(3); c3.setCellValue("度/元"); c3.setCellStyle(cellStyleTitle);
		Cell c4 =row.createCell(4); c4.setCellValue("总钱数"); c4.setCellStyle(cellStyleTitle);
		Cell c5 =row.createCell(5); c5.setCellValue("提交时间"); c5.setCellStyle(cellStyleTitle);
		
		for(int i =0;i<lists.size();i++)
		{
			Row row1 = sheet.createRow((short)i+1);
			Cell c01 =row1.createCell(0); c01.setCellValue(lists.get(i).getTuserinfo().getUiusername()); c01.setCellStyle(cellStyleTitle);
			Cell c11 =row1.createCell(1); c11.setCellValue(lists.get(i).getTime()); c11.setCellStyle(cellStyleTitle);
			Cell c21 =row1.createCell(2); c21.setCellValue(lists.get(i).getEmnum()); c21.setCellStyle(cellStyleTitle);
			Cell c31 =row1.createCell(3); c31.setCellValue(lists.get(i).getEmmoney()/lists.get(i).getEmnum()); c31.setCellStyle(cellStyleTitle);
			Cell c41 =row1.createCell(4); c41.setCellValue(lists.get(i).getEmmoney()); c41.setCellStyle(cellStyleTitle);
			try{
			Cell c51 =row1.createCell(5); c51.setCellValue(lists.get(i).getEmtime().toLocaleString()); c51.setCellStyle(cellStyleTitle);
		
			}catch (Exception e) {
				Cell c51 =row1.createCell(5); c51.setCellValue("还未提交"); c51.setCellStyle(cellStyleTitle);
				
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
	
	private JFreeChart chart;

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	
	public String showChart() throws Exception {
		List<Telectricmoney> datas =electricMoneyService.getData(findLoginUser().getUiid());
		// 1.创建数据源
		// 第一根时间轴
		TimeSeries timeSeries01 = new TimeSeries("电费");
		for(int i =0;i<datas.size();i++)
		{

			timeSeries01.add(new Month( datas.get(i).getEmusertime().getMonth()+1, datas.get(i).getEmusertime().getYear()+1900),  datas.get(i).getEmmoney());
			
		}

		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(timeSeries01);

		StandardChartTheme theme = new StandardChartTheme("CN");
		theme.setExtraLargeFont(new Font("黑体", Font.PLAIN, 20));
		theme.setLargeFont(new Font("宋体", Font.PLAIN, 12));
		theme.setRegularFont(new Font("宋体", Font.PLAIN, 12));
		theme.setSmallFont(new Font("宋体", Font.PLAIN, 12));

		ChartFactory.setChartTheme(theme);
		// 2.创建JFreeChart对象
		chart = ChartFactory.createTimeSeriesChart("近10月电费分析", "电费", "金钱(元)", dataset, true, true, true);

		// 设置图像背景
		chart.setBackgroundPaint(Color.WHITE);

		// 获取绘图区域对象
		XYPlot plot = (XYPlot) chart.getPlot();

		// 设置绘图区的背景色为白色
		plot.setBackgroundPaint(Color.WHITE);

		// 设置绘图区的网格线
		plot.setDomainGridlinesVisible(true);
		plot.setDomainGridlinePaint(Color.BLUE);
		plot.setRangeGridlinesVisible(true);
		plot.setRangeGridlinePaint(Color.BLUE);

		// 如果没有数据时显示内容
		plot.setNoDataMessage("无可用数据");
		plot.setNoDataMessagePaint(Color.RED);
		plot.setNoDataMessageFont(new Font("宋体", Font.PLAIN, 20));
		
		// 设置Renderer显示数据点
		XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
		// 显示数据点
		renderer.setBaseShapesVisible(true);
		// 设置数据点显示Label
		renderer.setBaseItemLabelsVisible(true);

		StandardXYItemLabelGenerator generator = new StandardXYItemLabelGenerator("{2}", NumberFormat.getIntegerInstance(), new DecimalFormat("#"));
		renderer.setBaseItemLabelGenerator(generator);

		// 设置日期轴
		DateAxis dateAxis = (DateAxis) plot.getDomainAxis();
		// 设置日期间的间隔
		dateAxis.setTickUnit(new DateTickUnit(DateTickUnitType.MONTH, 1));
		// 格式化日期显示格式
		dateAxis.setDateFormatOverride(new SimpleDateFormat("yyyy年MM月"));

		// 设置纵轴
		NumberAxis valueAxis = (NumberAxis) plot.getRangeAxis();
		valueAxis.setUpperMargin(0.2F);
		valueAxis.setLowerMargin(0.2F);
		valueAxis.setTickUnit(new NumberTickUnit(10));
		// 设置纵轴显示整数
		valueAxis.setNumberFormatOverride(NumberFormat.getIntegerInstance());

		return "chart";
	}
}
