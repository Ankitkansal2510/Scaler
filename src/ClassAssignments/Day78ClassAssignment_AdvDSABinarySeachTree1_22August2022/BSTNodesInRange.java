package ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022;

import java.util.ArrayList;

/**
 * Given a binary search tree of integers. You are given a range B and C.
 * <p>
 * Return the count of the number of nodes that lie in the given range.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= Number of nodes in binary tree <= 100000
 * <p>
 * 0 <= B < = C <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is a root node of the binary tree, A.
 * <p>
 * Second argument is an integer B.
 * <p>
 * Third argument is an integer C.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the count of the number of nodes that lies in the given range.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 15
 * /    \
 * 12      20
 * / \    /  \
 * 10  14  16  27
 * /
 * 8
 * <p>
 * B = 12
 * C = 20
 * Input 2:
 * <p>
 * 8
 * / \
 * 6  21
 * / \
 * 1   7
 * <p>
 * B = 2
 * C = 20
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 5
 * Output 2:
 * <p>
 * 3
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Nodes which are in range [12, 20] are : [12, 14, 15, 20, 16]
 * Explanation 2:
 * <p>
 * Nodes which are in range [2, 20] are : [8, 6, 7]
 **/
public class BSTNodesInRange {
static int ansSecondApproach=0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode f6 = new TreeNode(6);
        TreeNode f1 = new TreeNode(1);
        TreeNode f7 = new TreeNode(7);
        TreeNode two1 = new TreeNode(21);
        root.left = f6;
        root.right = two1;
        f6.left = f1;
        f6.right = f7;
        int B = 2;
        int C = 20;
        int count = countElemInRange(root, B, C);
        System.out.println(count);

        countElemInRangeSecondApproach(root, B, C);
        System.out.println(ansSecondApproach);
    }

    private static int countElemInRange(TreeNode A, int B, int C) {
        /***
         * The idea is to travers the BST in inorder because inorder will given elem in sroted order
         * Once we found the inorder store in the List.
         * Then iterate the list to search the count of all elem which is >=B and <=C
         * */
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        list = formInorderBST(A, list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= B && list.get(i) <= C) {
                count++;
            }
        }
        return count;
    }

    private static ArrayList<Integer> formInorderBST(TreeNode A, ArrayList<Integer> list) {
        if (A == null) return null;

        formInorderBST(A.left, list);
        list.add(A.val);
        formInorderBST(A.right, list);
        return list;
    }

    private static void countElemInRangeSecondApproach(TreeNode A,int B,int C) {
       /**
        *
        * The idea is to traverse the given binary search tree starting from the root.
        * For every node being visited, check if this node lies in range,
        * if yes, then add 1 to the result and recur for both of its children.
        * **/
        if (A == null) {
            return;
        }

        if (A.val >= B && A.val <= C) {
            ansSecondApproach++;
        }

        countElemInRangeSecondApproach(A.left, B, C);
        countElemInRangeSecondApproach(A.right, B, C);

    }
}
