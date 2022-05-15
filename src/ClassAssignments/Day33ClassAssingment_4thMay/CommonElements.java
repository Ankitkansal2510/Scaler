package ClassAssignments.Day33ClassAssingment_4thMay;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
 *
 * NOTE:
 *
 * Each element in the result should appear as many times as it appears in both arrays.
 * The result can be in any order.
 *
 *
 * Problem Constraints
 * 1 <= N, M <= 105
 *
 * 1 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * First argument is an integer array A of size N.
 *
 * Second argument is an integer array B of size M.
 *
 *
 *
 * Output Format
 * Return an integer array denoting the common elements.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 2, 1]
 *  B = [2, 3, 1, 2]
 * Input 2:
 *
 *  A = [2, 1, 4, 10]
 *  B = [3, 6, 2, 10, 10]
 *
 *
 * Example Output
 * Output 1:
 *
 *  [1, 2, 2]
 * Output 2:
 *
 *  [2, 10]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
 * Explantion 2:
 *
 *  Elements (2, 10) appears in both the array.
 *
 *
 * */
public class CommonElements {
    public static void main(String[] args) {
        int A[]={2, 1, 4, 10};
        int B[]={3, 6, 2, 10, 10};
        int result[]=findCommonElements(A,B);
        System.out.println(Arrays.toString(result));
    }
    private static int[] findCommonElements(int A[],int B[]){
        int [] tempresult=new int[A.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(!hm.containsKey(A[i])){
                hm.put(A[i],1);
            }else{
                hm.put(A[i],hm.get(A[i])+1);
            }
        }
        int j=0;
        for(int i=0;i<B.length;i++){
            if(hm.containsKey(B[i])){
                int value=hm.get(B[i]);
                if(value>0){
                    tempresult[j]=B[i];
                    hm.put(B[i],hm.get(B[i])-1);
                    j++;
                }
            }
        }
        int Result[]=new int[j];
        for(int i=0;i<j;i++){
            Result[i]=tempresult[i];
        }
        return Result;
    }
}
