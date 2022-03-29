package ClassAssignments.Day20ClassAssignment_28thMarch;

import java.util.Arrays;

/**
 * Problem Description
 *
 * You are given a constant array A.
 *
 * You are required to return another array which is the reversed form of the input array.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= A.size() <= 10000
 *
 * 1 <= A[i] <= 10000
 *
 *
 *
 * Input Format
 *
 * First argument is a constant array A.
 *
 *
 *
 * Output Format
 *
 * Return an integer array.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * A = [1,2,3,2,1]
 * Input 2:
 *
 * A = [1,1,10]
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  [1,2,3,2,1]
 * Output 2:
 *
 *  [10,1,1]
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 * Reversed form of input array is same as original array
 * Explanation 2:
 *
 * Clearly, Reverse of [1,1,10] is [10,1,1]
 *
 * */
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,1,10};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        swap(arr,start,end);

    }
    private static void swap(int arr[],int start,int end){
        while(start<end){
            int c=arr[end];
            arr[end]=arr[start];
            arr[start]=c;
            start++;
            end--;
        }
    }
}
