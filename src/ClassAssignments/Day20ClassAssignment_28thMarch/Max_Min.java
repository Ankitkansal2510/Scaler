package ClassAssignments.Day20ClassAssignment_28thMarch;
/**
 * Problem Description
 *
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
 * */
public class Max_Min {
    public static void main(String[] args) {
        int arr[]={10,50,40,80};
        findMax_min(arr);
    }
    private static void findMax_min(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Maximum element in array is : " + max + " and minimum element " +
                "in an array is : " + min);
    }
}
