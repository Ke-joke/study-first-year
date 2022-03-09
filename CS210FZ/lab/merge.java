import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        in.close();
        String[] arr1 = convertString(s1);
        String[] arr2 = convertString(s2);
        int[] x = convertToInteger(arr1);
        int[] y = convertToInteger(arr2);
        x = mergeArray(x,y);
        toString(x);
    }

    public static void toString(int[] x){
        int i;
        int len = x.length;
        for (i = 0;i < len;i++){
            if (i == len-1) {
                System.out.println(x[i]);
                break;
            }
            System.out.print(x[i]+",");
        }
    }

    public static int[] mergeArray(int[] x, int[] y){
        int m = x.length;
        int i = 0;
        int temp1 = 0;
        int temp2 = 0;
        while(true){
            if (i == m||temp1 == m) break;
            if (x[temp1] != 0){
                if (x[temp1] < y[temp2]){
                    if (i != temp1) {
                        x[i] = x[temp1];
                        x[temp1] = 0;
                    }
                    temp1++;
                }else {
                    x[i] = y[temp2++];
                }
                i++;
            }else {
                temp1++;
            }
        }
        while(i < m){
            x[i++] = y[temp2++];
        }
        return x;
    }

    public static int[] convertToInteger(String[] sArray){//Convert Array of String to Integer.
        int len = sArray.length;
        int[] arr = new int[len];
        int i;
        for (i = 0;i < len;i++){
            arr[i] = Integer.parseInt(sArray[i]);
        }
        return arr;
    }

    public static String[] convertString(String s){//Convert String to Array of String.
        String[] sArray = s.split(",");
        return sArray;
    }

}

