package com.hengwenqing.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;



public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str=" ";
		System.out.println(StringUtil.hasLength(str));
	}

	@Test
	public void testHasText() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomChineseString() {
		String str=" ";
		System.out.println(StringUtil.hasText(str));
	}

	@Test
	public void testRandomChineseStringInt() {
		String string=StringUtil.randomChineseString();
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String string=StringUtil.randomChineseString(10);
		System.out.println(string);
	}
	
	@Test
	public void testPerson() {
		for (int i = 0; i < 10000; i++) {
			// 姓名
			String name = StringUtil.generateChineseName();
			// 年龄
			int age = RandomUtil.random(1, 120);
			// 介绍
			String abount = StringUtil.randomChineseString(140);
			// 注册日期
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);

			Date created = DateUtils.getDate(c.getTime(), new Date());
			Person p = new Person(name, age, abount, created);
			System.out.println(p);
		}

	}

}
