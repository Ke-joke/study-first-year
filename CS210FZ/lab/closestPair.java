import java.util.Scanner;

public class closestPair {
    // Find the closest pair
    public static void main(String[] args) {
        // Given an input string of a sequence
        // of integers from the console.
        Scanner in = new Scanner(System.in);

        // Create a String
        String s = in.nextLine();

        // Change the string to the integer array
        int[] num = createArray(s);

        // Find the closest pair of the adjacent element
        findClosest(num);
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

    // Find the closest pair of the adjacent element
    public static void findClosest(int[] num){
        int len = num.length-1
                , min = Integer.MAX_VALUE
                , temp;
        int[] subtract = new int[len];
        for (int i = 0; i < len; i++){
            temp = num[i] - num[i+1];
           if (temp < 0) temp = -temp;
           if (temp < min) min = temp;
           subtract[i] = temp;
        }
        for (int i = 0; i < num.length-1; i++) {
            if(subtract[i] == min) System.out.println("Pair found at index "+ i +" and "+ (i+1));
        }
    }
}
