package CS162.lab.lab_5;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int power = sc.nextInt();
		sc.close();
		System.out.println("The value of "+num+" to the power of "+power+" is "+powerTo(num, power)+".");
	}

	public static int powerTo(int x, int y) {
		if (y == 1) {
			return x;
		}
		return(x=x*powerTo(x,y-1));
	}
}
