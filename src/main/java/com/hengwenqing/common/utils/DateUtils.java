package com.hengwenqing.common.utils;

import java.util.Calendar;
import java.util.Date;
/**
 * 
 * @ClassName: DataUtil 
 * @Description: 日期工具类
 * @author: charles
 * @date: 2019年10月11日 上午11:00:15
 */
public class DateUtils {
	
	public static Date getDate(Date minDate ,Date maxDate) {
		
		//最小毫米数
		long min = minDate.getTime();
		long max = maxDate.getTime();
	
		long x =(long) ((Math.random() * (max -min +1)) +min);
		
		
		return new Date(x);
		
	}
	/*
	* 方法1：(5分) 返回给定日期的月初
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src) {
		//获取日历类
		Calendar c=Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(src);
		//改变日期,设置为月初 即 1号 的00:00:00
		c.add(Calendar.MONTH, -1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
	}
	/*
	* 方法2：(5分) //返回给定日期的月末
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src) {
		//思路: 让传入的月份+1 ,再把日 小时分秒都设置为0 .最后.让日期减去1秒
	    //获取日历类
		Calendar c=Calendar.getInstance();
		   
		//用传入的日期初始化日历类
		c.setTime(src);
		//让月份+1
		c.add(Calendar.MONDAY, 1);
		//调用月初的工具类返回,月初
		Date date=getDateByInitMonth(c.getTime());
		//用月初初始化日历类
		c.setTime(date);
		//让日期减去一秒
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}

}
