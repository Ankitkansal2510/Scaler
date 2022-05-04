package ClassAssignments.Day31ClassAssignment_29thApril;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 2*105
 * 1 <= A[i] <= 107
 *
 *
 * Input Format
 * First and only argument is an integer array A.
 *
 *
 *
 * Output Format
 * Return 1 if any such integer p is present else, return -1.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [3, 2, 1, 3]
 * Input 2:
 *
 *  A = [1, 1, 3, 3]
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  -1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  For integer 2, there are 2 greater elements in the array..
 * Explanation 2:
 *
 *  There exist no integer satisfying the required conditions.
 *
 * **/
public class NobleInteger {
    public static void main(String[] args) {


       // int arr[] = {  -1, -2, 0, 0, 0, -3};
        int arr[] = { 6,1};
        int result = findNobleInteger(arr);
        System.out.println(result);

    }


    private static int findNobleInteger(int A[]){
        Arrays.sort(A);
        reverse(A);
        int ans=0;
        int greator=0;
        if(A[0]==0){
            ans++;
        }
        for(int i=1;i<A.length;i++){
            if(A[i]!=A[i-1]){
                greator=i;
            }

            if(A[i]==greator){
                ans++;
            }
        }
        if(ans==0){
            return -1;
        }
        return 1;
    }
    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}