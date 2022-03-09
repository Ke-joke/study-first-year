package CS162.lab.lab_4;

import java.util.Scanner;

public class ArrayValueTimes10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input: ");
		int[] array = fillArray();
		int index = 0;
		System.out.println(checkArray(array, index));
		checkTen(array,index);
	}

	public static int[] fillArray() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		return array;
	}
	
	public static void checkTen(int[] a,int start) {
		if(start < a.length-1) {
			if(a[start]*10 == a[start+1]) {
				System.out.println("True");
			}else {
				checkTen(a,start+1);
			}
		}else {
			System.out.println("False");
		}
	}
	
	public static boolean checkArray(int[] array, int a) {
		if (a < array.length-1) {
			if (array[a]*10 == array[a+1]) {
				return true;
			} else {
				return checkArray(array, a + 1);
			}
		} else {
			return false;
		}
	}
}
