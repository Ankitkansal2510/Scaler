package ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSumBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode f9 = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);

        root.left = f9;
        root.right = twenty;

        int B = 19;

        int result = isExist(root, B);
        System.out.println(result);

        int resultSecondApproach=SecondApproach(root,B);
        System.out.println(resultSecondApproach);
    }

    private static int isExist(TreeNode A, int B) {
        /***
         * We know inorder of bst will give elem in increasing order.
         * we will form list and then store B-(elem in list) and store in key and value
         * if we found the and elem from list which is already stored in hashmap then we can say there
         * exist two nodes whose sum is equal to B
         * ***/
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        list = formInorder(A, list);

        for (int i = 0; i < list.size(); i++) {
            int key = B - list.get(i);
            if (map.containsKey(list.get(i))) {
                return 1;
            } else {
                map.put(key, list.get(i));
            }
        }
        return 0;
    }

    private static ArrayList<Integer> formInorder(TreeNode A, ArrayList<Integer> list) {
        if (A == null) {
            return null;
        }

        formInorder(A.left, list);
        list.add(A.val);
        formInorder(A.right, list);
        return list;

    }

    public static int SecondApproach(TreeNode A, int B) {
        Set< Integer > set = new HashSet();
        if (find(A, B, set) == true)
            return 1;
        return 0;
    }

    public static boolean find(TreeNode root, int k, Set < Integer > set) {
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }
}
