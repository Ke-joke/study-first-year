import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        // Transport the string to the array
        int[] num = tranArray(s);
        int len = num.length;

        // Use the selectionSort to sort the array;
        sortArray(num, len);
    }

    // Swap the num
    public static void swap(int first, int second, int[] num){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }

    //Use sort the array
    public static void sortArray(int[] num, int len){
        int i, j;
        int min;
        for (i = 0;i < len;i++){
            min = i;
            for (j = i+1;j < len;j++){
                if (num[j] < num[min]){
                    min = j;
                }
            }
            swap(i, min, num);
            if (i == len-1){
                System.out.println("Step " + i + ": arr = " + Arrays.toString(num));
                break;
            }
            System.out.println("Step " + i + ": arr = " + Arrays.toString(num) + ", and min_position = " + min);
        }
    }

    // Transport the string to the array
    public static int[] tranArray(String s){
        String[] arrayS = s.split(",");
        int len = arrayS.length;
        int[] num = new int[len];
        for (int i = 0;i < len;i++){
            num[i] = Integer.parseInt(arrayS[i]);
        }
        return num;
    }
}
