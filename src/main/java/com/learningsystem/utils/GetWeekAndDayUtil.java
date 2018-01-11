package com.learningsystem.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetWeekAndDayUtil {
	public static int getCurrentYear(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}
	
	public static int getCurrentMonth(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.MONTH)+1;
	}
	/**
	* 取得当前日期是多少周
	* 
	* @param date
	* @return
	*/
	public static int getWeekOfYear(Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setMinimalDaysInFirstWeek(7);
		c.setTime (date);
		return c.get(Calendar.WEEK_OF_YEAR);
	}
	// 2.27
	// 获得当前时间  - 开学时间 = 剩余时间/7
	public static int getWeek(Date date,Date currentDate) {
		int week = 0;
		int currentDateWeek = GetWeekAndDayUtil.getWeekOfYear(currentDate);
		int DateWeek = GetWeekAndDayUtil.getWeekOfYear(date);
		if(currentDate.getYear() - date.getYear()!=0){
			
			String dateSty = "2017-12-31";
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = null;
			try {
				date1 = dateFormat.parse(dateSty);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int DateWeekTemp = GetWeekAndDayUtil.getWeekOfYear(date1);
			week = DateWeekTemp-DateWeek+currentDateWeek;
		}else{
			week = currentDateWeek-DateWeek;
		}
		return week;
	}

	/**
	 * 本周星期几
	 * @return
	 */
	public static int getCurrentDayOfWeek(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_WEEK);
	}
	
	/**
	 * 获得学年集合 String[0] 为当前学年
	 * @param level	年级
	 * @return
	 */
	public static String[] getXn(int stu_nj){
		String base_level = "";
		 // int level = SPUtil.getInt(Constants.USER_LEVEL, 0);// 当前年级
		int currentYear = getCurrentYear();
		int currentMonth = getCurrentMonth();
		// 大于 
		/**
		 * 判断，获取当前时间。上半年就是 2016-2017 2 下半年就是2017-2018 1
		 */
		if(currentMonth>7){
			// 判断年级 
			for(;stu_nj<=currentYear; currentYear--){
				base_level += currentYear+"-"+(currentYear+1)+",";
			}
		}else{
			currentYear--;
			for(;stu_nj<=currentYear; currentYear--){
				base_level += currentYear+"-"+(currentYear+1)+",";
			}
		}
		return base_level.split(",");
	}
	
	/**
	 * 获得学期
	 * @return
	 */
	public static String getXq(){
		int currentMonth = getCurrentMonth();
		if(currentMonth>7){
			return "1";
		}else{
			return "2";
		}
	}
}
