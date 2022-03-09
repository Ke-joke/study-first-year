import java.util.Scanner;

public class findSubarray {
    public static void main(String[] args) {
        // Step1: Give the string of the array and specify add num.
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int num = in.nextInt();
        in.close();

        // Step2: Create array.
        int[] arr = transportArray(s);

        // Step3: Find the addition of subarray equals the specific number.
        int[] find = findSub(arr, num);

        // Print the find subarray to the screen.
        for (int i=find[0];i<find[1];i++){
            if (i==find[1]-1) {
                System.out.println(arr[i] + "\n" + find[2]);
                break;
            }
            System.out.print(arr[i]+",");
        }
    }

    // Find the subarray addition equals num and return the max length subarray.
    public static int[] findSub(int[] arr, int num){
        int len=arr.length, i, j,addition=0;

        // To storage the start, end, and length of subarray.
        int[] find=new int[3];

        // To find the addition of subarray equals num and find the max length subarray.
        for (i=0;i<len;i++){
            for (j=i;j<len;j++){
                addition+=arr[j];
                if (addition==num){
                    if (find[2]<(j+1-i)) {
                        find[0] = i;
                        find[1] = j+1;
                        find[2] = j+1-i;
                    }
                }
            }
        }
        return find;
    }

    // Transport the string to the integer of array.
    public static int[] transportArray(String s){
        String[] temp = s.split(",");
        int len = temp.length, i;
        int[] num = new int[len];
        for(i=0;i<len;i++)
            num[i] = Integer.parseInt(temp[i]);
        return num;
    }
}
