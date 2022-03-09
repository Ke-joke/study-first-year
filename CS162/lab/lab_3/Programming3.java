package CS162.lab.lab_3;

//Enter Student number here 832004220
//Do Not Remove these
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;
//Do Not remove above

import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {

		/*
		 * This line will use the methods provided below to get all the words from the
		 * dictionary.txt file that is >= 8 Characters long. It will then return a word
		 * from that List to wordToGuess as your word for the game.
		 */
		String wordToGuess = getRandomWord();
		System.out.println(wordToGuess);
		checkLetter(wordToGuess);

	}

	/** --------------------------------------- **/
	/** DO NOT CHANGE ANYTHING IN THESE METHODS **/
	/** --------------------------------------- **/
	public static String[] wordsReader() {
		// Path to file to read in
		String myfile = "dictionary.txt";
		// Create an ArrayList (a dynamic type of Array)
		ArrayList<String> lines = new ArrayList<String>();
		try {
			// try to read in the File
			BufferedReader abc = new BufferedReader(new FileReader(myfile));

			String line;
			while ((line = abc.readLine()) != null) {
				// If words length greater than 8 keep it otherwise discard it
				if (line.length() > 8) {
					lines.add(line);
				}
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

	public static String getRandomWord() {
		// Return a random word from the list
		String[] words = wordsReader();
		int len = words.length;
		Random rand = new Random();
		int x = rand.nextInt(len);
		return words[x];
	}

	/** ------------------------------------------ **/
	/** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
	/** ------------------------------------------ **/
	public static void checkLetter(String word) {
		char[] guess = new char[word.length()];
		Arrays.fill(guess, '_');
		System.out.println(Arrays.toString(guess));
		String letter = "";
		int live = 10;
		boolean go = true;
		Scanner sc = new Scanner(System.in);
		while (go) {
			go = false;
			boolean check = false;
			letter = sc.nextLine();
			if (letter.matches("[a-z]+")) {
				if (letter.length() == 1) {
					for (int i = 0; i < word.length(); i++) {
						String w = Character.toString(word.charAt(i));
						if (w.equals(letter)) {
							guess[i] = word.charAt(i);
							check = true;
						}
					}
					System.out.println(Arrays.toString(guess));
				} else if (letter.length() == word.length()) {
					if (letter.matches(word) != true) {
						live = 0;
						check = true;
					} else {
						System.out.println(Arrays.toString(letter.toCharArray()));
						check = true;
					}
				} else {
					go = true;
					System.out.println("Please input full letter or valid character:");
					continue;
				}
			} else {
				System.out.println("Please input valid character:");
				go = true;
				continue;
			}
			if (check == false) {
				live--;
				System.out.println("No");
			} else
				System.out.println("Close to right!");
			System.out.println("Live is:" + live);
			for (int i = 0; i < guess.length; i++) {
				if (guess[i] == '_') {
					go = true;
				}
			}
			if (go == false) {
				System.out.println("You win the game!");
				break;
			}
			if (live == 0) {
				System.out.println("Game over, you lose!");
				break;
			}
		}
		sc.close();
	}
}