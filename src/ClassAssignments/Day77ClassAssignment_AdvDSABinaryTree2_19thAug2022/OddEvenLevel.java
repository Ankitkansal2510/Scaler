package ClassAssignments.Day77ClassAssignment_AdvDSABinaryTree2_19thAug2022;

import java.util.Deque;
import java.util.LinkedList;

/**
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
 *  Sum of ndoes at even level = 12
 * **/
public class OddEvenLevel {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(10);
        TreeNode third=new TreeNode(4);
        root.left=first;
        root.right=second;
        first.right=third;

        int result=findSumDiff(root);
        System.out.println(result);
    }

    private static int findSumDiff(TreeNode A){

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
