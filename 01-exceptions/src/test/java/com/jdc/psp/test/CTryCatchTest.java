package com.jdc.psp.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.psp.trycatch.TryCatchData;


public class CTryCatchTest {
	
	TryCatchData data = new TryCatchData();
	
	@Test
	void testTryWitchFinally() {
		String res = data.useCheckedWitchTryFinallyAndResource();
		System.out.println(res);
	}
	
	//@Test
	void testTryMultiCatch() {
		int res = data.useUncheckedWithTryMultiCatch(new int[2], "2");
		assertEquals(-1, res);
		
		int res1 = data.useUncheckedWithTryMultiCatch(new int[2], "hello");
		assertEquals(-1, res1);
	}
	
	//@Test
	void testTryCatch() {
		String res1 = data.useUncheckedWithTryCatch(127);
		System.out.println(res1);
		//assertEquals(res1, "ClassCastException");
	}
	

}
