package PractiseProblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Fibonacci Pattern
 * Take N (number of rows), print the following pattern (for N = 4)
 *
 *  0
 *  1 1
 *  2 3 5
 *  8 13 21 34
 *
 * Constraints:
 * 0 < N < 100
 *
 * Explanation:
 * For given input n, You need to print n(n+1)/2 fibonacci numbers.
 * Kth row contains , next k fibonacci numbers.
 *
 * */
public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int n=sc.nextInt();
        printPattern(n);
    }
    private static void printPattern(int n){
        int number=n*(n+1)/2;
       // System.out.println(number);
        int arr[]=new int[number];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<number;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){ //or  for(int j=0;j<=number-(number-i);j++)
                System.out.print(arr[k] + " ");
                k++;
            }
            System.out.println();
        }
    }
}
