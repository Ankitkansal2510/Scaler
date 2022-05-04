package ClassAssignments.Day31ClassAssignment_29thApril;

import java.util.Arrays;

/**
 * Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.
 *
 * Note: Using the library sort function is not allowed.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 1000000
 * 0 <= A[i] <= 2
 *
 *
 * Input Format
 * First and only argument of input contains an integer array A.
 *
 *
 * Output Format
 * Return an integer array in asked order
 *
 *
 * Example Input
 * Input 1 :
 *     A = [0 1 2 0 1 2]
 * Input 2:
 *
 *     A = [0]
 *
 *
 * Example Output
 * Output 1:
 *     [0 0 1 1 2 2]
 * Output 2:
 *
 *     [0]
 *
 *
 * Example Explanation
 * Explanation 1:
 *     [0 0 1 1 2 2] is the required order.
 *
 * **/
public class SortByColor {
    public static void main(String[] args) {
        int A[]={0};
        int sortedArray[]=sortByColor(A);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] sortByColor(int A[]){
        /**
         * In this approach we will take three variable l,m,h
         * l=0,m=0,h-arr.length-1
         *
         * we want to keep all the zeros at the back of L
         * and we want to keep all the 2 after the h
         *
         * so what we do?
         * We will run whileM<=h
         * whenever we found A[M]==0,swap(arr,l,m) l++,m++
         * if(A[m]==1, do nothing just increement m;
         * if(a[m]==2) swap(A,m,h) h--
         *
         * */
        int l=0,m=0;
        int h=A.length-1;
        while(m<=h){
            if(A[m]==0){
                swap(A,l,m);
                l++;
                m++;
            }
            else if(A[m]==1){
                m++;
            }
            else{
                swap(A,m,h);
                h--;
            }
        }
        return A;
    }

    private static void swap(int arr[],int i,int j){
        int c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }
}
