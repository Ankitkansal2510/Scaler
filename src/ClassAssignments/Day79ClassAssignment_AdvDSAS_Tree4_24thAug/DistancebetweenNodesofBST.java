package ClassAssignments.Day79ClassAssignment_AdvDSAS_Tree4_24thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

/**
 * Given a binary search tree.
 * Return the distance between two nodes with given two keys B and C. It may be assumed that both keys exist in BST.
 *
 * NOTE: Distance between two nodes is number of edges between them.
 *
 *
 *
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 1000000
 *
 * 0 <= node values <= 109
 *
 *
 *
 * Input Format
 * First argument is a root node of the binary tree, A.
 *
 * Second argument is an integer B.
 *
 * Third argument is an integer C.
 *
 *
 *
 * Output Format
 * Return an integer denoting the distance between two nodes with given two keys B and C
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *          5
 *        /   \
 *       2     8
 *      / \   / \
 *     1   4 6   11
 *  B = 2
 *  C = 11
 * Input 2:
 *
 *
 *          6
 *        /   \
 *       2     9
 *      / \   / \
 *     1   4 7   10
 *  B = 2
 *  C = 6
 *
 *
 * Example Output
 * Output 1:
 *
 *  3
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Path between 2 and 11 is: 2 -> 5 -> 8 -> 11. Distance will be 3.
 * Explanation 2:
 *
 *  Path between 2 and 6 is: 2 -> 6. Distance will be 1
 *
 * **/
public class DistancebetweenNodesofBST {

    static TreeNode insert(TreeNode root, int key)
    {
        if (root == null)
            root = new TreeNode(key);
        else if (root.val > key)
            root.left = insert(root.left, key);
        else if (root.val < key)
            root.right = insert(root.right, key);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 5);
        insert(root, 2);
        insert(root, 8);
        insert(root, 1);
        insert(root, 4);
        insert(root, 6);
        insert(root, 11);

        int B=2;
        int C=11;

        int distance=findDistanceBetweenTwoNodes(root,B,C);
        System.out.println(distance);
    }

    private static int findDistanceBetweenTwoNodes(TreeNode A,int B,int C){


      TreeNode node= findLCA(A,B,C);
        int count=0;
        int count1=0;

            count = findDist(node, B);
            count1 = findDist(node, C);
            return count+count1;
    }

    private static TreeNode findLCA(TreeNode A,int B,int C){

        if(A==null){
            return null;
        }

        if(A.val==B || A.val==C){
            return A;
        }

        TreeNode left=findLCA(A.left,B,C);
        TreeNode right=findLCA(A.right,B,C);

        if(left!=null && right!=null){
            return A;
        }
            return (left!=null?left:right);
    }

    private static int findDist(TreeNode A,int B){

       if(A==null ||  A.val==B){
           return 0;
       }

       if(B<A.val){
         return 1+findDist(A.left,B);
       }else{
           return 1+findDist(A.right,B);
       }
    }
}
