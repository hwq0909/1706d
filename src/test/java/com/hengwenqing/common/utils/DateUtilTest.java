package com.hengwenqing.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	
	@Test //月初
	public void testgetDateBefore() {
		Date date=DateUtil.getDateByfore();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	
	//测试计算年龄方法
	@Test
	public void testGetAge() {
		
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR, 1997);
		c.set(Calendar.MONTH, 5);
		c.set(Calendar.DAY_OF_MONTH, 3);
		int date=DateUtil.getAge(c.getTime());
		System.out.println(date);
		
		
	}

}
