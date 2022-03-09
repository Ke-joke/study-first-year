import java.util.Scanner;

public class reverseElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Input the array, the number of consecutive elements, the first index of sub_array,the second index of sub_array
        String s1 = in.nextLine();
        String mS = in.nextLine();
        String fS = in.nextLine();
        String lS = in.nextLine();
        in.close();

        int[] arr = convertArray(s1);
        int m = Integer.parseInt(mS);
        int first = Integer.parseInt(fS);
        int last = Integer.parseInt(lS);
        arr = reverseArr(arr, m, first, last);
        toString(arr);
    }

    public static void toString(int[] arr){
        int i;
        int len = arr.length;
        for (i = 0;i < len;i++){
            if (i == len-1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i]+",");
        }
    }

    public static int[] reverseSub(int[] arr, int first, int last){
        while(first < last){
            int temp = arr[first];
            arr[first++] = arr[last];
            arr[last--] = temp;
        }
        return arr;
    }

    public static int[] reverseArr(int[] arr, int m, int first, int last){
        int temp;
        while(true){
            temp = first;
            first += m;
            if (temp >= last||(first != last+1&&first > last)) break;
            arr = reverseSub(arr, temp, first-1);
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
