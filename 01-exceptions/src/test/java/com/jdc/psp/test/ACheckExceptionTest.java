package com.jdc.psp.test;

import org.junit.jupiter.api.Test;

import com.jdc.psp.check.CheckExceptionData;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ACheckExceptionTest {
	
	CheckExceptionData data = new CheckExceptionData();

	@Test
	void fileTest() {
		String res = data.createFile("");
		assertEquals(res, "exit");
		
		res = data.createFile("D:/data/");
		assertEquals(res, "IOException");
	}
}
