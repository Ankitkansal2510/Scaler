package ClassAssignments.Day22ClassAssignment_1stApril;

import java.util.Arrays;

/***
 * Problem Description
 *
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
 *
 * An element is a leader if it is strictly greater than all the elements to its right side.
 *
 * NOTE:The rightmost element is always a leader.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 105
 *
 * 1 <= A[i] <= 108
 *
 *
 *
 * Input Format
 *
 * First and only argument is an integer array A.
 *
 *
 *
 * Output Format
 *
 * Return an integer array denoting all the leader elements of the array.
 *
 * NOTE: Ordering in the output doesn't matter.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [16, 17, 4, 3, 5, 2]
 * Input 2:
 *
 *  A = [1, 2]
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  [17, 2, 5]
 * Output 2:
 *
 *  [2]
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  Element 17 is strictly greater than all the elements on the right side to it.
 *  Element 2 is strictly greater than all the elements on the right side to it.
 *  Element 5 is strictly greater than all the elements on the right side to it.
 *  So we will return this three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
 * Explanation 2:
 *
 *  Only 2 the rightmost element is the leader in the array.
 *
 * */
public class LeadersInArray {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        int leaderArray[]=createLeaderElementArray(arr);
        System.out.println(Arrays.toString(leaderArray));
    }

    private static int[] createLeaderElementArray(int arr[]){
        int count=0;
        int result[]=new int[arr.length];
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                result[count]=max;
                count++;
            }
        }
        int [] finalResult=new int[count];
        for(int i=0;i<finalResult.length;i++){
           finalResult[i] =result[i];
        }
        return finalResult;
    }
}
