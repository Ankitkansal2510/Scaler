package ClassAssignments.Day34ClassAssignment_6thMay;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
 *
 * If the answer does not exist return an array with a single element "-1".
 *
 * First sub-array means the sub-array for which starting index in minimum.
 *
 *
 *
 * Problem Constraints
 * 1 <= length of the array <= 100000
 * 1 <= A[i] <= 109
 * 1 <= B <= 109
 *
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 *
 * The second argument given is integer B.
 *
 *
 *
 * Output Format
 * Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4, 5]
 *  B = 5
 * Input 2:
 *
 *  A = [5, 10, 20, 100, 105]
 *  B = 110
 *
 *
 * Example Output
 * Output 1:
 *
 *  [2, 3]
 * Output 2:
 *
 *  -1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  [2, 3] sums up to 5.
 * Explanation 2:
 *
 *  No subarray sums up to required number.
 *
 * **/
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int A[]={1, 1000000000};
        int B=1000000000;
        int result[]=findSubArray(A,B);
        System.out.println(Arrays.toString(result));

        int result1[]=findSubArrayBetter(A,B);
        System.out.println(Arrays.toString(result1));
    }
    private static int[] findSubArrayBetter(int arr[],int B){
/**
 * The idea here is to calculate sum at each itereation , and if sum is >B
 * then subtract the starting index.
 *
 * **/
        int sum=arr[0];
        int l=0;
        int r=1;

        for(r=1;r<=arr.length;r++){
            while(sum>B && l<=r ){
                sum=sum-arr[l];
                l++;
            }
            if(B==sum){
                int[] ans = new int[r - l ];
                for (int i = l; i <r; i++) ans[i - l] = arr[i];
                return ans;
            }
            if(r<arr.length){
                sum=sum+arr[r];
            }

        }
        return new int[]{-1};
    }
    private static int[] findSubArray(int arr[],int B) {
        if(arr.length==0){
            return new int[]{-1};
        }

        if(String.valueOf(B).isEmpty()){
            return new int[]{-1};
        }

        int startIndex = Integer.MAX_VALUE;
        int endIndex = -1;
        int e = 0;
        boolean flag=false;
        for (int s = 0; s < arr.length; s++) {
            int sum = 0;
            for (e = s; e < arr.length; e++) {
                sum += arr[e];
                if (sum == B && !flag) {
                    startIndex = Math.min(startIndex,s);
                    endIndex = e;
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(flag) {
            int result[] = new int[endIndex - startIndex + 1];
            int index = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                result[index] = arr[i];
                index++;
            }
            return result;
        }
        return new int[]{-1};
    }
}
