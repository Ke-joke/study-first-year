package CS162.lab.lab_4;

import java.util.Scanner;

public class MathsFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a digital n:");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		num.close();
		int q2I = q2Iterative(n);
		System.out.println(q2I);
		int q2R = q2Recursive(n);
		System.out.println(q2R);
	}
	
	 public static int q2Iterative(int n) {
		 int a = 2;
		 if (n == 1) {
			 return 2; 
		 }else {
			 for(int i = 2;i <= n;i++) {
				 a = 4*a-3*i;
			 }
			 return a; 
		 }
	 }
	 
	 public static int q2Recursive(int n) {
		 if (n == 1) {
			 return 2;
		 }
		 return 4*q2Recursive(n-1)-3*(n);
	 }
}
