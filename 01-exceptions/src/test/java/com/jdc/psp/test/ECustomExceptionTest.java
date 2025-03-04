package com.jdc.psp.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.psp.custom.CustomExceptionData;
import com.jdc.psp.custom.MyCheckException;
import com.jdc.psp.custom.MyUnCheckException;

public class ECustomExceptionTest {
	
	static CustomExceptionData data;
	
	@BeforeAll
	static void init() {
		data = new CustomExceptionData();
	}
	
	@Test
	void testException() {
		assertThrows(MyUnCheckException.class,() -> data.getMyUnCheckException(""));
		assertThrows(MyUnCheckException.class,() -> data.changeCheckToUncheck(null));
		assertThrows(MyCheckException.class,() -> data.getMyCheckException(" "));
		
	}
}
