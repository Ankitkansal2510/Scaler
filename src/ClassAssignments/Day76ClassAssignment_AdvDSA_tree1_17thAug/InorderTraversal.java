package ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug;

import java.util.ArrayList;
import java.util.Arrays;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(3);
        root.right=first;
        first.left=second;

        int [] result=InorderTraversal(root);
        System.out.println(Arrays.toString(result));
    }

    private static int[] InorderTraversal(TreeNode A){
       ArrayList<Integer> list1=new ArrayList<>();
         list1= Inorder(A,list1);
        int result[]=new int[list1.size()];
        for(int i=0;i<list1.size();i++){
            result[i]= (int) list1.get(i);
        }
        return result;
    }

    public static ArrayList Inorder(TreeNode A,ArrayList list){
        if(A==null){
            return null;
        }
        Inorder(A.left,list);
        list.add(A.val);
        Inorder(A.right,list);
        return list;
    }
}
