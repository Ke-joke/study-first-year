package CS162.lab.lab_1;

import java.util.Scanner;

public class WeatherReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tem = sc.nextInt();
		printWeatherReport(tem);
		sc.close();
	}

	public static void printWeatherReport(int x) {
		if (x >= 0 && x <= 8) {
			System.out.println("It is cold outside, bring a jacket!");
		}else if (x >= 9 && x <= 16) {
			System.out.println("The sun is coming out, and it is getting warmer.");
		}else if (x >= 17 && x <= 32) {
			System.out.println("Time to sit beside the pool and relax.");
		}else if (x >= 33 && x <= 45) {
			System.out.println("Too hot, can't move!");
		}else {
			System.out.println("Not a valid number!");
		}
	}
}
