package ClassAssignments.Day79ClassAssignment_AdvDSAS_Tree4_24thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * Given two BST's A and B, return the (sum of all common nodes in both A and B) % (109 +7) .
 *
 * In case there is no common node, return 0.
 *
 * NOTE:
 *
 * Try to do it one pass through the trees.
 *
 *
 *
 * Problem Constraints
 * 1 <= Number of nodes in the tree A and B <= 105
 *
 * 1 <= Node values <= 106
 *
 *
 *
 * Input Format
 * First argument represents the root of BST A.
 *
 * Second argument represents the root of BST B.
 *
 *
 *
 * Output Format
 * Return an integer denoting the (sum of all common nodes in both BST's A and B) % (109 +7) .
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  Tree A:
 *     5
 *    / \
 *   2   8
 *    \   \
 *     3   15
 *         /
 *         9
 *
 *  Tree B:
 *     7
 *    / \
 *   1  10
 *    \   \
 *     2  15
 *        /
 *       11
 * Input 2:
 *
 *   Tree A:
 *     7
 *    / \
 *   1   10
 *    \   \
 *     2   15
 *         /
 *        11
 *
 *  Tree B:
 *     7
 *    / \
 *   1  10
 *    \   \
 *     2  15
 *        /
 *       11
 *
 *
 * Example Output
 * Output 1:
 *
 *  17
 * Output 2:
 *
 *  46
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Common Nodes are : 2, 15
 *  So answer is 2 + 15 = 17
 * Explanation 2:
 *
 *  Common Nodes are : 7, 2, 1, 10, 15, 11
 *  So answer is 7 + 2 + 1 + 10 + 15 + 11 = 46
 * **/
public class SumCommonNodesInTwoBST {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        TreeNode f2f = new TreeNode(2);
        TreeNode f8f = new TreeNode(8);
        TreeNode f3f = new TreeNode(3);
        TreeNode one5f = new TreeNode(15);
        TreeNode f9f = new TreeNode(9);

        root1.left=f2f;
        root1.right=f8f;
        f2f.right=f3f;
        f8f.right=one5f;
        one5f.left=f9f;

        TreeNode root2 = new TreeNode(7);
        TreeNode f1s = new TreeNode(1);
        TreeNode one0s = new TreeNode(10);
        TreeNode f2s = new TreeNode(2);
        TreeNode one5s = new TreeNode(15);
        TreeNode one1s = new TreeNode(11);

        root2.left=f1s;
        root2.right=one0s;
        f1s.right=f2s;
        one0s.right=one5s;
        one5s.left=one1s;

        int commonNodeSum=findCommonNodeSum(root1,root2);
        System.out.println(commonNodeSum);
    }

    private static int findCommonNodeSum(TreeNode A,TreeNode B){
        long mod=1000000007;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        list1=findInorder(A,list1);//store the inorder traversal in list1
        list2=findInorder(B,list2);//store the inorder traversal in list2
        for(int i=0;i< list1.size();i++){
            set.add(list1.get(i));
        }
        for(int i=0;i<list2.size();i++){
            if(set.contains(list2.get(i))){
                sum+= list2.get(i);
                sum= (int)(sum%mod);
            }
        }
        return (int)(sum%mod);
    }

    public static ArrayList<Integer> findInorder(TreeNode A, ArrayList<Integer> list){
        if (A == null) {

            return null;
        }

        findInorder(A.left,list);
        list.add(A.val);
        findInorder(A.right,list);
        return list;
    }


}
