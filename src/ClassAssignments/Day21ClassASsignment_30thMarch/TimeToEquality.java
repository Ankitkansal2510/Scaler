package ClassAssignments.Day21ClassASsignment_30thMarch;
/***
 * Problem Description
 *
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 *
 * Find the minimum time in seconds to make all elements of the array equal.
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 1000000
 * 1 <= A[i] <= 1000
 *
 *
 * Input Format
 *
 * First argument is an integer array A.
 *
 *
 * Output Format
 *
 * Return an integer denoting the minimum time to make all elements equal.
 *
 *
 * Example Input
 *
 * A = [2, 4, 1, 3, 2]
 *
 *
 * Example Output
 *
 * 8
 *
 *
 * Example Explanation
 *
 * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 * */
public class TimeToEquality {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,2};
        int result=solve(arr);
        System.out.println(result);
    }

    private static int solve(int A[]){
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            int diff=Math.abs(A[i]-max);
            count=count+diff;
        }
        return count;
    }
}
