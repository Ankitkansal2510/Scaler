package ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug;

import java.util.ArrayList;
import java.util.Arrays;
/****
 * Given a binary tree, return the preorder traversal of its nodes values.
 *
 * NOTE: Using recursion is not allowed.
 *
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 *
 *
 *
 * Input Format
 * First and only argument is root node of the binary tree, A.
 *
 *
 *
 * Output Format
 * Return an integer array denoting the preorder traversal of the given binary tree.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *    1
 *     \
 *      2
 *     /
 *    3
 * Input 2:
 *
 *    1
 *   / \
 *  6   2
 *     /
 *    3
 *
 *
 * Example Output
 * Output 1:
 *
 *  [1, 2, 3]
 * Output 2:
 *
 *  [1, 6, 2, 3]
 *
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  The Preoder Traversal of the given tree is [1, 2, 3].
 * Explanation 2:
 *
 *  The Preoder Traversal of the given tree is [1, 6, 2, 3].
 * ****/
public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(3);
        root.right=first;
        first.left=second;

        int [] result=PreOrderTraversal(root);
        System.out.println(Arrays.toString(result));
    }

    private static int[] PreOrderTraversal(TreeNode A) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1= PreOrder(A,list1);
        int result[]=new int[list1.size()];
        for(int i=0;i<list1.size();i++){
            result[i]= (int) list1.get(i);
        }
        return result;
    }

    private static ArrayList<Integer> PreOrder(TreeNode A, ArrayList<Integer> list) {
        if(A==null){
            return null;
        }
        list.add(A.val);
        PreOrder(A.left,list);
        PreOrder(A.right,list);
        return list;
    }
}
