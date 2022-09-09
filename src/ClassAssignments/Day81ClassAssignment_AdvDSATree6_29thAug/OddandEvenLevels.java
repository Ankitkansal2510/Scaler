package ClassAssignments.Day81ClassAssignment_AdvDSATree6_29thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 *
 * Given a binary tree of integers. Find the difference between the sum of nodes at odd level and sum of nodes at even level.
 *
 * NOTE: Consider the level of root node as 1.
 *
 *
 *
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 100000
 *
 * 0 <= node values <= 109
 *
 *
 *
 * Input Format
 * First and only argument is a root node of the binary tree, A
 *
 *
 *
 * Output Format
 * Return an integer denoting the difference between the sum of nodes at odd level and sum of nodes at even level.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *         1
 *       /   \
 *      2     3
 *     / \   / \
 *    4   5 6   7
 *   /
 *  8
 * Input 2:
 *
 *         1
 *        / \
 *       2   10
 *        \
 *         4
 *
 *
 * Example Output
 * Output 1:
 *
 *  10
 * Output 2:
 *
 *  -7
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Sum of nodes at odd level = 23
 *  Sum of ndoes at even level = 13
 * Explanation 2:
 *
 *  Sum of nodes at odd level = 5
 *  Sum of ndoes at even level = 12**/
public class OddandEvenLevels {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode f2=new TreeNode(2);
        TreeNode f10=new TreeNode(10);
        TreeNode f4=new TreeNode(4);
        root.left=f2;
        root.right=f10;
        f2.right=f4;

        int result=findDifference(root);
        System.out.println(result);
    }

    private static int findDifference(TreeNode A){

        Deque<TreeNode> q=new LinkedList<>();
        int sumOdd=0;
        int sumEven=0;
        q.addFirst(A);
        q.addLast(null);
        int level=1;
        while(q.size()>1){
            TreeNode temp=q.peek();
            q.removeFirst();
            if(level%2==0){
                sumEven+=temp!=null?temp.val:0;
            }else{
                sumOdd+=temp!=null?temp.val:0;
            }
            if(temp==null){
                q.addLast(null);
                level++;
            }

            if(temp!=null && temp.left!=null){
                q.addLast(temp.left);
            }

            if(temp!=null && temp.right!=null){
                q.addLast(temp.right);
            }
        }

        return sumOdd-sumEven;

    }
}
