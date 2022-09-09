package ClassAssignments.Day77ClassAssignment_AdvDSABinaryTree2_19thAug2022;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 *    ArrayList<Integer> result=new ArrayList<>();
 *         Queue<Pair> q=new LinkedList<>();
 *         HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
 *         q.add(new Pair(root,0));
 *         int min=Integer.MAX_VALUE;
 *         int max=Integer.MIN_VALUE;
 *         while(!q.isEmpty()){
 *             TreeNode temp=q.peek().node;
 *             int level=q.peek().level;
 *             q.remove();
 *             min=Math.min(min,level);
 *             max=Math.max(max,level);
 *             if(!hm.containsKey(level)){
 *                 result.add(temp.val);
 *                 hm.put(level,result);
 *             }
 *
 *             if(temp!=null && temp.left!=null){
 *                 q.add(new Pair(temp.left,level-1));
 *             }
 *
 *             if(temp!=null && temp.right!=null){
 *                 q.add(new Pair(temp.right,level+1));
 *             }
 *         }
 *         return result;
 *
 * **/
public class LeftViewBinaryTree {
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

        ArrayList<Integer> leftView=findLeftViewElem(root);
         for(int i=0;i<leftView.size();i++){
             System.out.print(leftView.get(i) + " ");
         }
    }

    private static ArrayList<Integer> findLeftViewElem(TreeNode A){
        ArrayList<Integer> list=new ArrayList<>();
        Deque<TreeNode> q=new LinkedList<>();
        q.add(A);
        q.addLast(null);
        while(q.size()>1){
            TreeNode temp=q.peek();
            q.removeFirst();
            if(list.isEmpty()) {
                list.add(temp.val);
            }
            if(temp==null){
                list.add(q.peek().val);
                q.addLast(null);
            }
            if(temp!=null && temp.left!=null){
                q.add(temp.left);
            }

            if(temp!=null && temp.right!=null){
                q.add(temp.right);
            }
        }
        return list;
    }
}
