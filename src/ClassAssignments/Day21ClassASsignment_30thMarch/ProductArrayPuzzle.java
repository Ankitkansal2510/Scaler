package ClassAssignments.Day21ClassASsignment_30thMarch;

import java.util.Arrays;

/***
 * Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
 *
 * Note: It is always possible to form the product array with integer (32 bit) values.
 *
 *
 * Input Format
 *
 * The only argument given is the integer array A.
 * Output Format
 *
 * Return the product array.
 * Constraints
 *
 * 1 <= length of the array <= 1000
 * 1 <= A[i] <= 10
 * For Example
 *
 * Input 1:
 *     A = [1, 2, 3, 4, 5]
 * Output 1:
 *     [120, 60, 40, 30, 24]
 *
 * Input 2:
 *     A = [5, 1, 10, 1]
 * Output 2:
 *     [10, 50, 5, 50]
 *
 * */
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int result[] = productArray(A);
        System.out.println(Arrays.toString(result));
    }
    private static int[] productArray(int A[]){
        long product=1;
        int result[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            product*=A[i];
        }

        for(int i=0;i<A.length;i++){
            result[i]=(int)product/A[i];
        }
        return result;
    }
}
