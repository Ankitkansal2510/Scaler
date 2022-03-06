package ClassAssignments.Day12ClassAssignment_4thMarch;


import java.util.Arrays;
import java.util.Scanner;

/***
 *
*Problem Description
 *
 * You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
 *
 * You have to put the odd and even elements of array A in 2 separate arrays and print the new arrays.
 *
 * NOTE: Array elements should have the same relative order as in A.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= T <= 10
 *
 * 1 <= |A| <= 105
 *
 * 1 <= A[i] <= 109
 *
 *
 *
 * Input Format
 *
 * First line of the input contains a single integer T.
 *
 * For each test case:
 *
 * First line consists of a single integer |A| denoting the length of array.
 * Second line consists of |A| space separated integers denoting the elements of array A.
 *
 *
 * Output Format
 *
 * For each test case:
 *
 * First line should contain an array of space separated integers containing all the odd elements of array A
 * Second line should contain an array of space separated integers containing all the even elements of array A
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  2
 *  5
 *  1 2 3 4 5
 *  3
 *  4 3 2
 * Input 2:
 *
 *  2
 *  3
 *  2 2 2
 *  2
 *  1 1
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  1 3 5
 *  2 4
 *  3
 *  4 2
 * Output 2:
 *
 *
 *  2 2 2
 *  1 1
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  Test Case 1:
 *  Odd elements in the array(in the order they occur) are: 1, 3, 5.
 *  Even elements in the array(in the order they occur) are: 2, 4.
 *
 *  Test Case 2
 *  Odd elements in the array(in the order they occur) are: 3.
 *  Even elements in the array(in the order they occur) are: 4, 2.
 * Explanation 2:
 *
 *  Test Case 1:
 *  There are no odd elements in the array.
 *  Even elements in the array(in the order they occur) are: 2, 2, 2.
 *
 *  Test Case 2
 *  Odd elements in the array(in the order they occur) are: 1, 1.
 *  There are
*
**/
public class SeperateEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the test case");
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            System.out.println("Enter the length of an array");
            int N=sc.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<arr.length;j++){
                System.out.println("Enter an element to be inserted");
                arr[j]=sc.nextInt();
            }

            int oddArr[]=new int[N];
            int evenArr[]=new int[N];
            int k=0;
            int l=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]%2!=0){
                    oddArr[k]=arr[j];
                    k++;
                }else{
                    evenArr[l]=arr[j];
                    l++;
                }


            }
            for(int m=0;m<k;m++){
                System.out.print(oddArr[m] + " ");
            }
            System.out.println();
            for(int m=0;m<l;m++){
                System.out.print(evenArr[m] + " ");
            }
            System.out.println();
        }
    }
}
