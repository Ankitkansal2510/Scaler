package ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug;

import java.util.LinkedList;
import java.util.Queue;

/***
 * You are given an integer array A denoting the Level Order Traversal of the Binary Tree.
 *
 * You have to Deserialize the given Traversal in the Binary Tree and return the root of the Binary Tree.
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
 * -1 <= A[i] <= 105
 *
 *
 *
 * Input Format
 * Only argument is an integer array A denoting the Level Order Traversal of the Binary Tree.
 *
 *
 *
 * Output Format
 * Return the root node of the Binary Tree.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]
 * Input 2:
 *
 *  A = [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]
 *
 *
 * Example Output
 * Output 1:
 *
 *            1
 *          /   \
 *         2     3
 *        / \
 *       4   5
 * Output 2:
 *
 *             1
 *           /   \
 *          2     3
 *         / \ .   \
 *        4   5 .   6
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Each element of the array denotes the value of the node. If the val is -1 then it is the NULL/None child.
 *  Since 3, 4 and 5 each has both NULL child we had represented that using -1.
 * Explanation 2:
 *
 *  Each element of the array denotes the value of the node. If the val is -1 then it is the NULL/None child.
 *  Since 3 has left child as NULL while 4 and 5 each has both NULL child.
 * **/
public class DeserializeBinaryTree {
    public static void main(String[] args) {
        int A[]={1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1};
        TreeNode node=ConstructBinaryTreeFromLEvelORderElem(A);
        printNode(node);
    }

    private static TreeNode ConstructBinaryTreeFromLEvelORderElem(int A[]){
         Queue<TreeNode> q=new LinkedList<>();
         TreeNode root =new TreeNode(A[0]);
         q.add(root);
         boolean isFalse=true;
         int count=0;
         for(int i=1;i<A.length;i++){
             TreeNode node=null;
             if(A[i]!=-1){
                  node=new TreeNode(A[i]);
             }
             TreeNode temp=q.peek();
             if(isFalse){
                temp.left=node;
                isFalse=false;
                if(temp!=null && temp.left!=null) {
                    q.add(temp.left);
                }
                count++;
             }
             else{
                 temp.right=node;
                 isFalse=true;
                 if(temp!=null && temp.right!=null) {
                     q.add(temp.right);
                 }
                 count++;
             }
             if(count==2){
                 count=0;
                 q.remove();
             }
         }
        return root;
    }

    public static void printNode(TreeNode A){

        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            TreeNode temp=q.peek();
            q.remove();
            System.out.print(temp.val + " ");
            if(temp!=null && temp.left!=null){
                q.add(temp.left);
            }
            if(temp!=null && temp.right!=null){
                q.add((temp.right));
            }
        }
    }
}
