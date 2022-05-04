package ClassAssignments.Day30ClassAssignment_27thApril;
/**
 * Problem Description
 * Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exists in the array.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 5*105
 * 1 <= num[i] <= 109
 *
 *
 * Input Format
 * Only argument is an integer array.
 *
 *
 * Output Format
 * Return an integer.
 *
 *
 * Example Input
 * [2, 1, 2]
 *
 *
 * Example Output
 * 2
 *
 *
 * Example Explanation
 * 2 occurs 2 times which is greater than 3/2.
 *
 *
 * **/
public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={2, 1, 2};
        int result=findMajorityelement(arr);
        System.out.println(result);
    }

    private static int findMajorityelement(int arr[]) {

        int elem = arr[0];
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == elem) {
                freq++;
            } else {
                if (freq == 0) {
                    elem = arr[i];
                } else {
                    freq--;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return elem;
        } else {
            return 0;
        }
    }
}
