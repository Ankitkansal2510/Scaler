package ClassAssignments.Day79ClassAssignment_AdvDSAS_Tree4_24thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

/***
 *
 * Given two binary trees, check if they are equal or not.
 *
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 *
 *
 *
 * Input Format
 * The first argument is a root node of the first tree, A.
 *
 * The second argument is a root node of the second tree, B.
 *
 *
 *
 * Output Format
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *    1       1
 *   / \     / \
 *  2   3   2   3
 * Input 2:
 *
 *    1       1
 *   / \     / \
 *  2   3   3   3
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
 *  Both trees are structurally identical and the nodes have the same value.
 * Explanation 2:
 *
 *  Values of the left child of the root node of the trees are different.
 * **/
public class IdenticalBinaryTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode f2 = new TreeNode(2);
        TreeNode f3 = new TreeNode(3);

        root1.left = f2;
        root1.right = f3;

        TreeNode root2 = new TreeNode(1);
        TreeNode f2s = new TreeNode(2);
        TreeNode f3s = new TreeNode(3);

        root2.left = f2s;
        root2.right = f3s;

        int ans = isIdentical(root1, root2);
        System.out.println(ans);
    }

    private static int isIdentical(TreeNode A, TreeNode B) {
        // 0 for false
        //1 for true
        if (A == null && B == null) {
            return 1;
        }

        if ((A == null && B != null) || (A != null && B == null)) {
            return 0;
        }
        if (A.val != B.val) {
            return 0;
        }
       // return isIdentical(A.left, B.left) & isIdentical(A.right, B.right);//This is the AND OPERATOR , 1&1=1 , 1&0=0
        //or instead of above oomplete return we can do

        int lh=isIdentical(A.left, B.left);
        int rh=isIdentical(A.right, B.right);
        return (lh&rh);
    }
}