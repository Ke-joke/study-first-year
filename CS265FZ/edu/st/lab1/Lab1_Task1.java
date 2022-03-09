package edu.st.lab1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Lab1_Task1 {
	Lab1_Program1_Fix program = new Lab1_Program1_Fix();
	
	@DisplayName("Test1_1")
	@Test
	void test1_1() {//Cases: EC-1, 3, 7
		assertEquals(program.calcInsurance(true, true), 20);
	}

	@DisplayName("Test1_2")
	@Test
	void test1_2() {//Cases: EC-2, [3], 6
		assertEquals(program.calcInsurance(false, true), 10);
	}
	
	@DisplayName("Test1_3")
	@Test
	void test1_3() {//Cases: EC-[2], 4, 5
		assertEquals(program.calcInsurance(false, false), 5);
	}
}
