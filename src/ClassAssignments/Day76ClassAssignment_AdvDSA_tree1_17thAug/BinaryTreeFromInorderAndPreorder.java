package ClassAssignments.Day76ClassAssignment_AdvDSA_tree1_17thAug;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.
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
 * First argument is an integer array A denoting the preorder traversal of the tree.
 *
 * Second argument is an integer array B denoting the inorder traversal of the tree.
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
 *  A = [1, 2, 3]
 *  B = [2, 1, 3]
 * Input 2:
 *
 *  A = [1, 6, 2, 3]
 *  B = [6, 1, 3, 2]
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
public class BinaryTreeFromInorderAndPreorder {
    static HashMap<Integer,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        int pre[]={1, 2, 3};//A
        int in[]={2, 1, 3};//B

        TreeNode root=constuctBT(pre,in);
        levelOrderTraversal(root);
    }

    private static TreeNode constuctBT(int A[],int B[]){
        int ps=0;
        int pe=A.length-1;
        int is=0;
        int ie=B.length-1;

        for(int i=0;i<B.length;i++){
            map.put(B[i],i);
        }

        return ConstructTree(A,ps,pe,B,is,ie);
    }

    private static TreeNode ConstructTree(int pre[],int ps,int pe,int in[],int is,int ie){

        if(ps>pe){
            return null;
        }

        TreeNode root=new TreeNode(pre[ps]);//first element of the preorder will be a root in tree ,as preorder is root ,left ,right
        int ind=map.get(pre[ps]);//This we are constructing the root node
        int index=(ps+1)+(ind-is)-1;//total no.of element left to root in inorder will be equal to total no.of element in preorder after the root, so here we are caluclating how many element in preorder are part of the left subtree  after the root in preorder
        root.left=ConstructTree(pre,ps+1,index,in,is,ind);
        root.right=ConstructTree(pre,index+1,pe,in,ind+1,ie);
        return root;

    }

    public static void levelOrderTraversal(TreeNode root){

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){

            TreeNode temp=q.peek();
            q.remove();
            System.out.print(temp.val + " ");

            if(temp.left!=null){
                q.add(temp.left);
            }

            if(temp.right!=null){
                q.add(temp.right);
            }
        }

    }
}
