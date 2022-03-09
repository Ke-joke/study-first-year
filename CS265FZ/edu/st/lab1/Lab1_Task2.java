package edu.st.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Lab1_Task2 {
	Lab1_Program2_Fix program = new Lab1_Program2_Fix();
	
	@DisplayName("Test2.1")
	@Test
	void test2_1() {// Case: EC-1, 7,12 
		assertEquals(program.grade(35, 45), "Fail");	}
	
	@DisplayName("Test2.2")
	@Test
	void test2_2() {// Case: EC-2, 8, 13 
		assertEquals(program.grade(55, 60), "Pass,C");
	}
	
	@DisplayName("Test2.3")
	@Test
	void test2_3() {// Case: EC-3, [8], 14 
		assertEquals(program.grade(65, 64), "Pass,B");
	}
	
	@DisplayName("Test2.4")
	@Test
	void test2_4() {// Case: EC-4, 9, 15 
		assertEquals(program.grade(75, 75), "Pass,A");	}
	
	@DisplayName("Test2.5")
	@Test
	void test2_5() {// Case: EC-5, 10, 16 
		assertEquals(program.grade(-1, -5), "Marks out of range");
	}
	
	@DisplayName("Test2.6")
	@Test
	void test2_6() {// Case: EC-6, 11, [16] 
		assertEquals(program.grade(120, 101), "Marks out of range");
	}
}
