package ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug;


import java.util.*;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= number of nodes <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is root node of the binary tree, A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * Input 2:
 * <p>
 * 1
 * / \
 * 6   2
 * /
 * 3
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [
 * [3],
 * [9, 20],
 * [15, 7]
 * ]
 * Output 2:
 * <p>
 * [
 * [1]
 * [6, 2]
 * [3]
 * ]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Return the 2D array. Each row denotes the traversal of each level.
 **/
public class LevelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode first = new TreeNode(6);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        root.left = first;
        root.right = second;
        second.left = third;

        int[] result = LevelOrderTraversal(root);
        System.out.println(Arrays.toString(result));
        System.out.println();
        ArrayList<ArrayList<Integer>> ans=levelOrdrTraversalLevelByLEvel(root);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static int[] LevelOrderTraversal(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode f = q.peek();
            list.add(f.val);
            q.remove();

            if (f.left != null) {
                q.add(f.left);
            }
            if (f.right != null) {
                q.add(f.right);
            }
        }
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static ArrayList<ArrayList<Integer>> levelOrdrTraversalLevelByLEvel(TreeNode root) {

        ArrayList<ArrayList<Integer>> levelList=new ArrayList<>();
        ArrayList<Integer>  list=new ArrayList<>();
        Deque<TreeNode> q=new LinkedList();
        q.addFirst(root);
        q.addLast(null);
        while(q.size()>1){
            TreeNode f=q.peekFirst();
            q.removeFirst();
            if(f == null){
                levelList.add(list);
                q.addLast(null);
               // System.out.println();
                list=new ArrayList<>();
            }else {
                //System.out.print(f.val + " ");
                list.add(f.val);
            }
                if(f!=null &&f.left!=null){
                q.addLast(f.left);
            }
            if(f!=null && f.right!=null){
                q.addLast(f.right);
            }
            if(q.size()==1){
                levelList.add(list);
            }
        }

       return levelList;

    }
}