package ClassAssignments.Day22ClassAssignment_1stApril;
/**
 * Problem Description
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
 *
 * and at least one occurrence of the minimum value of the array.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 2000
 *
 *
 *
 * Input Format
 * First and only argument is vector A
 *
 *
 *
 * Output Format
 * Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 3]
 * Input 2:
 *
 * A = [2]
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Only choice is to take both elements.
 * Explanation 2:
 *
 *  Take the whole array.
 *
 * */
public class ClosestMinMax {
    public static void main(String[] args) {
        int arr[] = { 377, 448, 173, 307, 108};
        int result = minSubarray(arr);
        System.out.println(result);
    }

    private static int minSubarray(int arr[]) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int latest_min =Integer.MIN_VALUE;
        int latest_max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        //find the min value from array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        //find the maximum value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                latest_max = i;
                ans = Math.min(ans, Math.abs(i - latest_min + 1));
            }

            if(arr[i] == min){
                latest_min=i;
                ans=Math.min(ans,Math.abs(i-latest_max+1));
            }
        }
        return ans;
    }
}