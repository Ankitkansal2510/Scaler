package ClassAssignments.Day77ClassAssignment_AdvDSABinaryTree2_19thAug2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/***
 * Given a binary tree of integers denoted by root A. Return an array of integers representing the top view of the Binary tree.
 *
 * The top view of a Binary Tree is a set of nodes visible when the tree is visited from the top.
 *
 * Return the nodes in any order.
 *
 *
 *
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 100000
 *
 * 0 <= node values <= 10^9
 *
 *
 *
 * Input Format
 * First and only argument is head of the binary tree A.
 *
 *
 *
 * Output Format
 * Return an array, representing the top view of the binary tree.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *             1
 *           /   \
 *          2    3
 *         / \  / \
 *        4   5 6  7
 *       /
 *      8
 * Input 2:
 *
 *
 *             1
 *            /  \
 *           2    3
 *            \
 *             4
 *              \
 *               5
 *
 *
 * Example Output
 * Output 1:
 *
 *  [1, 2, 4, 8, 3, 7]
 * Output 2:
 *
 *  [1, 2, 3]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Top view is described.
 * Explanation 2:
 *
 * Top view is described.
 * **/


public class TopViewOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root.left = second;
        root.right = third;
        second.right = fourth;
        fourth.right = fifth;

        ArrayList<Integer> topViewElem=findTopViewElem(root);
        for(int i=0;i<topViewElem.size();i++){
            System.out.println(topViewElem.get(i));
        }
    }

    private static ArrayList<Integer> findTopViewElem(TreeNode root){

        ArrayList<Integer> result=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        q.add(new Pair(root,0));
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            TreeNode temp=q.peek().node;
            int level=q.peek().level;
            q.remove();
            min=Math.min(min,level);
            max=Math.max(max,level);
            if(!hm.containsKey(level)){
                result.add(temp.val);
                hm.put(level,result);
            }

            if(temp!=null && temp.left!=null){
                q.add(new Pair(temp.left,level-1));
            }

            if(temp!=null && temp.right!=null){
                q.add(new Pair(temp.right,level+1));
            }
        }
        return result;
    }
}
