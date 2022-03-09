import java.util.Scanner;

public class shuffleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Read the String of array
        String arrayS = in.nextLine();
        String indexS = in.nextLine();
        in.close();

        //Transport the string to the array
        int[] num = tranArray(arrayS);
        int[] index = tranArray(indexS);
        int len = num.length;

        // Shuffle the array
        int[] newNum = shuffleNum(num, index, len);

        // Transport the array to the string
        String s = tranString(newNum, len);
        System.out.println(s);
    }

    // Transport the String to the array
    public static String tranString(int[] num, int len){
        StringBuilder s = new StringBuilder();
        for (int i = 0;i < len;i++){
            if (i == len-1){
                s.append(num[i]);
                break;
            }
            s.append(num[i]).append(",");
        }
        return s.toString();
    }

    // Shuffle the array
    public static int[] shuffleNum(int[] num, int[] index, int len){
        int pos;
        int[] newNum = new int[len];
        for (int i = 0;i < len;i++){
            pos = index[i];
            newNum[i] = num[pos];
        }
        return newNum;
    }

    // Transport the string to the integer array
    public static int[] tranArray(String s){
        String[] numS = s.split(",");
        int len = numS.length;
        int[] num = new int[len];
        for (int i = 0;i < len;i++){
            num[i] = Integer.parseInt(numS[i]);
        }
        return num;
    }
}
