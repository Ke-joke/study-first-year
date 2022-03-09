package CS162.lab.lab_1;

import java.util.Scanner;

public class PrintDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while (s.length() != 0) {
			int[][] array = {{0}, {0, 0}, {0}, {0, 0}, {0}};
			int num = Integer.parseInt(s.substring(0,1));
			if (num != 1 && num != 4) {
				array[0][0] = 1;
			}
			if (num == 0 || num == 4 || num == 5 || num == 6 || num == 8 || num == 9) {
				array[1][0] = 1;
			}
			if (num != 5 && num != 6) {
				array[1][1] = 1;
			}
			if (num != 0 && num != 1 && num != 7) {
				array[2][0] = 1;
			}
			if (num == 0 || num == 2 || num == 6 || num == 8) {
				array[3][0] = 1;
			}
			if (num != 2) {
				array[3][1] = 1;
			}
			if (num != 1 && num !=4 && num != 7) {
				array[4][0] = 1;
			}
			for(int i = 0;i < array.length;i++) {
				for (int j = 0; j < 1;j++) {
					if (array[i][0] == 1 && array[i].length == 1) {
						System.out.println(" -- ");
					}else if (array[i].length == 2 && array[i][0] == 1 && array[i][1] == 0) {
						System.out.println("|   ");
					}else if (array[i].length == 2 && array[i][1] == 1 && array[i][0] == 0) {
						System.out.println("   |");
					}else if (array[i].length == 2 && array[i][0] == 1 && array[i][1] == 1) {
						System.out.println("|  |");
					}else {
						System.out.println("");
					}
				}
			}
			s = s.substring(1);
		}
		sc.close();
	}
}
