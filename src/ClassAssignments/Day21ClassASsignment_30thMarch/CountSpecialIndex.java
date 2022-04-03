package ClassAssignments.Day21ClassASsignment_30thMarch;
/**
* Problem Description

Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Problem Constraints

1 <= n <= 105
-105 <= A[i] <= 105


Input Format

First argument contains an array A of integers of size N


Output Format

Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Example Input

Input 1:
A=[2, 1, 6, 4]
Input 2:

A=[1, 1, 1]


Example Output

Output 1:
1
Output 2:

3


Example Explanation

Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
Therefore, the required output is 1.
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Therefore, the required output is 3.
*
* */
public class CountSpecialIndex {
    public static void main(String[] args) {
        int arr[]={2,1,6,4};
        int result=findSpecialIndex(arr);
        System.out.println(result);
    }

private static int findSpecialIndex(int arr[]){
        //Build prefix sum even
    int n=arr.length;
    int PSeven[]=new int[n];
    int PSodd[]=new int[n];
    int count=0;
    PSeven[0]=arr[0];
    PSodd[0]=0;
    for(int i=1;i<n;i++){
        if(i%2==0){
            PSeven[i]=PSeven[i-1]+arr[i];
        }else{
            PSeven[i]=PSeven[i-1];
        }
    }

    //build prefix sum odd array
    for(int i=1;i<n;i++){
        if(i%2!=0){
            PSodd[i]=PSodd[i-1]+arr[i];
        }else{
            PSodd[i]=PSodd[i-1];
        }
    }

    //find sum of all even index element and sum of all odd index eleme
    int Seven=0;
    int Sodd=0;

    /**
     * Seven=sum of all even index element to the left + sum of all even index elem to the right
     * Sodd=sum of all odd index element to the left+sum of all odd index to the right
     * **/
    for(int i=0;i<n;i++){
        if(i==0) {
            Seven = 0 + PSodd[n - 1] - PSodd[i];
            Sodd = 0 + PSeven[n - 1] - PSeven[i];
        }else {
            Seven = PSeven[i - 1] + PSodd[n - 1] - PSodd[i];
            Sodd = PSodd[i - 1] + PSeven[n - 1] - PSeven[i];
        }
        if(Seven==Sodd){
            count++;
        }
    }
    return count;
}
}
