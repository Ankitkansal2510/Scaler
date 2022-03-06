package ClassAssignments.Day12ClassAssignment_4thMarch;
/***
 * Write a program to print maximum and minimum elements of the input array A of size N where you have to take integer N and other N elements as input from the user.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 1000
 *
 * 1 <= A <= 1000
 *
 *
 *
 * Input Format
 *
 * A single line representing N followed by N integers of the array A
 *
 *
 *
 * Output Format
 *
 * A single line containing two space separated integers representing maximum and minimum elements of the input array.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * 5 1 2 3 4 5
 * Input 2:
 *
 * 4 10 50 40 80
 *
 *
 * Example Output
 *
 * Output 1:
 *
 * 5 1
 * Output 2:
 *
 * 80 10
 *
 */

import java.util.Scanner;
public class MaxAndMinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter an element to be inserted");
            arr[i]= sc.nextInt();
        }

        int MAX=Integer.MIN_VALUE;
        int MIN=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>MAX){
                MAX=arr[i];
            }

            if(arr[i]<MIN){
                MIN=arr[i];
            }
        }
        System.out.println(MAX + " " + MIN);
    }
}
