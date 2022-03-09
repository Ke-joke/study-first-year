import java.util.Scanner;

public class FFAC {
    private static String[] s1;
    private  static int flour;
    private static int ceil;
    private static int[] a;

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        inputString(s);
        int len = a.length;
        int num = s.nextInt();
        s.close();

        findFlourAndCeil(num, len);
    }

    private static void findFlourAndCeil(int num, int len){
        boolean check = true;
        if (num < a[0]) {
            flour = -999;
            ceil = a[0];
            check = false;
        }else if (num > a[len - 1]) {
            flour = a[len - 1];
            ceil = -999;
            check = false;
        }
        int first = 0, second = len;
        int middle = (first+second)/2;
        while(check&&(middle >= first||middle <= second)) {
            if (num > a[middle]){
                if (num < a[middle+1]){
                    flour = a[middle];
                    ceil = a[middle+1];
                    break;
                }
                first = middle+1;
            }else if (num < a[middle]){
                if (num > a[middle-1]){
                    flour = a[middle-1];
                    ceil = a[middle];
                    break;
                }
                second = middle-1;
            }else {
                flour = a[middle];
                ceil = a[middle];
                break;
            }
            middle = (first+second)/2;
        }
        System.out.println(flour+","+ceil);
    }

    private static void convertArray(String s) {
        s1 = s.split(",");
        a = new int[s1.length];
        int i = 0;
        for (String n : s1) {
            a[i++] = Integer.parseInt(n);
        }
    }

    private static void inputString(Scanner in){
        String s = in.nextLine();
        convertArray(s);
    }
}
