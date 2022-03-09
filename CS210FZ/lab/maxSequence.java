import java.util.Arrays;
import java.util.Scanner;

public class maxSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s2 = in.nextLine();

        int[] bin = convertArray(s);
        int num = Integer.parseInt(s2);
        System.out.println(Arrays.toString(countSequence(bin, num)));
    }

    public static int[] countSequence(int[] arr, int num){
        int len = arr.length;
        int[] zero = new int[len];
        int rightZeroIndex = 0;
        int leftZeroIndex = 0;
        int count = 0;
        int max  = 0;
        int left = 0;
        int leftIndex = 0;
        for (int right = 0; right < len;right++){
            if (arr[right]==0){
                count++;
                zero[rightZeroIndex++] = right;
            }

            if (count > num){
                left = zero[leftZeroIndex++];
                count--;
                left++;
            }

            if (right - left + 1 > max){
                max = right - left + 1;
                leftIndex = left;
            }
        }
        System.out.println("The length of sequence longest is " + max + " (from index "
                + leftIndex + " to index " + (leftIndex + max - 1)+")");
        for (int i = leftIndex; i <= (leftIndex + max - 1); i++){
            if (arr[i] == 0) arr[i] = 1;
        }
        return arr;
    }

    public static int[] convertArray(String str){//Convert the String to the array
        String[] str_num = str.split(",");
        int len = str_num.length;
        int[] num = new int[len];
        int i;
        for (i = 0; len > i; i++){
            num[i] = Integer.parseInt(str_num[i]);
        }
        return num;
    }
}
