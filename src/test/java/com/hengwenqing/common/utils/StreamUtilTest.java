package com.hengwenqing.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() throws IOException {
		String string=StreamUtil.readTextFile(new FileInputStream(new File("D:/date.txt")));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String string=StreamUtil.readTextFile(new File("D:/date.txt"));
		System.out.println(string);
	}

}
