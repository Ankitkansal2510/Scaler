package ClassAssignments.Day81ClassAssignment_AdvDSATree6_29thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

/**
 *
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 *
 * -100000 <= B, value of nodes <= 100000
 *
 *
 *
 * Input Format
 * First argument is a root node of the binary tree, A.
 *
 * Second argument is an integer B denoting the sum.
 *
 *
 *
 * Output Format
 * Return 1, if there exist root-to-leaf path such that adding up all the values along the path equals the given sum. Else, return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  Tree:    5
 *          / \
 *         4   8
 *        /   / \
 *       11  13  4
 *      /  \      \
 *     7    2      1
 *
 *  B = 22
 * Input 2:
 *
 *  Tree:    5
 *          / \
 *         4   8
 *        /   / \
 *      -11 -13  4
 *
 *  B = -1
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
 *  There exist a root-to-leaf path 5 -> 4 -> 11 -> 2 which has sum 22. So, return 1.
 * Explanation 2:
 *
 *  There is no path which has sum -1.
 * **/
public class PathSum {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        TreeNode f4=new TreeNode(4);
        TreeNode f8=new TreeNode(8);
        TreeNode f11=new TreeNode(11);
        TreeNode f13=new TreeNode(13);
        TreeNode f14=new TreeNode(4);
        TreeNode f7=new TreeNode(7);
        TreeNode f2=new TreeNode(2);
        TreeNode f1=new TreeNode(1);
        root.left=f4;
        root.right=f8;
        f4.left=f11;
        f8.left=f13;
        f8.right=f14;
        f11.left=f7;
        f11.right=f2;
        f14.right=f1;
        int B=22;
        int result=findPathSum(root,B);
        System.out.println(result);
    }

    private static int findPathSum(TreeNode A,int B){

        return isExistPath(A,0,B)?1:0;
    }

    private static boolean isExistPath(TreeNode A,int previousSum,int B){
        if(A==null){
            return false;
        }

        if(A.left==null && A.right==null){
            if(A.val+previousSum==B){
                return true;
            }
        }

        return isExistPath(A.left,previousSum+A.val,B) || isExistPath(A.right,previousSum+A.val,B);
    }
}
