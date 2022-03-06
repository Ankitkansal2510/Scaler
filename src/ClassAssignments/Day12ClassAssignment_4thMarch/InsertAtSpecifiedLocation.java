package ClassAssignments.Day12ClassAssignment_4thMarch;
/***
 *
 *
 * Write a program to input N numbers array from user and insert an element Y in it at specified position X.
 *
 * Problem Constraints
 *
 * Input Format
 * First line is N which means number of elements.
 *
 * Second line contains N space separated integers.
 *
 * Third line is X position where Y has to be inserted.
 *
 * Fourth line is Y which has to be inserted.
 *Output Format
 * N+1 space separated integers of the input array after inserting the element at required position.
 * Example Input
 * Input 1:
 *
 * 5
 * 2 3 1 4 2
 * 3
 * 5
 *
 *
 * Example Output
 * Output 1:
 *
 * 2 3 5 1 4 2
 */

import java.util.Scanner;
public class InsertAtSpecifiedLocation {
    public static void main(String[] args) {
        insert();
    }

    private static void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int N=sc.nextInt();
        int arr[]=new int[N+1];
        for(int i=0;i<arr.length-1;i++){
            System.out.println("Enter the element needs to be inserted in an array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter position at which element needs to be inserted");
        int X=sc.nextInt();
        System.out.println("Enter the element that needs to be inserted");
        int Y=sc.nextInt();
        for(int j=arr.length-1;j>=X;j--){
            arr[j]=arr[j-1];
        }

        arr[X-1]=Y;

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
