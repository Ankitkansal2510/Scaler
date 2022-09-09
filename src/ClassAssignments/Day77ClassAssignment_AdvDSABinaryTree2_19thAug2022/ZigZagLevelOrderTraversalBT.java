package ClassAssignments.Day77ClassAssignment_AdvDSABinaryTree2_19thAug2022;

import java.util.*;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes values. (ie, from left to right, then right to left for the next level and alternate between).
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
 * Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
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
 *  [
 *    [3],
 *    [20, 9],
 *    [15, 7]
 *  ]
 * Output 2:
 *
 *  [
 *    [1]
 *    [2, 6]
 *    [3]
 *  ]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Return the 2D array. Each row denotes the zigzag traversal of each level.
 *
 * ***/
public class ZigZagLevelOrderTraversalBT {
    public static void main(String[] args) {
      /*  TreeNode root=new TreeNode(1);
        TreeNode six=new TreeNode(6);
        TreeNode two=new TreeNode(2);
        TreeNode three=new TreeNode(3);
        root.left=six;
        root.right=two;
        two.left=three;*/

        TreeNode root=new TreeNode(129);
        TreeNode n7=new TreeNode(97);
        TreeNode n8=new TreeNode(98);
        TreeNode n3=new TreeNode(93);
        TreeNode one06=new TreeNode(106);
        TreeNode two7=new TreeNode(27);
        TreeNode six1=new TreeNode(61);
        root.left=n7;
        root.right=n8;
        n7.left=n3;
        n7.right=one06;
        n8.left=two7;
        n8.right=six1;
        ArrayList<ArrayList<Integer>> list1=printZigZagLevelFirstApproach(root);
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list1.get(i).size();j++){
                System.out.print(list1.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        ArrayList<ArrayList<Integer>> list=printZigZagLevelSecondApproach(root);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }


    }

    private static ArrayList<ArrayList<Integer>> printZigZagLevelFirstApproach(TreeNode root) {

        Deque<TreeNode> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> tempList=new ArrayList<>();
        q.addLast(root);
        q.addLast(null);
        int level=1;
        while(q.size()>1){
            TreeNode temp=q.peekFirst();
            q.removeFirst();
            if(temp==null){
                q.addLast(null);

                if(level%2==0){
                   Collections.reverse(tempList);
                }
                result.add(tempList);
                tempList=new ArrayList<>();
                level++;
            }
            else{
                tempList.add(temp.val);
            }

            if(temp!=null && temp.left!=null){
                q.addLast(temp.left);
            }

            if(temp!=null && temp.right!=null){
                q.addLast(temp.right);
            }
        }
        if(level%2==0){
            Collections.reverse(tempList);
        }
        result.add(tempList);
        return result;
    }

    private static ArrayList<ArrayList<Integer>> printZigZagLevelSecondApproach(TreeNode A){
        int level=1;
        Deque<TreeNode> dq=new LinkedList<>();
        dq.addFirst(A);
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        while(!dq.isEmpty()){
            int n = dq.size();
            TreeNode node;
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            for(int i=1;i<=n;i++){
               if(level%2==0){
                   node=dq.removeLast();
                   tempList.add(node.val);
                   if(node.right!=null){
                       dq.addFirst(node.right);
                   }
                   if(node.left!=null){
                       dq.addFirst(node.left);
                   }
               }
               else{
                   node=dq.removeFirst();
                   tempList.add(node.val);
                   if(node.left!=null){
                       dq.addLast(node.left);

                   }
                   if(node.right!=null){
                       dq.addLast(node.right);
                   }
               }
            }
            level++;
            result.add(tempList);
            }
        return result;
        }
    }

