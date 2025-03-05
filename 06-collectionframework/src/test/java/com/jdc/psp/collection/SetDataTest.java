
package com.jdc.psp.collection;

import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetDataTest {
static CollectionData data;
static TreeData tree;
	
	@BeforeAll
	static void init() {
		data = new CollectionData();
		tree = new TreeData();
	}
	
	@Test
	void treeSetTest() {
		@SuppressWarnings("unused")
		//LinkedHashSet<String> set = new LinkedHashSet<String>();
		TreeSet<Person> set = tree.useTreeset();
		for(Person p : set) {
			System.out.println(p.name()+"\t"+p.age());
		}
		
		
	}
	@ParameterizedTest
    @CsvSource({"0, Andrew","3, Henery"})
	void selectListTest(int index, String res) {
		
	}
	
	@ParameterizedTest
	@Disabled
	@ValueSource(strings = {"H","L","T"})
	void useListTest(String str) {
		System.out.println("use set type: "+ str);
		for(String s: data.useSet( str.toUpperCase())) {
			System.out.println("Element: " + s);
		}
		System.out.println();
	}
}
