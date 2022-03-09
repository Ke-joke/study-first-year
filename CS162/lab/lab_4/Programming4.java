package CS162.lab.lab_4;

//Enter Student number here
//FZU:832004220 MAY:20123884
//Do Not Remove these
import java.io.*;
import java.util.ArrayList;
//Do Not remove above

import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {

		// Pass filename into the codeReader method here
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s1 = sc.next();
			String[] code = codeReader(s1+".java");
			if(s1.equals("student1")) {
				System.out.println("Student 1: "+check(code)+" Marks");
			}else if(s1.equals("student2")) {
				System.out.println("Student 2: "+check(code)+" Marks");
			}else if(s1.equals("student3")) {
				System.out.println("Student 3: "+check(code)+" Marks");
			}else if(s1.equals("student4")) {
				System.out.println("Student 4: "+check(code)+" Marks");
			}else if(s1.equals("q")) {
				sc.close();
				break;
			}
		}
	}

	/** --------------------------------------- **/
	/** DO NOT CHANGE ANYTHING IN THESE METHODS **/
	/** --------------------------------------- **/
	public static String[] codeReader(String fileName) {
		// Path to file to read in
		String myfile = fileName;
		// Create an ArrayList (a dynamic type of Array)
		ArrayList<String> lines = new ArrayList<String>();
		try {
			// try to read in the File
			BufferedReader abc = new BufferedReader(new FileReader(myfile));

			String line;
			while ((line = abc.readLine()) != null) {
				lines.add(line);
			}
			abc.close();
		} catch (FileNotFoundException ex) {
			// If the File is not found print to screen
			System.out.println("Unable to open file '" + myfile + "'");
		} catch (IOException ex) {
			// If file is corrupted print to screen
			System.out.println("Error reading file '" + myfile + "'");
		}
		// Convert from ArrayList to Array
		return lines.toArray(new String[] {});
	}

	/** ------------------------------------------ **/
	/** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
	/** ------------------------------------------ **/
	public static int check(String[] code) {
		int score = 0;
		String p1 = ".*public class.*";
		String p2 = ".*void main\\(String \\[\\] args\\).*";
		String p3 = ".*for\\(.*;.*;.*\\).*";
		String p4 = ".*%.*";
		String p5 = ".*System\\.out\\.print.*";
		for (int i = 0; i < code.length; i++) {
			if (code[i].matches(p1)) {
				score = score + 10;
			}
			if (code[i].matches(p2)) {
				score = score + 10;
			}
			if (code[i].matches(p3)) {
				score = score + 10;
			}
			if (code[i].matches(p4)) {
				score = score + 10;
			}
			if (code[i].matches(p5)) {
				score = score + 10;
			}
		}
		return score;
	}
}