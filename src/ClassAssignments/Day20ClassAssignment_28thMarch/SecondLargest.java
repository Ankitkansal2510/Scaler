package ClassAssignments.Day20ClassAssignment_28thMarch;
/**
 * Problem Description
 * You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 * 0 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * The first argument is an integer array A.
 *
 *
 *
 * Output Format
 * Return the second largest element. If no such element exist then return -1.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [2, 1, 2]
 * Input 2:
 *
 *  A = [2]
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  -1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  First largest element = 2
 *  Second largest element = 2
 *  Third largest element = 1
 * Explanation 2:
 *
 *  There is no second largest element in the array.
 *
 *
 * */
public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,3,4,22,5};
        System.out.println(solve(arr));
    }

    public static int solve(int[] A) {
        int max=A[0];
        int secondMax=max;
        if(A.length<2){
            return -1;
        }
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                secondMax=max;
                max=A[i];
            }
            if(A[i]>secondMax && A[i]<max){
                secondMax=A[i];
            }
        }
        return secondMax;
    }

}
