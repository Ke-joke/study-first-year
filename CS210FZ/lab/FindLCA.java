import java.util.Scanner;

public class FindLCA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Input array
        String arrStr = inputStr(in);

        //Two nodes
        String xStr = inputStr(in);
        String yStr = inputStr(in);
        in.close();
        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);

        //Convert the String array to Integer array
        int[] A = convertArray(arrStr);

        //Find the LCA
        int LCA = findLCA(A, x, y);
        System.out.println(A[LCA]);
//        TreeNode treeNode = createTree(A, 0);
//        TreeNode l = LowestCommonAncestor(treeNode, x,y);
//        l.display();
    }

    public static int findLCA(int[] A, int p, int q){//Use the loop to find the LCA
        int indexP = 0;
        int indexQ = 0;
        if (p == q)return p;
        for (int i = 0;i < A.length;i++){
            if (A[i] == p) indexP = i;
            if (A[i] == q) indexQ = i;
        }
        while(indexP != indexQ) {
            if (indexP > indexQ) indexP = (indexP - 1) / 2;
            else {
                indexQ = (indexQ - 1) / 2;
            }
        }
        return indexP;
    }

    public static int[] convertArray(String arrStr){//Convert the String to Integer
        arrStr = arrStr.replace(" ","");
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

//    public static TreeNode LowestCommonAncestor(TreeNode root, int p, int q){
//        if (root == null||root.val == p||root.val ==q) return root;
//        TreeNode left = LowestCommonAncestor(root.left, p, q);
//        TreeNode right = LowestCommonAncestor(root.right, p, q);
//        if (left == null) return right;
//        if (right == null) return left;
//        return root;
//    }
//
//    public static TreeNode createTree(int[] array,int index){
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