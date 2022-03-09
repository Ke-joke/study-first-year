import java.util.Scanner;

public class findLargestSmallestNum {
    public static void main(String[] args) {
        // Given an input string of a sequence
        // of integers from the console.
        Scanner in = new Scanner(System.in);

        // Create a String
        String s = in.nextLine();

        // Change the string to the integer array
        int[] num = createArray(s);

        // Find the maximum elements of this array.
        int max = compareMax(num);

        // Find the minimum elements of this array.
        int min = compareMin(num);

        System.out.println("Max = "+max+
                "\nMin = "+ min);
        in.close();
    }

    // Create an array of integer，
    // read the string and parse
    // it as an unsorted array of integers
    public static int[] createArray(String s){
        // Read the string and parse it
        // as an unsorted array of integers
        String[] stringNum = s.split(",");
        int len = stringNum.length;
        int[] num = new int[len];
        for (int i = 0; i < len; i++){
            num[i] = Integer.parseInt(stringNum[i]);
        }
        return num;
    }

    // Find the maximum elements of this array.
    public static int compareMax(int[] num){
        int max = num[0];
        int len = num.length;
        for(int i = 1; i < len; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    // Find the maximum elements of this array.
    public static int compareMin(int[] num){
        int min = num[0];
        int len = num.length;
        for(int i = 1; i < len; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
}
