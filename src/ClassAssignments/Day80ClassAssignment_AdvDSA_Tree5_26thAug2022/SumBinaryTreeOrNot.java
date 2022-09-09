package ClassAssignments.Day80ClassAssignment_AdvDSA_Tree5_26thAug2022;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

/**
 *
 * Given a binary tree. Check whether the given tree is a Sum-binary Tree or not.
 *
 * Sum-binary Tree is a Binary Tree where the value of a every node is equal to sum of the nodes present in its left subtree and right subtree.
 *
 * An empty tree is Sum-binary Tree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.
 *
 * Return 1 if it sum-binary tree else return 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= length of the array <= 100000
 *
 * 0 <= node values <= 50
 *
 *
 *
 * Input Format
 * The only argument given is the root node of tree A.
 *
 *
 *
 * Output Format
 * Return 1 if it is sum-binary tree else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *        26
 *      /    \
 *     10     3
 *    /  \     \
 *   4   6      3
 * Input 2:
 *
 *        26
 *      /    \
 *     10     3
 *    /  \     \
 *   4   6      4
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
 *  All leaf nodes are considered as SumTree.
 *  Value of Node 10 = 4 + 6.
 *  Value of Node 3 = 0 + 3
 *  Value of Node 26 = 20 + 6
 * Explanation 2:
 *
 *  Sum of left subtree and right subtree is 27 which is not equal to the value of root node which is 26.
 * **/
public class SumBinaryTreeOrNot {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(26);
        TreeNode f10=new TreeNode(10);
        TreeNode f3=new TreeNode(3);
        TreeNode f4=new TreeNode(4);
        TreeNode f6=new TreeNode(6);
        TreeNode f13=new TreeNode(3);

        root.left=f10;
        root.right=f3;
        f10.left=f4;
        f10.right=f6;
        f3.right=f13;

        int result=isSumBT(root);
        System.out.println(result);
    }

    private static int isSumBT(TreeNode A){

        return isSumTree(A) == Integer.MIN_VALUE ? 0:1;
    }

    private static int isSumTree(TreeNode A){
        if(A==null){
            return 0;
        }
        if(A.left==null && A.right==null){
            return A.val;
        }
        int leftSum = isSumTree(A.left);
        int rightSum = isSumTree(A.right);
        if (leftSum + rightSum == A.val) {
            return 2 * A.val;
        }
        return Integer.MIN_VALUE;
    }
}
