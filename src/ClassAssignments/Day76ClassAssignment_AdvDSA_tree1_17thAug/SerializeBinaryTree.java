package ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
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
 *
 * ***/
public class SerializeBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(5);
        TreeNode fifth = new TreeNode(6);
      /*  root.left = first;
        root.right = second;
        first.left = third;
        first.right=fourth;
        second.right=fifth;*/

        root.left=first;
        root.right=second;
        second.left=third;
        third.right=fourth;
       int result[]= levelOrderTraversal(root);
       for(int i=0;i<result.length;i++){
           System.out.print(result[i] + " ");
       }
        System.out.println();
        List<Integer> list=solve(root);
        for(int i:list){
            System.out.print(i  + " ");
        }
    }

    private static int[] levelOrderTraversal(TreeNode A){
        Deque<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.addFirst(A);
        while(!q.isEmpty()){
            TreeNode f=q.peek();
            q.removeFirst();
            if(f==null){
                list.add(-1);
              //  System.out.print("-1" + " ");
            }else{
                list.add(f.val);
               // System.out.print(f.val + " ");
            }
            if(f!=null && f.left!=null){
                q.addLast(f.left);
            }else if(f!=null && f.left==null){
                q.addLast(null);
            }
            if(f!=null && f.right!=null){
                q.addLast(f.right);
            }else if(f!=null && f.right==null){
                q.addLast(null);
            }
        }
        System.out.println();
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }

    public static ArrayList<Integer> solve(TreeNode A) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> output = new ArrayList<Integer>();

        queue.add(A);
        while(!queue.isEmpty()) {
            // get the first element from queue
            TreeNode currentNode = queue.poll();
            if(currentNode == null) {
                // if currentNode is null, insert -1 in output
                output.add(-1);
            } else {
                // if currentNode is not null, add left and right to queue
                // insert currentNode value in output
                output.add(currentNode.val);
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
        return output;
    }
}
