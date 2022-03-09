import java.util.Arrays;
import java.util.Scanner;

public class countingSort1 {
    public static void main(String[] args) {
        //Input the unsorted array
        String str_num = inputNum();
        int[] num =  convertArray(str_num);
        //Sorting the array
        int len = num.length;
        int max_num = compareNum(num, len);
        System.out.println(Arrays.toString(countSort(num, max_num+1, len)));
    }

    public static int[] countSort(int[] num, int max, int len){//Compute the count array
        int[] count = new int[max];
        int index;
        int i, j;
        int temp = 0;
        for (i = 0; i < len; i++){
            System.out.println("Step "+i+": Count = "+ Arrays.toString(count));
            for (index = 0; index < max; index++){
                if(num[i] == index) {
                    count[index] += 1;
                }
            }
        }
        for (j = 0; j < max; j++){
            temp += count[j];
            count[j] = temp;
            System.out.println("Step "+(i+j)+": Count = "+ Arrays.toString(count));
        }
        return sorting(num, count, i+j, len);
    }

    public static int[] sorting(int[] num, int[] count, int step, int len){//Sorting the array
        int i, j;
        int[] sortNum = new int[len];
        /*
        for (i = len2-1; i >= 0; i--){
            if (i != 0 && count[i] == count[i-1])continue;
            if (i == 0 && count[i] == 0)break;
            count[i] -= 1;
            num[count[i]] = i;
            if (i != 0 && count[i-1] != count[i])i++;
            if (i == 0 && count[i] != 0)i++;
            System.out.println("Step "+step+": Count = "+ Arrays.toString(count));
            step++;
        }
        */
        for (i = 0; i < len; i++){
            j = num[i];
            count[j] -= 1;
            sortNum[count[j]] = num[i];
            System.out.println("Step "+step+": Count = "+ Arrays.toString(count));
            step++;
        }
        return sortNum;
    }

    public static int compareNum(int[] num, int len){//Find the max num in the array
        int max = num[0];
        int i;
        for (i = 0; i < len; i++){
            if (max < num[i]){
                max = num[i];
            }
        }
        return max;
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
        String str = in.nextLine();
        in.close();
        return str;
    }
}
