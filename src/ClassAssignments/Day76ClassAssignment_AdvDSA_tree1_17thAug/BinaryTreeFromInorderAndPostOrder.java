package ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import static ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug.DeserializeBinaryTree.printNode;

/**
 * Given the inorder and postorder traversal of a tree, construct the binary tree.
 *
 * NOTE: You may assume that duplicates do not exist in the tree.
 *
 *
 *
 * Problem Constraints
 * 1 <= number of nodes <= 105
 *
 *
 *
 * Input Format
 * First argument is an integer array A denoting the inorder traversal of the tree.
 *
 * Second argument is an integer array B denoting the postorder traversal of the tree.
 *
 *
 *
 * Output Format
 * Return the root node of the binary tree.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [2, 1, 3]
 *  B = [2, 3, 1]
 * Input 2:
 *
 *  A = [6, 1, 3, 2]
 *  B = [6, 3, 2, 1]
 *
 *
 * Example Output
 * Output 1:
 *
 *    1
 *   / \
 *  2   3
 * Output 2:
 *
 *    1
 *   / \
 *  6   2
 *     /
 *    3
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Create the binary tree and return the root node of the tree.
 * **/

public class BinaryTreeFromInorderAndPostOrder {
   static HashMap<Integer,Integer> hm=new HashMap<>();
    public static void main(String[] args) {
        int A[]={4, 8, 2, 5, 1, 6, 3, 7};
        int B[]={8, 4, 5, 2, 6, 7, 3, 1};
        int n=A.length;
        TreeNode node=constructBinaryTree(A,B,0,n-1,n-1);
        printNode(node);
    }
    private static TreeNode constructBinaryTree(int inorder[],int postoder[],int start,int end,int postIndex){

        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return buildTree(inorder,postoder,start,end,postIndex);
    }

    private static TreeNode buildTree(int inorder[],int postorder[],int start,int end,int postIndex){
        if(start>end)return null;
        TreeNode root;
         root=new TreeNode(postorder[postIndex]);
        int index=hm.get(postorder[postIndex]);
        root.right=buildTree(inorder,postorder,index+1,end,postIndex-1);
        root.left=buildTree(inorder,postorder,start,index-1,postIndex-(end-index+1));

        return root;
    }


}
