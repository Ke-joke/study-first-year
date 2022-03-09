package edu.st.lab2;

public class Lab2_Program1_Fix {

	public double discount(int purchase) {

		double dc;

		if (purchase <= 0)
			dc = 0.0;
		// else if ((purchase >= 1) || (purchase <= 50))
		// When run the program,
		// find when purchase >= 50,
		// the program return 0.
		// That does not fix my exception.
		// So change || to &&
		else if ((purchase >= 1) && (purchase <= 50))
			dc = 0.0;
		else if (purchase <= 200)
			dc = 0.05;
		else if (purchase <= 500)
			dc = 0.1;
		else
			dc = 0.15;

		return dc;
	}
}
