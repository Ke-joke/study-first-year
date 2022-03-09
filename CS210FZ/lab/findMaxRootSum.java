import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class findMaxRootSum{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Input array
        String arrStr = inputStr(in);
        in.close();

        //Convert the String array to Integer array
        int[] A = convertArray(arrStr);

        findMaxRoot(A);
    }

    public static void findMaxRoot(int[] A){
        int max = -1;
        int maxPath = -1;
        int len = A.length;
        for (int i = 0;i<len;i++){
            if (A[i]==0) continue;
            int sum = 0, a = i;
            while(a >= 0){
                sum += A[a];
                if ((a-1)<0)break;
                a = (a-1)/2;
            }
            if (sum > max){
                max = sum;
                maxPath = i;
            }
        }
        ArrayList<Integer> path =new ArrayList<Integer>();
        int temp = maxPath;
        while(temp >= 0) {
            path.add(0,A[temp]);
            if ((temp-1) < 0) break;
            temp = (temp-1)/2;
        }
        System.out.println("Max sum is "+max+", with a path "+ Arrays.toString(path.toArray()));
    }

    public static int[] convertArray(String arrStr){//Convert the String to Integer
        arrStr = arrStr.trim();
        String[] S = arrStr.split(",");
        int len = S.length;
        int[] A = new int[len];
        for (int i = 0;i < len;i++){
            A[i] = Integer.parseInt(S[i]);
        }
        return A;
    }

    public static String inputStr(Scanner in){//Input the string of array.
        String arrStr = in.nextLine();
        return arrStr;
    }
}



//
//    //Convert the array to TreeNode
//    TreeNode treeNode = createTree(A, 0);
//
//    //Find max root sum
//    int[] path = new int[512];
//    maxSumPath(treeNode, path);
//
//    private static int maxSum = 0;
//    private static int[] arr;
//
//    public static void maxSumPath(TreeNode root, int[] path) {
//        maxSum = Integer.MIN_VALUE;
//        maxSumPathRoot2Leaf(root, path, 0, 0);
//        System.out.print("Max sum is" + maxSum);
//        System.out.println(", with a path " + Arrays.toString(arr));
//    }
//
//    public static void maxSumPathRoot2Leaf(TreeNode root, int[] path, int index, int sum) {
//        if (null == root) {
//            return;
//        }
//        path[index++] = root.val;
//        sum += root.val;
//        if (root.left == null && root.right == null) {
//            if (sum > maxSum) {
//                maxSum = sum;
//                arr = Arrays.copyOf(path, index);
//            }
//            return;
//        }
//        maxSumPathRoot2Leaf(root.left, path, index, sum);
//        maxSumPathRoot2Leaf(root.right, path, index, sum);
//        return;
//    }
//
//    public static TreeNode createTree(int[] array,int index){//Input the array value to the binary TreeNode
//        TreeNode treeNode = null;
//        if (index<array.length) {
//            Integer value = array[index];
//            if (value == null) {
//                return null;
//            }
//            treeNode = new TreeNode(value);
//            treeNode.left = createTree(array, 2*index+1);
//            treeNode.right = createTree(array, 2*index+2);
//            return treeNode;
//        }
//        return treeNode;
//    }
