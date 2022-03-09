import java.util.Scanner;

public class powerOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Read two integer inputs from console
        int m = in.nextInt();
        int n = in.nextInt();
        in.close();
        double output = computePower(m,n);
        System.out.println(output);
    }

    // Compute the power of num
    public static double computePower(int m, int n){
        double num = 1;
        double newM = m;
        int i;
        if (n < 0){
            newM = 1.0/m;
            n = -n;
        }
        if (n == 0){
            return num;
        }
        for (i = n; i > 0; i--){
            num *= newM;
        }
        return num;
    }
}
