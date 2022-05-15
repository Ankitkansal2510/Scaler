package ClassAssignments.Day25ClassAssignment_11thApril;

import java.util.Arrays;

/**
 *
 *
 * Given an array of integers A, of size N.
 *
 * Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.
 *
 * NOTE: It is guaranteed that an answer always exists.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 *
 * -109 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * The first and only argument given is the integer array A.
 *
 *
 *
 * Output Format
 * Return maximum size subarray of A having only non-negative elements. If there are more than one such subarrays, return the one having earliest starting index in A.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [5, 6, -1, 7, 8]
 * Input 2:
 *
 *  A = [1, 2, 3, 4, 5, 6]
 *
 *
 * Example Output
 * Output 1:
 *
 *  [5, 6]
 * Output 2:
 *
 *  [1, 2, 3, 4, 5, 6]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  There are two subarrays of size 2 having only non-negative elements.
 *  1. [5, 6]  starting point  = 0
 *  2. [7, 8]  starting point  = 3
 *  As starting point of 1 is smaller, return [5, 6]
 * Explanation 2:
 *
 *  There is only one subarray of size 6 having only non-negative elements:
 *  [1, 2, 3, 4, 5, 6]
 * **/
public class MaximumPositivity {
    public static void main(String[] args) {
        int A[]={5, 6, -1, 7, 8};
        int result[]=maximumPositiveElement(A);
        System.out.println(Arrays.toString(result));
    }

    private static int[] maximumPositiveElement(int A[]){
        /**
         * The approach is to start fro i=0 and j=0;
         * if we found A[i]>=0 increement j,
         *else if A[i] is negative then we need to first find the length and store the start and end
         * index, and also we need to compare the length and post that we need to start
         * i and j from the next element of the negative element.
         *
         * */
        int n = A.length;
        int i=0;int j=0;
        int start=0;
        int end=0;
        while(i<n && j<n){
            if(A[j]>=0){
                j++;
            }else{
                if(j-i>end-start+1){
                    start=i;
                    end=j-1;
                    i=j+1;
                    j++;
                }
            }
        }
        int result[]=new int[end-start+1];
        int index=0;
        for( i=start;i<=end;i++){
            result[index++]=A[i];
        }
        return result;
    }
}
