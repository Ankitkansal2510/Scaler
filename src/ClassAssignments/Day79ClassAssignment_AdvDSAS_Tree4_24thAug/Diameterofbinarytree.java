package ClassAssignments.Day79ClassAssignment_AdvDSAS_Tree4_24thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;
import sun.reflect.generics.tree.Tree;

/***
 * Given a Binary Tree A consisting of N integer nodes, you need to find the diameter of the tree.
 *
 * The diameter of a tree is the number of edges on the longest path between two nodes in the tree.
 *
 *
 *
 * Problem Constraints
 * 0 <= N <= 105
 *
 *
 *
 * Input Format
 * First and only Argument represents the root of binary tree A.
 *
 *
 *
 * Output Format
 * Return an single integer denoting the diameter of the tree.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *            1
 *          /   \
 *         2     3
 *        / \
 *       4   5
 * Input 2:
 *
 *             1
 *           /   \
 *          2     3
 *         / \     \
 *        4   5     6
 *
 *
 * Example Output
 * Output 1:
 *
 *  3
 * Output 2:
 *
 *  4
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Longest Path in the tree is 4 -> 2 -> 1 -> 3 and the number of edges in this path is 3 so diameter is 3.
 * Explanation 2:
 *
 *  Longest Path in the tree is 4 -> 2 -> 1 -> 3 -> 6 and the number of edges in this path is 4 so diameter is 4.
 *
 * **/
public class Diameterofbinarytree {
        static int ans=0;
    public static void main(String[] args) {
       /* TreeNode root=new TreeNode(1);
        TreeNode f2=new TreeNode(2);
        TreeNode f3=new TreeNode(3);
        TreeNode f4=new TreeNode(4);
        TreeNode f5=new TreeNode(5);
        root.left=f2;
        root.right=f3;
        f2.left=f4;
        f2.right=f5;*/

        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        root.left=first;


        int height=findDiameter(root);
        System.out.println(ans);
    }

    private static int findDiameter(TreeNode A){
        if(A==null){
            return -1;
        }
        int lh=findDiameter(A.left);
        int rh=findDiameter(A.right);
        ans=Math.max(ans,lh+rh+2);
        return 1+Math.max(lh,rh);

    }
}
