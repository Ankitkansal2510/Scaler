package ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022;

import java.util.ArrayList;
class Pair {
    int min;
    int max;
    int size;
    public Pair(int min, int max, int size) {
        this.min = min;
        this.max = max;
        this.size = size;
    }
}
public class LargestBSTSubtree {
   static boolean isBST = true;
   static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode f5=new TreeNode(5);
        TreeNode f1=new TreeNode(1);
        TreeNode f8=new TreeNode(8);
        TreeNode one5=new TreeNode(15);
        TreeNode f7=new TreeNode(7);

        root.left=f5;
        root.right=one5;
        f5.left=f1;
        f5.right=f8;
        one5.right=f7;

      /*  TreeNode root=new TreeNode(1);
        TreeNode f2=new TreeNode(2);
        TreeNode f3=new TreeNode(3);
        TreeNode f4=new TreeNode(4);
        TreeNode f5=new TreeNode(5);


        root.left=f2;
        root.right=f3;
        f3.left=f4;
        f4.right=f5;*/


        int size=findSizeLargestBST(root);
        System.out.println(size);
    }

    private static int findSizeLargestBST(TreeNode A){

        travel(A);
        return max;
    }

    private static Pair travel(TreeNode A){

        if(A == null) {
            return new Pair(Integer.MAX_VALUE,Integer.MIN_VALUE,0);

        }

        Pair left = travel(A.left);
        Pair right = travel(A.right);

        if(A.val <= left.max || A.val >= right.min) {
            isBST = false;
        }
        if(isBST) {
            max = Math.max(max, left.size + right.size + 1);
        }
        return new Pair(Math.min(left.min, A.val), Math.max(right.max, A.val), left.size + right.size + 1);
    }


}
