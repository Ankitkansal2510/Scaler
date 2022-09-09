package ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug;

import java.util.ArrayList;
import java.util.Arrays;

/***
 *
 *
 * Given a binary tree, return the Postorder traversal of its nodes values.
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
 * Return an integer array denoting the Postorder traversal of the given binary tree.
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
 *  [3, 2, 1]
 * Output 2:
 *
 *  [6, 3, 2, 1]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  The Preoder Traversal of the given tree is [3, 2, 1].
 * Explanation 2:
 *
 *  The Preoder Traversal of the given tree is [6, 3, 2, 1].
 * **/
public class PostOrder {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(3);
        root.right=first;
        first.left=second;

        int [] result=PostOrderTraversal(root);
        System.out.println(Arrays.toString(result));
    }

    private static int[] PostOrderTraversal(TreeNode A) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1= PostOrder(A,list1);
        int result[]=new int[list1.size()];
        for(int i=0;i<list1.size();i++){
            result[i]= (int) list1.get(i);
        }
        return result;
    }

    private static ArrayList<Integer> PostOrder(TreeNode A, ArrayList<Integer> list) {
        if(A==null){
            return null;
        }

        PostOrder(A.left,list);
        PostOrder(A.right,list);
        list.add(A.val);
        return list;
    }
}
