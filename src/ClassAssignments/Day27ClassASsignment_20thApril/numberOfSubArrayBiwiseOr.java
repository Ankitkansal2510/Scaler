package ClassAssignments.Day27ClassASsignment_20thApril;
/**
 * Given an array B of length A with elements 1 or 0. Find the number of subarrays with bitwise OR 1.
 *
 *
 * Problem Constraints
 * 1 <= A <= 105
 *
 *
 * Input Format
 * The first argument is a single integer A.
 * The second argument is an integer array B.
 *
 *
 * Output Format
 * Return the number of subarrays with bitwise array 1.
 *
 *
 * Example Input
 * Input 1:
 *  A = 3
 * B = [1, 0, 1]
 * Input 2:
 *  A = 2
 * B = [1, 0]
 *
 *
 * Example Output
 * Output 1:
 * 5
 * Output2:
 * 2
 *
 *
 * Example Explanation
 * Explanation 1:
 * The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
 * Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 * Explanation 2:
 * The subarrays are :- [1], [0], [1, 0]
 * Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 *
 *
 * */
public class numberOfSubArrayBiwiseOr {
    public static void main(String[] args) {
        int arr[] = {1, 0,1};
        int A = arr.length;
        int result = findSUbArray(A, arr);
        System.out.println(result);
        int betterSolution = solve(A, arr);
        System.out.println(betterSolution);
        int betterSolution1 = thridApproach(A, arr);
        System.out.println(betterSolution1);
    }

    private static int findSUbArray(int A, int arr[]) {
        int sum = 0;
        for (int s = 0; s < A; s++) {
            for (int e = s; e < A; e++) {
                int result = bitWise(arr, s, e);
                sum += result;
            }
        }
        return sum;
    }

    private static int bitWise(int arr[], int s, int e) {
        int result = 0;
        for (int i = s; i <= e; i++) {
            result = result | arr[i];
        }
        if (result == 1) {
            return 1;
        } else {
            return 0;
        }
    }

        public static int solve ( int A, int[] B){
            int last = 0;
            int ans = 0;
            for (int i = 0; i < A; i++) {
                if (B[i] == 1) {
                    last = i + 1;
                }
                ans += last;
            }
            return ans;
        }

        private static int thridApproach(int A,int[] B){
        int ans=0;
        int LO=-1;
        for(int i=0;i<A;i++){
            if(B[i]==1){
                ans+=i+1;
                LO=i;
            }
            else{
                ans+=LO+1;
            }
        }
        return  ans;
        }
    }
