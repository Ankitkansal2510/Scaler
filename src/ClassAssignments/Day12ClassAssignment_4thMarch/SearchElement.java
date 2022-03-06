package ClassAssignments.Day12ClassAssignment_4thMarch;
/***
 *
 * You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= T <= 10
 *
 * 1 <= |A| <= 105
 *
 * 1 <= A[i], B <= 109
 *
 *
 *
 * Input Format
 *
 * First line of the input contains a single integer T.
 *
 * Next, each of the test case consists of 2 lines:
 *
 * First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
 * Second line contains a single integer B
 *
 *
 * Output Format
 *
 * For each test case, print on a separate line 1 if the element exists, else print 0.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  1
 *  5 4 1 5 9 1
 *  5
 * Input 2:
 *
 *  1
 *  3 7 7 2
 *  1
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *   B = 5  is present at position 3 in A
 * Explanation 2:
 *
 *   B = 1  is not present in A.
 *
 */

import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test case");
        int T=sc.nextInt();
        for(int k=1;k<=T;k++){
            System.out.println("Enter the length of an array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                System.out.println("Enter an element to be inserted");
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter an element to be searched in an array");
            int searchNumber=sc.nextInt();
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==searchNumber){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
