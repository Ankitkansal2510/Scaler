package ClassAssignments.Day77ClassAssignment_AdvDSABinaryTree2_19thAug2022;

/***
 *
 * Given a root of binary tree A, determine if it is height-balanced.
 *
 * A height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 *
 *
 * Problem Constraints
 * 1 <= size of tree <= 100000
 *
 *
 *
 * Input Format
 * First and only argument is the root of the tree A.
 *
 *
 *
 * Output Format
 * Return 0 / 1 ( 0 for false, 1 for true ) for this problem.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *     1
 *    / \
 *   2   3
 * Input 2:
 *
 *
 *        1
 *       /
 *      2
 *     /
 *    3
 *
 *
 * Example Output
 * Output 1:
 *
 * 1
 * Output 2:
 *
 * 0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * It is a complete binary tree.
 * Explanation 2:
 *
 * Because for the root node, left subtree has depth 2 and right subtree has depth 0.
 * Difference = 2 > 1.
 * **/
public class BalancedBinaryTree {
   public static int balanced = 1;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode two=new TreeNode(2);
        TreeNode three =new TreeNode(3);
        root.left=two;
        two.left=three;
       // root.right=three;

        int result=isBalanced(root);
        System.out.println(result);
        }

        private static int isBalanced(TreeNode A){
             isTreeBalanced(A);
             return balanced;
        }

    static int isTreeBalanced(TreeNode A) {
        if(A==null) {
            return 0;
        }
            int leftHeight=1+isTreeBalanced(A.left);
            int rightHeight=1+isTreeBalanced((A.right));
            if (Math.abs(leftHeight - rightHeight) > 1) {
                balanced = 0;
            }
            return Math.max(leftHeight, rightHeight);

    }


}
