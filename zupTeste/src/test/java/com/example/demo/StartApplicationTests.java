package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StartApplicationTests {
	
		@Test
		public void testSomar() {
			System.out.println("Somar");
			int n1 = 5;
			int n2 = 5;
			assertEquals(n1, n2);
		} 
		
		@Test
		public void testSomar2() {
			System.out.println("Somar");
			int n1 = 5;
			int n2 = 7;
			assertEquals(n1, n2);
		} 


}
