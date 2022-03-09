import java.util.Scanner;
import java.lang.Math;

public class findMinimumPath {
    private static String[] s1;
    private static int[][] a;
    private static int M;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        inputString(s);
        s.close();

        //System.out.println(findMinimum());
        System.out.println(findMinimumLoop());
    }

    private static int findMinimumLoop(){
        int[][] T = new int[M][M];
        for (int i = 0;i < M;i++){
            for (int j = 0;j < M;j++){
                T[i][j] = a[i][j];
                if (i == 0&&j > 0){
                    T[0][j] += T[0][j-1];
                }else if (j == 0&& i > 0){
                    T[i][0] += T[i-1][0];
                }else if (i > 0&&j > 0){
                    T[i][j] += Integer.min(T[i-1][j], T[i][j-1]);
                }
            }
        }
        return T[M-1][M-1];
    }

    private static int findMinimum(){
        if (a == null||a.length == 0) return 0;
        return findMinimum(a.length, a[0].length);
    }

    private static int findMinimum(int row, int col){
        if (row == 0||col == 0) return Integer.MAX_VALUE;
        if (row == 1&& col == 1) return a[0][0];
        int cost = findMinimum(row - 1, col) < findMinimum(row, col - 1)?findMinimum(row - 1, col)+a[row-1][col-1]:findMinimum(row, col - 1)+a[row-1][col-1];
        return cost;
    }

    private static void convertArray(String s) {
        s1 = s.split(",");
        int len = s1.length;
        M = (int) Math.sqrt(len);
        a = new int [M][M];
        int h = 0;
        for (int i = 0;i < M;i++){
            for (int j = 0;j < M;j++){
                a[i][j] = Integer.parseInt(s1[h++]);
            }
        }
    }

    private static void inputString(Scanner in){
        String s = in.nextLine();
        convertArray(s);
    }
}
