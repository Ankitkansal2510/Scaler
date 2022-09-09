package ClassAssignments.Day80ClassAssignment_AdvDSA_Tree5_26thAug2022;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

/***
 *
 * Given a binary tree A. Check whether it is possible to partition the tree to two trees which have equal sum of values after removing exactly one edge on the original tree.
 *
 *
 *
 * Problem Constraints
 * 1 <= size of tree <= 100000
 *
 * 0 <= value of node <= 109
 *
 *
 *
 * Input Format
 * First and only argument is head of tree A.
 *
 *
 *
 * Output Format
 * Return 1 if the tree can be partitioned into two trees of equal sum else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *                 5
 *                /  \
 *               3    7
 *              / \  / \
 *             4  6  5  6
 * Input 2:
 *
 *
 *                 1
 *                / \
 *               2   10
 *                   / \
 *                  20  2
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
 *  Remove edge between 5(root node) and 7:
 *         Tree 1 =                                               Tree 2 =
 *                         5                                                     7
 *                        /                                                     / \
 *                       3                                                     5   6
 *                      / \
 *                     4   6
 *         Sum of Tree 1 = Sum of Tree 2 = 18
 * Explanation 2:
 *
 *  The given Tree cannot be partitioned.
 * **/
public class EqualTreePartition {
    static boolean flag=false;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode f3=new TreeNode(3);
        TreeNode f7=new TreeNode(7);
        TreeNode f4=new TreeNode(4);
        TreeNode f6=new TreeNode(6);
        TreeNode f5=new TreeNode(5);
        TreeNode f16=new TreeNode(6);


        root.left=f3;
        root.right=f7;
        f3.left=f4;
        f3.right=f6;

        f7.left=f5;
        f7.right=f16;
        int result=isEqualTreePartition(root);
        System.out.println(result);
    }

    private static int isEqualTreePartition(TreeNode root) {
        long treeSum = findTotalSum(root);//find the total sum of the tree
        if (treeSum % 2 != 0) return 0;//if we have to do equal partition then total sum should be even
        check(root, treeSum / 2);//if equal partition is possible then there must be a subtree whose sum should
        //equal to totalSum/2 of the tree i.e treeSum/2;
        return flag ? 1 : 0;
    }
    private static long check(TreeNode A,long treeSum) {
        if (A == null) {
            return 0;
        }

        long leftSum = check(A.left, treeSum);
        long rightSum = check(A.right, treeSum);
        if (leftSum == treeSum || rightSum == treeSum) {
            flag = true;
        }
        return leftSum + rightSum + A.val;
    }
    private static long findTotalSum(TreeNode root) {
        if (root == null) return 0;
        return findTotalSum(root.left) + findTotalSum(root.right) + root.val;
    }
}
