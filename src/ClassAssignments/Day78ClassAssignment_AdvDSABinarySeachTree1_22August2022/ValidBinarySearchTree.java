package ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022;


import java.util.ArrayList;

/***
 * You are given a binary tree represented by root A.
 *
 * Assume a BST is defined as follows:
 *
 * 1) The left subtree of a node contains only nodes with keys less than the node's key.
 *
 * 2) The right subtree of a node contains only nodes with keys greater than the node's key.
 *
 * 3) Both the left and right subtrees must also be binary search trees.
 *
 *
 *
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 105
 *
 * 0 <= node values <= 232-1
 *
 *
 *
 * Input Format
 * First and only argument is head of the binary tree A.
 *
 *
 *
 * Output Format
 * Return 0 if false and 1 if true.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *    1
 *   /  \
 *  2    3
 * Input 2:
 *
 *
 *   2
 *  / \
 * 1   3
 *
 *
 * Example Output
 * Output 1:
 *
 *  0
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  2 is not less than 1 but is in left subtree of 1.
 * Explanation 2:
 *
 * Satisfies all conditions.
 * **/
public class ValidBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(3);
        root.left=first;
        root.right=second;

        int result=isValidBinarySearchTree(root);
        //print 0 if false else 1
        System.out.println(result);


        boolean secondResult=isValidBSTWithoutSpace(root);
        System.out.println(secondResult);
    }

    private static int isValidBinarySearchTree(TreeNode A){
        ArrayList<Integer> list = new ArrayList<>();
        list = checkIfValidBST(A, list);
//inorder of valid binary serch tree is always sorted asc
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return 0;
            }
        }
        return 1;
    }

    private static ArrayList<Integer> checkIfValidBST(TreeNode A,ArrayList list){

        if(A==null)return null;

        checkIfValidBST(A.left,list);
        list.add(A.val);
        checkIfValidBST(A.right,list);

        return list;
    }

    private static boolean isValidBSTWithoutSpace(TreeNode A){
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        return findIfValidBST(A,min,max);
    }

    private static boolean findIfValidBST(TreeNode A,int min,int max){
        if(A==null){
            return true;
        }

        if(A.val<=min || A.val>max){
            return false;
        }
        return (findIfValidBST(A.left,min,A.val-1)  && findIfValidBST(A.right
                                ,A.val+1,max));
    }
}
