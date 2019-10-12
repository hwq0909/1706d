package com.hengwenqing.common.utils;

import static org.junit.Assert.fail;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
	int is=	RandomUtil.random(2, 3);
		System.out.println(is);
	}

	@Test
	public void testSubRandom() {
	    int [] is=RandomUtil.subRandom(1, 5, 3);
	    for (int i:is) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
	    System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
