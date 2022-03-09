import java.util.Scanner;

public class coinChangeProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Input array
        String arrStr = inputStr(in);
        int N = in.nextInt();
        in.close();

        //Convert the String array to Integer array
        int[] S = convertArray(arrStr);

        int count = 0;

        System.out.println(coinChange(S, S.length-1, N));
    }

    public static int coinChange(int[] S, int value, int N) {
        if (N == 0){//When N is 0, return 1.
            return 1;
        }
        if (N < 0||value < 0){//When N and value are less than 0, return 0.
            return 0;
        }
        int num = 0;
        num += coinChange(S, value, N-S[value]);
        num += coinChange(S, value-1, N);
        return num;
    }

    public static int[] convertArray(String arrStr){//Convert the String to Integer
        arrStr = arrStr.trim();
        String[] S = arrStr.split(",");
        int len = S.length;
        int[] A = new int[len];
        for (int i = 0;i < len;i++){
            A[i] = Integer.parseInt(S[i]);
        }
        return A;
    }

    public static String inputStr(Scanner in){//Input the string of array.
        String arrStr = in.nextLine();
        return arrStr;
    }
}
