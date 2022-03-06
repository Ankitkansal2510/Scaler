package ClassAssignments.Day12ClassAssignment_4thMarch;

import java.util.Arrays;
import java.util.Scanner;

/***
 * You are given a constant array A and an integer B.
 *
 * You are required to return another array where outArr[i] = A[i] + B.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= A.size() <= 10000
 *
 * 1 <= A[i] <= 10000
 *
 * 1 <= B <= 10000
 *
 *
 *
 * Input Format
 *
 * First argument is a constant array A.
 *
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 *
 * You have to return an integer array.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * A = [1,2,3,2,1]
 * B = 3
 * Input 2:
 *
 * A = [1,1,10]
 * B = 6
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  [4,5,6,5,4]
 * Output 2:
 *
 *  [7,7,16]
 *
 *
 * */

public class ArratModification {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        int B=3;

        int newArr[]=solve(arr,B);
        System.out.println(Arrays.toString(newArr));
    }
    private static int[] solve(int arr[],int b){

        int newArr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i]+3;
        }
        return newArr;
    }
}
