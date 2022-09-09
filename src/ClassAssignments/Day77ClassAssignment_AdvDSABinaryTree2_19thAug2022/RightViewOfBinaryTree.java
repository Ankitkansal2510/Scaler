package ClassAssignments.Day77ClassAssignment_AdvDSABinaryTree2_19thAug2022;

import java.util.*;

/**
 * Given a binary tree of integers denoted by root A. Return an array of integers representing the right view of the Binary tree.
 * <p>
 * Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 100000
 * <p>
 * 0 <= node values <= 10^9
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is head of the binary tree A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an array, representing the right view of the binary tree.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * <p>
 * 1
 * /   \
 * 2    3
 * / \  / \
 * 4   5 6  7
 * /
 * 8
 * Input 2:
 * <p>
 * <p>
 * 1
 * /  \
 * 2    3
 * \
 * 4
 * \
 * 5
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [1, 3, 7, 8]
 * Output 2:
 * <p>
 * [1, 3, 4, 5]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Right view is described.
 * Explanation 2:
 * <p>
 * Right view is described.
 **/
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class RightViewOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(5);
        root.left = first;
        root.right = second;
        first.right=third;
        third.right=fourth;

        int rightViewTree[]=constructRightView(root);
        System.out.println(Arrays.toString(rightViewTree));
    }

    private static int[] constructRightView(TreeNode root){

        Deque<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.addFirst(root);
        q.addLast(null);
        while(q.size()>1){
            TreeNode f=q.peekFirst();
            q.removeFirst();
            if(list.isEmpty()){
                list.add(f.val);
            }
            if(f==null){
                q.addLast(null);
                list.add(q.peek().val);
            }
            if(f!=null && f.right!=null){
                q.addLast(f.right);
            }

            if(f!=null && f.left!=null){
                q.addLast(f.left);
            }

        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }

        return result;
    }
}
