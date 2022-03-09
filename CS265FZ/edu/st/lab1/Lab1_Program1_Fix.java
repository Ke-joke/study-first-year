package edu.st.lab1;

public class Lab1_Program1_Fix {
	public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
		int fee = 5;
		// Change the condition that (sportsEquipment || musicEquipment) to 
		// ((sportsEquipment && !musicEquipment) || (musicEquipment && !sportsEquipment))
		// of fee = 10
		// if (sportsEquipment || musicEquipment)
		if ((sportsEquipment && !musicEquipment) || (musicEquipment && !sportsEquipment))
			fee = 10;
		else if (sportsEquipment && musicEquipment)
			fee = 20;

		return fee;
	}

}
