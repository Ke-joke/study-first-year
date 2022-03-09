import java.util.Scanner;

public class sortCombined {
    public static void main(String[] args) {
        // Given an input string of a sequence
        // of integers from the console.
        Scanner in = new Scanner(System.in);

        // Create a String
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        // Change the string to the integer array
        int[] num1 = createArray(s1);
        int[] num2 = createArray(s2);

        // Combine those arrays being one and
        // sorting it from small to large.
        int[] combine =combinedTwoArray(num1, num2);

        for(int i = 0; i < combine.length; i++) {
            if (i == combine.length-1) {
                System.out.println(combine[i]);
                break;
            }
            System.out.print(combine[i]+",");
        }
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

    public static int[] combinedTwoArray(int[] num1, int[] num2) {
        int len1 = num1.length,
                len2 = num2.length,
                len = len1 + len2;
        int temp1 = 0, temp2 = 0, temp = 0;
        int[] combine = new int[len];
        while(temp1 < len1 && temp2 < len2){
            combine[temp++] = num1[temp1] < num2[temp2] ? num1[temp1++] : num2[temp2++];
        }
        while(temp1 < len1){
            combine[temp++] = num1[temp1++];
        }
        while(temp2 < len2){
            combine[temp++] = num2[temp2++];
        }
        return combine;
    }
}
