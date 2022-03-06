package ClassAssignments.Day12ClassAssignment_4thMarch;

import java.util.Scanner;

/**
 *
 * Write a program to print sum of elements of
 * the input array A of size N where you have to take integer N and further
 * N elements as input from user
 *
 * Input Format
 *
 * A single line representing N followed by N integers of the array A
 *
 *
 *
 * Output Format
 *
 * A single integer containing sum of elements from the input array.
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
 * 15
 * Output 2:
 *
 * 180
 * */
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter an element to be inserted");
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}
