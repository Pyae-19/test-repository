package com.jdc.psp.test;
import com.jdc.psp.handler.*;
import org.junit.jupiter.api.*;

public class BHandlerTest {
	Handler handle = new Handler();
	@Test
	void testName() {
		handle.useName();
	}
	
	@Test
	void testRcursive() {
		handle.recursive();
	}
	
	@Test
	void testAge() {
		handle.useAge();
	}
}
