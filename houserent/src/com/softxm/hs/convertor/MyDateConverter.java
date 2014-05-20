package com.softxm.hs.convertor;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class MyDateConverter extends StrutsTypeConverter {
	/**
	 * @param paramMap
	 *            客户端请求的所有参数
	 * @param dateStr
	 *            需要转换的字符串
	 * @param needType
	 *            需要将字符串转换的类型
	 */
	@Override
	public Object convertFromString(Map paramMap, String[] dateStr,
			Class needType) {
		if (dateStr == null)
			return null;
		String strDate = dateStr[0];
		if (needType == java.sql.Date.class) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			try {
				java.util.Date date = dateFormat.parse(strDate);
				return new Date(date.getTime());
			} catch (ParseException e) {
				return null;
			}
		} else if (needType == java.util.Date.class) {
			String[] strs = new String[] { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss"};

			if (strDate.indexOf(":") != -1) {
				DateFormat dateFormat = new SimpleDateFormat(strs[1]);
				try {
					return dateFormat.parseObject(strDate);
				} catch (ParseException e) {
					return null;
				}
			} else {
				DateFormat dateFormat = new SimpleDateFormat(strs[0]);
				try {
					return dateFormat.parseObject(strDate);
				} catch (ParseException e) {
					return null;
				}
			}

		}
		return null;
	}

	@Override
	/**
	 * @param date 需要转换的时间对象
	 */
	public String convertToString(Map arg0, Object date) {
		if (date == null)
			return null;
		String pattern = "";
		if (date instanceof java.sql.Date) {
			pattern = "yyyy-MM-dd";
		} else if (date instanceof java.util.Date) {
			pattern = "yyyy-MM-dd HH:mm:ss";
		}else {
			return date.toString();
		}
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

}
