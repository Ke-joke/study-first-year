import java.util.Scanner;

public class moveSpecificNum {
    public static void main(String[] args) {

        // Step1: Give the string of the array and specify add num.
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int num = in.nextInt();
        in.close();

        // Step2: Create array.
        int[] arr = transportArray(s);

        // Step3: Move the specific to the end.
        int[] newArr = MoveSpecificNum(arr, num);

        // Print the array.
        for (int i=0;i<newArr.length;i++){
            if(i==newArr.length-1){
                System.out.println(newArr[i]);
                break;
            }
            System.out.print(newArr[i]+",");
        }
    }

    // Move the specific number to the end of the array and return the array to main function.
    public static  int[] MoveSpecificNum(int[] arr, int num){
        int len = arr.length, i, j=0;
        int[] newArr = new int[len];
        for(i=0;i<len;i++){
            if(arr[i]!=num)
                newArr[j++] = arr[i];
        }
        while(j<len)
            newArr[j++] = num;
        return newArr;
    }

    // Transport the String to the integer array and return it to main function.
    public static int[] transportArray(String arr){
        String[] temp = arr.split(",");
        int len = temp.length;
        int[] num = new int[len];
        for(int i = 0; i < len; i++)
            num[i] = Integer.parseInt(temp[i]);
        return num;
    }
}
