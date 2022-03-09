package edu.st.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Lab1_Task3 {

	Lab1_Program3_Fix program = new Lab1_Program3_Fix();
	@DisplayName("Teat3")
	@ParameterizedTest
	@CsvSource({"8, S, true, 0",		//Case: EC-1, 8, , 9, 11
				"100, S, false, 0",		//Case: EC-2, [8], 10, 11
				"20, M, false, 2000",	//Case: EC-3, 6, [10], 16
				"35, F, true, 300",		//Case: EC-4, 7, [9], 13
				"36, M, false, 500",	//Case: EC-4, [6], [10], 15
				"55, M, false, 400",	//Case: EC-5, [6], [10], 14
				"57, F, true, 200"		//Case: EC-[5], [7], [9], 12	
				})
	void test3_ec_1_to_7(int age, char gender, boolean married, int premium) {
		assertEquals(program.carInsurance(age, gender, married),premium);
	}

}
