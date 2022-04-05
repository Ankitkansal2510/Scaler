package ClassAssignments.Day22ClassAssignment_1stApril;
/***
 * Problem Description
 * You are given an integer array A.
 *
 * Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.
 *
 * Return "YES" if it is possible; otherwise, return "NO" (without quotes).
 *
 *
 *
 * Problem Constraints
 * 1 <= |A|, A[i] <= 106
 *
 *
 *
 * Input Format
 * The first and the only input argument is an integer array, A.
 *
 *
 *
 * Output Format
 * Return a string "YES" or "NO" denoting the answer.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [2, 4, 8, 6]
 * Input 2:
 *
 *  A = [2, 4, 8, 7, 6]
 *
 *
 * Example Output
 * Output 1:
 *
 *  "YES"
 * Output 2:
 *
 *  "NO"
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  We can divide A into [2, 4] and [8, 6].
 * Explanation 2:
 *
 *  There is no way to divide the array into even length subarrays.
 *
 * */
public class EvenSubArray {
    public static void main(String[] args) {
        int arr[]={2,4,8,6};
        System.out.println(isEvenSubarrayPossible(arr));
    }

    private static String isEvenSubarrayPossible(int arr[]){
        /**observations we need to find to crack this question*
         *
         * There are 2 observations in this problem
         *
         * 1. If the length of the array is not even then we cannot divide it into even length subarray
         * 2.if the first and the last index element of an array is not even then
         * we cannot divide it into length of even subarray whose first and the last element is even
         *
         *
         *
         */
       if(arr.length%2!=0 || arr[0]%2!=0 || arr[arr.length-1]%2!=0){
           return "NO";
       }else{
           return "YES";
       }
    }
}
