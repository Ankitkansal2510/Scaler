package ClassAssignments.Day23ClassAssignment_6thApril;
/***
 * Problem Description
 * You are given an integer array A of length N.
 * You have to find the sum of all subarray sums of A.
 * More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
 * A subarray sum denotes the sum of all the elements of that subarray.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= Ai <= 10 4
 *
 *
 * Input Format
 * The first argument is the integer array A.
 *
 *
 * Output Format
 * Return a single integer denoting the sum of all subarray sums of the given array.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 * Input 2:
 *
 * A = [2, 1, 3]
 *
 *
 * Example Output
 * Output 1:
 * 20
 * Output 2:
 *
 * 19
 *
 *
 * Example Explanation
 * Explanation 1:
 * The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
 * Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
 * Explanation 2:
 *
 * Similiar to the first example, the sum of all subarray sums for this array is 19.
 *
 *
 *
 * */
public class SumOfAllSubArrays {
    public static void main(String[] args) {
        int arr[]={2, 1, 3};
        int result=findSumOfAllSubArray(arr);//TC=O(N^2)
        System.out.println(result);

        int secondResult=findsumBest(arr); //TC=O(N)
        System.out.println(secondResult);
    }
    private static int findSumOfAllSubArray(int arr[]){
        int ans=0;
        for(int s=0;s<arr.length;s++){
            int sum=0;
            for(int e=s;e<arr.length;e++){
                sum+=arr[e];
                ans+=sum;
            }
        }
        return ans;
    }

    private static int findsumBest(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i]*(i+1)*(arr.length-i);
        }
        return ans;
    }
}
