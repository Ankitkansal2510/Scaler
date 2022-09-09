package ClassAssignments.Day80ClassAssignment_AdvDSA_Tree5_26thAug2022;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

/**
 * Problem Description
 * Given a binary tree A, invert the binary tree and return it.
 *
 * Inverting refers to making the left child the right child and vice versa.
 *
 *
 *
 * Problem Constraints
 * 1 <= size of tree <= 100000
 *
 *
 *
 * Input Format
 * First and only argument is the head of the tree A.
 *
 *
 *
 * Output Format
 * Return the head of the inverted tree.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *      1
 *    /   \
 *   2     3
 * Input 2:
 *
 *
 *      1
 *    /   \
 *   2     3
 *  / \   / \
 * 4   5 6   7
 *
 *
 * Example Output
 * Output 1:
 *
 *
 *      1
 *    /   \
 *   3     2
 * Output 2:
 *
 *
 *      1
 *    /   \
 *   3     2
 *  / \   / \
 * 7   6 5   4
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Tree has been inverted.
 * Explanation 2:
 *
 * Tree has been inverted.
 *
 * **/
public class InvertTheBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode f2=new TreeNode(2);
        TreeNode f3=new TreeNode(3);

        root.left=f2;
        root.right=f3;
        TreeNode A=invertTree(root);
        printTree(A);
    }
    private static TreeNode invertTree(TreeNode A){
        if(A==null){
            return null;
        }
    /***
     *
     * Call invert for left-subtree.
     * Call invert for right-subtree.
     * Swap left and right subtrees.
     * ***/
        TreeNode left=invertTree(A.left);
        TreeNode right=invertTree(A.right);
        A.left=right;
        A.right=left;
        return A;

    }

    private static void printTree(TreeNode A){

        if(A==null){
            return;
        }

        printTree(A.left);
        System.out.print(A.val + " ");
        printTree(A.right);
    }
}
