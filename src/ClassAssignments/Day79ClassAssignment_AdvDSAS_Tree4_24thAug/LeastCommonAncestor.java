package ClassAssignments.Day79ClassAssignment_AdvDSAS_Tree4_24thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

/***
 *
 * Find the lowest common ancestor in an unordered binary tree A, given two values, B and C, in the tree.
 *
 * Lowest common ancestor: the lowest common ancestor (LCA) of two nodes and w in a tree or directed acyclic graph (DAG) is the lowest (i.e., deepest) node that has both v and w as descendants.
 *
 *
 *
 * Problem Constraints
 * 1 <= size of tree <= 100000
 *
 * 1 <= B, C <= 109
 *
 *
 *
 * Input Format
 * First argument is head of tree A.
 *
 * Second argument is integer B.
 *
 * Third argument is integer C.
 *
 *
 *
 * Output Format
 * Return the LCA.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *       1
 *      /  \
 *     2    3
 * B = 2
 * C = 3
 * Input 2:
 *
 *       1
 *      /  \
 *     2    3
 *    / \
 *   4   5
 * B = 4
 * C = 5
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  LCA is 1.
 * Explanation 2:
 *
 *  LCA is 2.
 * */
public class LeastCommonAncestor {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode f2=new TreeNode(2);
        TreeNode f3=new TreeNode(3);
        TreeNode f4=new TreeNode(4);
        TreeNode f5=new TreeNode(5);
        root.left=f2;
        root.right=f3;
        f2.left=f4;
        f2.right=f5;
        int B=4;
        int C=5;
        int LCA=findLCA(root,B,C);
        System.out.println(LCA);
    }
    private static int findLCA(TreeNode A,int B,int C){

        //First we will find if both B and C nodes exist in Binary Tree ,if it doesn't exist then we will return
        //-1 else we return the LCA

        if(!isExist(A,B) || !isExist(A,C)){
            return -1;
        }
        //Now we know both B and C exist in the Tree so we will find the LCA and return the valu
        TreeNode node=LCA(A,B,C);
        return node.val;
    }

    private static boolean isExist(TreeNode A,int data) {

        if (A == null) {
            return false;
        }
        if (A.val == data) {
            return true;
        }
        return (isExist(A.left,data) || isExist(A.right,data));
    }

    public static TreeNode LCA(TreeNode A,int B,int C){
        if(A==null){
            return null;
        }

        if(A.val==B || A.val==C){
            return A;
        }

        TreeNode left_lca=LCA(A.left,B,C);
        TreeNode right_lca=LCA(A.right,B,C);

        if(left_lca!=null && right_lca!=null){
            return A;
        }
        return (left_lca!=null)?left_lca:right_lca;
    }




}
