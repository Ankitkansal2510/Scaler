package ClassAssignments.Day79ClassAssignment_AdvDSAS_Tree4_24thAug;

import ClassAssignments.Day78ClassAssignment_AdvDSABinarySeachTree1_22August2022.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Two elements of a binary search tree (BST), represented by root A are swapped by mistake. Tell us the 2 values swapping which the tree will be restored.
 *
 * A solution using O(n) space is pretty straightforward. Could you devise a constant space solution?
 *
 *
 *
 * Problem Constraints
 * 1 <= size of tree <= 100000
 *
 *
 *
 * Input Format
 * First and only argument is the head of the tree,A
 *
 *
 *
 * Output Format
 * Return the 2 elements which need to be swapped.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 *          1
 *         / \
 *        2   3
 * Input 2:
 *
 *
 *          2
 *         / \
 *        3   1
 *
 *
 *
 * Example Output
 * Output 1:
 *
 *  [2, 1]
 * Output 2:
 *
 *  [3, 1]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Swapping 1 and 2 will change the BST to be
 *          2
 *         / \
 *        1   3
 * which is a valid BST
 * Explanation 2:
 *
 * Swapping 1 and 3 will change the BST to be
 *          2
 *         / \
 *        1   3
 * which is a valid BST
 * **/
public class RecoverBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode f2=new TreeNode(2);
        TreeNode f3=new TreeNode(3);
        root.left=f2;
        root.right=f3;

        int result[]=recoverBST(root);
        System.out.println(Arrays.toString(result));
    }

    private static int[] recoverBST(TreeNode root){

        ArrayList<Integer> list=new ArrayList<>();
        list=findTwoIncorrectElement(root,list);
        /*int arr[]={69,70,71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 92, 85,
                86, 87, 88, 89, 90, 91, 84, 93, 94 ,95 ,96};**/
        int result[]=new int[2];
        int c=0;
        /**
         * We know the inorder of the BST will always be increasing
         * so if some node is bad then then there will be node which is lesser than the previous node ,so we will get that value
         * **/
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                result[c++]=list.get(i);
                break;
            }
        }
/**
 * We know the inorder of the BST will always be increasing
 * so if some node is bad  then there will be node which is lesser than the next  node if we are iterating from left to right,so we will get that value
 * **/
        for(int i=list.size()-1;i>0;i--){
            if(list.get(i)<list.get(i-1)){
                result[c]=list.get(i);
                break;
            }
        }
        return result;
    }

    private static ArrayList<Integer> findTwoIncorrectElement(TreeNode root,ArrayList<Integer> list){

        if(root==null){
            return null;
        }

        findTwoIncorrectElement(root.left,list);
        list.add(root.val);
        findTwoIncorrectElement(root.right,list);
        return list;
    }
}
