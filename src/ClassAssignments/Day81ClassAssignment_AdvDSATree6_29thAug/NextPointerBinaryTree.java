package ClassAssignments.Day81ClassAssignment_AdvDSATree6_29thAug;

import java.util.Currency;

/**
 * Given a binary tree,
 *
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 * Assume perfect binary tree and try to solve this in constant extra space.
 *
 *
 *
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 100000
 *
 * 0 <= node values <= 10^9
 *
 *
 *
 * Input Format
 * First and only argument is head of the binary tree A.
 *
 *
 *
 * Output Format
 * Return the head of the binary tree after the changes are made.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *      1
 *     /  \
 *    2    3
 * Input 2:
 *
 *
 *         1
 *        /  \
 *       2    5
 *      / \  / \
 *     3  4  6  7
 *
 *
 * Example Output
 * Output 1:
 *
 *
 *         1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 * Output 2:
 *
 *
 *          1 -> NULL
 *        /  \
 *       2 -> 5 -> NULL
 *      / \  / \
 *     3->4->6->7 -> NULL
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Next pointers are set as given in the output.
 * Explanation 2:
 *
 * Next pointers are set as given in the output.
 *
 * **/
class TreeLinkNode {
    int val;
    TreeLinkNode left;
    TreeLinkNode right;
    TreeLinkNode next;
    TreeLinkNode(int x) {
        val = x;
        left=null;
        right=null;
        next=null;
    }
}
public class NextPointerBinaryTree {
    public static void main(String[] args) {
        TreeLinkNode root=new TreeLinkNode(1);
        TreeLinkNode f2=new TreeLinkNode(2);
        TreeLinkNode f3=new TreeLinkNode(3);
        TreeLinkNode f4=new TreeLinkNode(4);
        TreeLinkNode f5=new TreeLinkNode(5);
        TreeLinkNode f6=new TreeLinkNode(6);
        TreeLinkNode f7=new TreeLinkNode(7);
        root.left=f2;
        root.right=f3;
        f2.left=f4;
        f2.right=f5;
        f3.left=f6;
        f3.right=f7;
        connect(root);
    }

    private static void connect(TreeLinkNode A){
        if(A==null)return;
        TreeLinkNode curr=A;
        while(curr.left!=null){
            TreeLinkNode temp=curr;

            while(temp!=null){
                temp.left.next=temp.right;
                if(temp.next!=null){
                    temp.right.next=temp.next.left;
                }
                temp=temp.next;
            }
            curr=curr.left;
        }

    }
}
