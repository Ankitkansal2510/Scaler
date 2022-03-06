package ClassAssignments.Day12ClassAssignment_4thMarch;
/***
 * Write a program to input N numbers array from user and delete an element from it at specified position X.
 *
 * Problem Constraints
 *
 * 1 <= N <= 100
 *
 * 1 <= A[i] <= 1000
 *
 * 1 <= X <= N
 *
 *
 *
 * Input Format
 * First line is N which means number of elements.
 *
 * Second line contains N space separated integers.
 *
 * Third line is X position which has to be deleted.
 *
 *
 *
 * Output Format
 * N-1 space separated integers of the input array after deleting the element at required position.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * 5
 * 2 3 1 4 2
 * 3
 *
 *
 * Example Output
 * Output 1:
 *
 * 2 3 4 2
 *
 *
 */

import java.util.Scanner;
public class DeletElementAtSpecifiedIndex {
    public static void main(String[] args) {
        remove();
    }

    private static void remove() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element needs to be inserted in array");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position you want to delete from array");
        int X = sc.nextInt();

        for (int j = X - 1; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
