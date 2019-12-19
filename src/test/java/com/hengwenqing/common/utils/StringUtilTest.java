package com.hengwenqing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;



public class StringUtilTest {

	@Test//测试是否是有效的地址
	public void isHttpUrl() {
		String url="https://www.baidu.com";
			
		System.out.println(StringUtil.isHttpUrl(url));
	}
	
	@Test
	public void testtoUniqueTerm() {
		String str="Spring mvc ";
		String string=StringUtil.toUniqueTerm(str);
		System.out.println(string);
	}
	
	@Test
	public void testNumber() {
		String string=StringUtil.percent(1, 3);
		System.out.println(string);
	}
	
	
	@Test
	public void testPercent() {
		String string=StringUtil.percent(1, 3);
		System.out.println(string);
	}
	
	//判断是否是数字
	@Test
	public void testIsNumber() {
		String string="11.1";
		System.out.println(StringUtil.isNumber(string));
	}

	//判断是否有值
	@Test
	public void testHasText() {
		String string="aa";
		System.out.println(StringUtil.hasText(string));
	}

}
