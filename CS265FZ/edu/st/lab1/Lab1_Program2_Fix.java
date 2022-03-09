package edu.st.lab1;

public class Lab1_Program2_Fix {

	public String grade(int exam, int course) {

		String result = "null";
		long average;
		average = Math.round((exam + course) / 2);

		if ((exam < 0) || (exam > 100) || (course < 0) || (course > 100))
			result = "Marks out of range";
		else {
			// Fix the order of the condition "Fail" and "Pass,C",
			// then take the (average >= 80) to (average >= 70)
			/*if (exam < 60) {

				result = "Pass,C";
			} else if ((exam < 50) || (course < 50)) {
				result = "Fail";
			} else if (average >= 80) {
				result = "Pass,A";
			} else {
				result = "Pass,B";
			}*/
			if ((exam < 50) || (course < 50)) {
				
				result = "Fail";
			} else if (exam < 60) {

				result = "Pass,C";
			} else if (average >= 70) {
				result = "Pass,A";
			} else {
				result = "Pass,B";
			}
		}

		return result;

	}

}