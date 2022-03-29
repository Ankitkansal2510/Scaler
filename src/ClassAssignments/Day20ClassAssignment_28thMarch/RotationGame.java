package ClassAssignments.Day20ClassAssignment_28thMarch;

import java.util.Arrays;

/**
 *
 * Problem Description
 *
 * Given an integer array A and an integer B, you have to print the same array after rotating it B times towards the right.
 *
 * NOTE: You can use extra memory.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= |A| <= 106
 *
 * 1 <= A[i] <= 109
 *
 * 1 <= B <= 109
 *
 *
 *
 * Input Format
 *
 * The first line begins with an integer A denoting the length of an array, and then A integers represent the array elements.
 * The second line contains a single integer B
 *
 *
 *
 * Output Format
 *
 * Print an array of integers which is the Bth right rotation of input array A, on a separate line.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  4 1 2 3 4
 *  2
 * Input 2:
 *
 *  3 1 2 2
 *  3
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  3 4 1 2
 * Output 2:
 *
 *  1 2 2
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  [1,2,3,4] => [4,1,2,3] => [3,4,1,2]
 *
 * Explanation 2:
 *
 *
 *  [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]
 *
 * */
public class RotationGame {

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int k=2;
        rotateArray(arr,k);
        System.out.println(Arrays.toString(arr));

    }

    private static void rotateArray(int arr[],int k){
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }

    private static void reverse(int arr[],int s,int e){
        int i=s;
        int j=e;

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int arr[],int i,int j){
        int c=arr[j];
        arr[j]=arr[i];
        arr[i]=c;
    }
}
