package ClassAssignments.Day12ClassAssignment_4thMarch;

import java.util.Scanner;

/***
 *
 * Write a program to print all negative numbers from input array A of size N where you have to take integer N and further N elements as input from user.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 1000
 *
 *
 *
 * -1000 <= A <= 1000
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
 * A single line containing elements from the input array which are negative in the same order.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * 5 1 -5 2 -8 -4
 * Input 2:
 *
 * 4 -1 0 -8 -1
 *
 *
 * Example Output
 *
 * Output 1:
 *
 * -5 -8 -4
 * Output 2:
 *
 * -1 -8 -1
 *
 * */
public class PrintNegativeInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter an element to be inserted");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
