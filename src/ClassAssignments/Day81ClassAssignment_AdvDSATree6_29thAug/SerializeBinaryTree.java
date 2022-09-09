package ClassAssignments.Day81ClassAssignment_AdvDSATree6_29thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/***
 *
 * Given the root node of a Binary Tree denoted by A. You have to Serialize the given Binary Tree in the described format.
 *
 * Serialize means encode it into a integer array denoting the Level Order Traversal of the given Binary Tree.
 *
 * NOTE:
 *
 * In the array, the NULL/None child is denoted by -1.
 * For more clarification check the Example Input.
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 *
 *
 *
 * Input Format
 * Only argument is a A denoting the root node of a Binary Tree.
 *
 *
 *
 * Output Format
 * Return an integer array denoting the Level Order Traversal of the given Binary Tree.
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
 *  [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]
 * Output 2:
 *
 *  [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  The Level Order Traversal of the given tree will be [1, 2, 3, 4, 5 , -1, -1, -1, -1, -1, -1].
 *  Since 3, 4 and 5 each has both NULL child we had represented that using -1.
 * Explanation 2:
 *
 *  The Level Order Traversal of the given tree will be [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1].
 *  Since 3 has left child as NULL while 4 and 5 each has both NULL child.
 * **/
public class SerializeBinaryTree {
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

        int result[]=serialiseBT(root);
        System.out.println(Arrays.toString(result));
    }

    private static int[] serialiseBT(TreeNode A){

        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.add(A);
        while(!q.isEmpty()){
            TreeNode temp=q.peek();
            q.remove();

            if(temp==null){
                list.add(-1);
                continue;
            }else{
                list.add(temp.val);
            }
            q.add(temp.left);
            q.add(temp.right);
        }

        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
