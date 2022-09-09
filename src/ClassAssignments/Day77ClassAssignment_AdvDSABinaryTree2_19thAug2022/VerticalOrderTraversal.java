package ClassAssignments.Day77ClassAssignment_AdvDSABinaryTree2_19thAug2022;

import java.util.*;

/**
 *
 * Given a binary tree, return a 2-D array with vertical order traversal of it. Go through the example and image for more details.
 *
 *
 * NOTE: If 2 Tree Nodes shares the same vertical level then the one with lesser depth will come first.
 *
 *
 *
 * Problem Constraints
 * 0 <= number of nodes <= 105
 *
 *
 *
 * Input Format
 * First and only arument is a pointer to the root node of binary tree, A.
 *
 *
 *
 * Output Format
 * Return a 2D array denoting the vertical order traversal of tree as shown.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *       6
 *     /   \
 *    3     7
 *   / \     \
 *  2   5     9
 * Input 2:
 *
 *       1
 *     /   \
 *    3     7
 *   /       \
 *  2         9
 *
 *
 * Example Output
 * Output 1:
 *
 *  [
 *     [2],
 *     [3],
 *     [6, 5],
 *     [7],
 *     [9]
 *  ]
 * Output 2:
 *
 *  [
 *     [2],
 *     [3],
 *     [1],
 *     [7],
 *     [9]
 *  ]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  First row represent the verical line 1 and so on.
 * ***/
class Pair{
    TreeNode node;
    int level;

    Pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
public class VerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(7);
        TreeNode fourth = new TreeNode(2);
        TreeNode fifth = new TreeNode(9);

        root.left = second;
        root.right = third;
        second.left = fourth;
        third.right = fifth;

        ArrayList<ArrayList<Integer>> verticalOrder = findVerticalOrderTraversal(root);
        for (int i = 0; i < verticalOrder.size(); i++) {
            ArrayList<Integer> list = verticalOrder.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();

        }
    }

    private static ArrayList<ArrayList<Integer>> findVerticalOrderTraversal(TreeNode root){
        HashMap<Integer, ArrayList<Integer>> hm=new HashMap<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        Queue<Pair>  q=new LinkedList<>();
        q.add(new Pair(root,0));
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            TreeNode temp=q.peek().node;
            int count=q.peek().level;
            q.remove();
            min=Math.min(min,count);
            max=Math.max(max,count);
            if(hm.containsKey(count)){
                ArrayList<Integer> list1=hm.get(count);
                list1.add(temp.val);
                hm.put(count,list1);
            }else{
                ArrayList<Integer> list2=new ArrayList<>();
                list2.add(temp.val);
                hm.put(count,list2);
            }
            if(temp!=null && temp.left!=null){
                q.add(new Pair(temp.left,count-1));
            }

            if(temp!=null && temp.right!=null){
                q.add(new Pair(temp.right,count+1));
            }
        }
        for(int i=min;i<=max;i++){
            res.add(hm.get(i));
        }
        return res;
    }

    }

