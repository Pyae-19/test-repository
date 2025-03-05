
package com.jdc.psp.collection;


import java.util.List;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ListDataTest {
static CollectionData data;
	
	@BeforeAll
	static void init() {
		data = new CollectionData();
	}
	
	@ParameterizedTest
    @CsvSource({"0, Andrew","3, Henery"})
	void selectListTest(int index, String res) {
		List<String> list = data.useList("L");
		@SuppressWarnings("unused")
		String str = list.get(index);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"A","L"})
	void useListTest(String str) {
		System.out.println("use of list type: "+ str);
		for(String s: data.useList( str.toUpperCase())) {
			System.out.println("Element: " + s);
		}
		System.out.println();
	}
}
