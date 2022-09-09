package ClassAssignments.Day80ClassAssignment_AdvDSA_Tree5_26thAug2022;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

import java.util.ArrayList;

/**
 * Given a binary search tree represented by root A, write a function to find the Bth smallest element in the tree.
 *
 *
 *
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 100000
 *
 * 0 <= node values <= 10^9
 *
 *
 *
 * Input Format
 * First and only argument is head of the binary tree A.
 *
 *
 *
 * Output Format
 * Return an integer, representing the Bth element.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *             2
 *           /   \
 *          1    3
 * B = 2
 * Input 2:
 *
 *
 *             3
 *            /
 *           2
 *          /
 *         1
 * B = 1
 *
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * 2nd element is 2.
 * Explanation 2:
 *
 * 1st element is 1.
 *
 * **/
public class KthSmallestElementInBST {
    static int k = 0;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        TreeNode f1=new TreeNode(1);
        TreeNode f3=new TreeNode(3);

        root.left=f1;
        root.right=f3;
        int B=2;
        int result=findKthSmallestElem(root,B);
        System.out.println(result);


        int result1=kthsmallest(root,B);
        System.out.println(result1);
    }

    private static int findKthSmallestElem(TreeNode root,int B){
        ArrayList<Integer> list=new ArrayList<>();

        list=findInorder(root,list);
        return list.get(B-1);
    }

    private static ArrayList<Integer> findInorder(TreeNode root,ArrayList<Integer> list){
        if(root==null)return null;

        findInorder(root.left,list);
        list.add(root.val);
        findInorder(root.right,list);
        return list;
    }
//Below is the 2nd approach
    public static int kthsmallest(TreeNode A, int B) {
        k = B;
        return find(A);
    }
    public static int find(TreeNode root) {
        if (root == null)
            return -1;
        // We do an inorder traversal here.
        int k1 = find(root.left);
        if (k == 0) {
            return k1;
        }// left subtree has k or more elements.
        k--;
        if (k == 0)
            return root.val; // root is the kth element.
        return find(root.right); // answer lies in the right node.
    }
}
