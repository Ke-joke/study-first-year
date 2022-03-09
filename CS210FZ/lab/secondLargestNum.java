import java.util.Scanner;

public class secondLargestNum {
    public static void main(String[] args) {
        //Input the unsorted array
        String str_num = inputNum();
        int[] num =  convertArray(str_num);
        //Find the Second largest
        int second_num = findSecond(num);
        //Print the second
        if (second_num != Integer.MIN_VALUE){
            System.out.println(second_num);
        }else {
            System.out.println("No second largest number found in the given array");
        }
    }

    public static int findSecond(int[] num){//Find the second-largest number
        int max = Integer.MIN_VALUE, next_max = 0;
        for (int i: num){
            if (i > max){
                next_max = max;
                max = i;
                continue;
            }
            if (i > next_max && i != max){
                next_max = i;
            }
        }
        return next_max;
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

    public static String inputNum(){//Scanner the String of the num
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
