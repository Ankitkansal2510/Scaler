package ClassAssignments.Day34ClassAssignment_6thMay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
 *
 * Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
 *
 * NOTE: if B > N, return an empty array.
 *
 *
 *
 * Input Format
 * First argument is an integer array A
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return an integer array.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 1, 3, 4, 3]
 *  B = 3
 * Input 2:
 *
 *  A = [1, 1, 2, 2]
 *  B = 1
 *
 *
 * Example Output
 * Output 1:
 *
 *  [2, 3, 3, 2]
 * Output 2:
 *
 *  [1, 1, 1, 1]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  A=[1, 2, 1, 3, 4, 3] and B = 3
 *  All windows of size B are
 *  [1, 2, 1]
 *  [2, 1, 3]
 *  [1, 3, 4]
 *  [3, 4, 3]
 *  So, we return an array [2, 3, 3, 2].
 * Explanation 2:
 *
 *  Window size is 1, so the output array is [1, 1, 1, 1].
 * **/
public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        int A[]={1, 2, 1, 3, 4, 3};
        int B=3;
        int result[]=distinctNumbers(A,B);
        System.out.println(Arrays.toString(result));
    }
    private static int[] distinctNumbers(int A[],int B){
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int N=A.length;
        for(int i=0;i<B;i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], 1);
            }
        }
        list.add(hm.size());
            int s=1;
            int e=B;
            while(e<N){
                hm.put(A[s-1],hm.get(A[s-1])-1);
                if(hm.get(A[s-1])==0){
                    hm.remove(A[s-1]);
                }
                if(hm.containsKey(A[e])){
                    hm.put(A[e],hm.get(A[e])+1);
                }else{
                    hm.put(A[e],1);
                }
                list.add(hm.size());
                s++;e++;
            }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}

/**
 * The idea is to insert first k window size array in hashmap along with the frequency
 * now in first step we will print the hashmap size ,as this will return the distinct element
 * for the first subaaray with window k
 * Now we will decrease the fequency of the first element and if it is freq is 0 then we will remove it
 * and add the next element .
 * This will keep deleting the first element and add the next element from array
 *
 *
 *
 *
 * **/
