package ClassAssignments.Day21ClassASsignment_30thMarch;
/**
 * Problem Description
 *
 * You are given an array A of integers of size N.
 *
 * Your task is to find the equilibrium index of the given array
 *
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 *
 * NOTE:
 *
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 105
 * -105 <= A[i] <= 105
 *
 *
 * Input Format
 *
 * First arugment is an array A .
 *
 *
 * Output Format
 *
 * Return the equilibrium index of the given array. If no such index is found then return -1.
 *
 *
 * Example Input
 *
 * Input 1:
 * A=[-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 *
 * A=[1,2,3]
 *
 *
 * Example Output
 *
 * Output 1:
 * 3
 * Output 2:
 *
 * -1
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 * Explanation 1:
 *
 * There is no such index.
 *
 *
 * */
public class EquilibriumIndex {

    public static void main(String[] args) {
       // int arr[]={-7,1,5,2,-4,3,0};
        int arr[]={1,2,3,7,1,2,3};
        int result=findEquilibriumIndex(arr);
        System.out.println(result);
    }

    private static int findEquilibriumIndex(int arr[]){
        //Build Preffix sum array
        int ps[]=new int[arr.length];
        ps[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        //now find sum of all left elements and sum of all right elements
        int sl=0;//sum of left elements
        int sr=0;//sum of right elements
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if(i==0){
             sl=0;
             sr=ps[n-1]-ps[i];
            }
            else if(i==n-1){
                sl=ps[i-1];
                sr=0;
            }
            else{
                sl=ps[i-1]; //sum of elements to the left
                sr=ps[n-1]-ps[i]; //sum of elements to the right
            }
            if(sl==sr){
                return i;//found equilibrium index
            }
        }
        return -1;//no equilibrium index exists
    }

}
