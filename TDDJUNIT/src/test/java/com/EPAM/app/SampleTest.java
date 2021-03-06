package com.EPAM.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SampleTest {
	/*
	 * 1.A present ABCD => BCD
	 * 2.          AACD => CD
	 * 3.		   BACD =>BCD
	 * 4.		   AABAA => BAA
	 * 5.A not present BBAA => BBAA
	 */
	Remove rem;
	
	@BeforeEach
	void creating_object(){
		rem=new Remove();
	}
	
	
	@Test
	void test1() {
		assertEquals("BCD",rem.remove("ABCD"));
	}
	
	@Test
	void test2() {
		assertEquals("CD",rem.remove("AACD"));
	}
	
	@Test
	void test3() {
		assertEquals("BCD",rem.remove("BACD"));
	}
	
	@Test
	void test4() {
		assertEquals("BAA",rem.remove("AABAA"));
	}

}
