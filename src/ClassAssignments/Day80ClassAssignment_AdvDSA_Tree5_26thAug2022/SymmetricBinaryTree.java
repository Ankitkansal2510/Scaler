package ClassAssignments.Day80ClassAssignment_AdvDSA_Tree5_26thAug2022;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

/**
 *
 * Given a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 *
 *
 *
 * Input Format
 * First and only argument is the root node of the binary tree.
 *
 *
 *
 * Output Format
 * Return 0 / 1 ( 0 for false, 1 for true ).
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * Input 2:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  The above binary tree is symmetric.
 * Explanation 2:
 *
 * The above binary tree is not symmetric.
 * ***/
public class SymmetricBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(4);
        TreeNode six=new TreeNode(3);
        root.left=first;
        root.right=second;
        first.left=third;
        first.right=fourth;
        second.left=fifth;
        second.right=six;

        int reusult=isSymettric(root);
        System.out.println(reusult);

    }

    private static int isSymettric(TreeNode root){
        if(root==null){
            return 0;
        }

        return rec(root.left,root.right)?1:0;
    }

    private static boolean rec(TreeNode A,TreeNode B){
        if(A==null && B==null)return true;

        if(A==null|| B==null){
            return false;
        }

        if(A.val!=B.val){
            return false;
        }

        return rec(A.left,B.right) && rec(A.right,B.left);
    }
}
