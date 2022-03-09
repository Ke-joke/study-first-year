import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input string of a signed 32-bit integer: ");
        while(true) {
            String s = in.nextLine();
            if (s.equals("q"))break;
            if (!s.matches("-{0,1}[0-9]*")) {
                System.out.println("Please input a correct integer number: ");
                return;
            }
            boolean check = checkInteger(s);
            if (check==true) {
                System.out.println(reverseInt(s));
            }else {
                System.out.println(0);
            }
            System.out.println("Please input another string of a signed 32-bit integer: ");
        }
        in.close();
    }
    public static boolean checkInteger(String num){
        if (Long.parseLong(num)<=Integer.MAX_VALUE&&Long.parseLong(num)>=Integer.MIN_VALUE){
            return true;
        }
        return false;
    }
    public static String reverseInt(String num){
        String reverseNum = "";
        String temp = "";
        if ((num.substring(0,1)).equals("-")){
            reverseNum = num.substring(0,1);
            num = num.substring(1);
        }
        int length = num.length();
        for(int i = 0; i < length; i++){
            reverseNum += num.substring(num.length()-1);
            num = num.substring(0,num.length()-1);
        }
        return reverseNum;
    }
}
