package ClassAssignments.Day11ClassAssignment_2ndMarch;

import java.util.Scanner;

/**
 *
 * Laxman is newbie in programming.
 * He just learned how to generate fibonacci series, he told this to his elder brother,
 * so his brother gave him an interesting problem.
 *
 *
 * The problem is, given an integer N, task is to check whether the given number exist
 * in fibonacci sequence or not.
 *
 *
 * The first line contains an integer, T, denoting the number of test cases.
 *
 * Next T lines contains an integer, N.
 *
 *
 * OUTPUT:
 *
 *
 * For each test case , print “Yes” if the number exists in fibonacci sequence, else print “No”.
 *
 *
 * CONSTRAINTS:
 *
 *
 * • 1 ≤ T ≤ 10^5
 *
 *
 * • 1 ≤ N ≤ 10^9
 *
 * SAMPLE INPUT
 *
 *
 * 1
 *
 * 8
 *
 *
 * SAMPLE OUTPUT
 *
 *
 * Yes
 *
 *
 * EXPLANATION
 *
 *
 * Fibonacci Series is: 0 1 1 2 3 5 8, As 8 is the part of Fibonacci series so the output is "Yes"
 * */
public class ISFibonnaci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for(int j=1;j<=22;j++) {
            System.out.println("enter the number you want to search in fibonnaci series");
            int number = sc.nextInt();
            int arr[] = getFibonnaci();
            boolean flag = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    System.out.println("Yes");
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("No");
            }
        }
    }

    private static int[] getFibonnaci(){
        int arr[]=new int[10000000];
         arr[0]=0;
         arr[1]=1;
        for(int i=2;i< arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
}
