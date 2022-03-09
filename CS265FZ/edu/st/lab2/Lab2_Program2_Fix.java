package edu.st.lab2;

public class Lab2_Program2_Fix {

	public static String grade(int exam, int course) {

		String result = "null";
		long average;
		average = Math.round((exam + course) / 2);

		if ((exam < 0) || (exam > 100) || (course < 0) || (course > 100))
			result = "Marks out of range";
		else {
			if ((exam < 50) || (course < 50)) {
				//result = "Pass,C";
				// Change the result = "Pass,C" to result = "Fail"
				result = "Fail";
			}// Change this statement 
			 // (else if (average >= 70){result = "Pass,A";})
			 // before (else if (exam < 60){result = "Pass,C";})
			else if (average >= 70) {
				result = "Pass,A";
			}  else if (exam < 60) {
				//result = "Fail";
				// Change the result = "Fail" to result = "Pass,C"
				result = "Pass,C";
			/*} else if (average >= 80) {
				result = "Pass,A";*/
			} else {
				result = "Pass,B";
			}
		}

		return result;

	}

}
