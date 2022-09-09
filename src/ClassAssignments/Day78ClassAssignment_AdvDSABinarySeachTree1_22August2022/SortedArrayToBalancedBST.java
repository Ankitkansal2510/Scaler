package ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022;

import java.util.*;

/***
 *
 * Given an array where elements are sorted in ascending order, convert it to a height Balanced Binary Search Tree (BBST).
 *
 * Balanced tree : a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 *
 *
 * Problem Constraints
 * 1 <= length of array <= 100000
 *
 *
 *
 * Input Format
 * First argument is an integer array A.
 *
 *
 *
 * Output Format
 * Return a root node of the Binary Search Tree.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A : [1, 2, 3]
 * Input 2:
 *
 *  A : [1, 2, 3, 5, 10]
 *
 *
 * Example Output
 * Output 1:
 *
 *       2
 *     /   \
 *    1     3
 * Output 2:
 *
 *       3
 *     /   \
 *    2     5
 *   /       \
 *  1         10
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  You need to return the root node of the Binary Tree.
 * **/
public class SortedArrayToBalancedBST {
    public static void main(String[] args) {
        List<Integer> sortedArray= Arrays.asList(1, 2, 3);
        TreeNode root=convertToBST(sortedArray);

        print(root);
    }

    private static TreeNode convertToBST(List<Integer> list){
        int startPosition=0;
        int endPosition=list.size()-1;
      return constructBalanceBST(list,startPosition,endPosition);
    }

    private static TreeNode constructBalanceBST(List<Integer> list,int startPosition,int endPosition){

        /***
         * idea is to find the mid, the mid will of the array will be the root.
         * the left of the mid will be the left of the root
         * the right of the mid will be the right of the root.
         *
         * to find left root and right root use the same procedure
         *
         * **/
        if(startPosition>endPosition){
            return null;
        }
        int mid=(startPosition+endPosition)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=constructBalanceBST(list,startPosition,mid-1);
        root.right=constructBalanceBST(list,mid+1,endPosition);
        return root;
    }

    private static void print(TreeNode root){

        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.peek();
            q.remove();
            System.out.print(temp.val + " ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
}
