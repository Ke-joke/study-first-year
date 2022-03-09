package CS162.lab.lab_2;

import java.util.Scanner;

public class Programming2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] temp = new int[3][3];
		int num = 0;
		int digit = 0;
		int check;
		boolean justy;
		for (int i = 0; i <= 9; i++) {
			displayBoard(temp, digit, num);
			check = checkForWin(temp);
			if (check == 1) {
				System.out.println("Player1 get win!");
				break;
			} else if (check == 2) {
				System.out.println("Player2 get win!");
				break;
			} else if (check == -1 && i == 9) {
				System.out.println("It is a tie.");
			}
			if (i < 9) {
				if (num == 0) {
					System.out.print("This is player1's time: ");
					num = 1;
				} else {
					System.out.print("This is player2's time: ");
					num = 0;
				}
				digit = sc.nextInt();
				justy = checkValidPosition(digit, temp);
				if (justy == false) {
					i--;
					System.out.println("NOT VALID!");
					if (num == 1) {
						num = 0;
					}else {
						num = 1;
					}
				}
			}
		}
		sc.close();
	}

	public static int checkForWin(int[][] temp) {
		if ((temp[0][0] == 1 && ((temp[0][1] == 1 && temp[0][2] == 1) || (temp[1][0] == 1 && temp[2][0] == 1)
				|| (temp[1][1] == 1 && temp[2][2] == 1))) || (temp[0][1] == 1 && temp[1][1] == 1 && temp[2][1] == 1)
				|| (temp[0][2] == 1 && ((temp[1][2] == 1 && temp[2][2] == 1) || temp[1][1] == 1 && temp[2][0] == 1))
				|| (temp[1][0] == 1 && temp[1][1] == 1 && temp[1][2] == 1)
				|| (temp[2][0] == 1 && temp[2][1] == 1 && temp[2][2] == 1)) {
			return 1;
		} else if ((temp[0][0] == 2 && ((temp[0][1] == 2 && temp[0][2] == 2) || (temp[1][0] == 2 && temp[2][0] == 2)
				|| (temp[1][1] == 2 && temp[2][2] == 2))) || (temp[0][1] == 2 && temp[1][1] == 2 && temp[2][1] == 2)
				|| (temp[0][2] == 2 && ((temp[1][2] == 2 && temp[2][2] == 2) || temp[1][1] == 2 && temp[2][0] == 2))
				|| (temp[1][0] == 2 && temp[1][1] == 2 && temp[1][2] == 2)
				|| (temp[2][0] == 2 && temp[2][1] == 2 && temp[2][2] == 2)) {
			return 2;
		} else {
			return -1;
		}
	}

	public static int[][] displayBoard(int[][] temp, int digit, int num) {
		if (digit == 1 && temp[0][0] == 0) {
			if (num == 1) {
				temp[0][0] = 1;
			} else {
				temp[0][0] = 2;
			}
		} else if (digit == 2 && temp[0][1] == 0) {
			if (num == 1) {
				temp[0][1] = 1;
			} else {
				temp[0][1] = 2;
			}
		} else if (digit == 3 && temp[0][2] == 0) {
			if (num == 1) {
				temp[0][2] = 1;
			} else {
				temp[0][2] = 2;
			}
		} else if (digit == 4 && temp[1][0] == 0) {
			if (num == 1) {
				temp[1][0] = 1;
			} else {
				temp[1][0] = 2;
			}
		} else if (digit == 5 && temp[1][1] == 0) {
			if (num == 1) {
				temp[1][1] = 1;
			} else {
				temp[1][1] = 2;
			}
		} else if (digit == 6 && temp[1][2] == 0) {
			if (num == 1) {
				temp[1][2] = 1;
			} else {
				temp[1][2] = 2;
			}
		} else if (digit == 7 && temp[2][0] == 0) {
			if (num == 1) {
				temp[2][0] = 1;
			} else {
				temp[2][0] = 2;
			}
		} else if (digit == 8 && temp[2][1] == 0) {
			if (num == 1) {
				temp[2][1] = 1;
			} else {
				temp[2][1] = 2;
			}
		} else if (digit == 9 && temp[2][2] == 0) {
			if (num == 1) {
				temp[2][2] = 1;
			} else {
				temp[2][2] = 2;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				if (temp[i][j] == 0) {
					System.out.print("   |");
				} else if (temp[i][j] == 1) {
					System.out.print(" X |");
				} else if (temp[i][j] == 2) {
					System.out.print(" O |");
				}
			}
			System.out.println("");
		}
		return temp;
	}

	public static boolean checkValidPosition(int digit, int[][] temp) {
		boolean justy = true;
		if ((digit == 1 && temp[0][0] != 0) || (digit == 2 && temp[0][1] != 0) || (digit == 3 && temp[0][2] != 0)
				|| (digit == 4 && temp[1][0] != 0) || (digit == 5 && temp[1][1] != 0) || (digit == 6 && temp[1][2] != 0)
				|| (digit == 7 && temp[2][0] != 0) || (digit == 8 && temp[2][1] != 0)
				|| (digit == 9 && temp[2][2] != 0)) {
			justy = false;
		}
		return justy;
	}
}
