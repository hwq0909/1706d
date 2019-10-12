package com.hengwenqing.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testGetDateByInitMonth() {
		Calendar c=Calendar.getInstance();
		c.set(2018, 4, 23, 12, 12, 28);
		
		Date date=DateUtils.getDateByInitMonth(c.getTime());
		SimpleDateFormat df=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
				
	}

	@Test
	public void testGetDateByFullMonth() {
		Calendar c=Calendar.getInstance();
		c.set(2012, 5, 23, 12, 12, 28);
		Date date=DateUtils.getDateByFullMonth(c.getTime());
		SimpleDateFormat df=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

}
