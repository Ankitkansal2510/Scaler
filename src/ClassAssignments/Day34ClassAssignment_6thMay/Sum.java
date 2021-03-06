package ClassAssignments.Day34ClassAssignment_6thMay;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based.
 * Put both these numbers in order in an array and return the array from your function
 * ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.
 *
 * If multiple solutions exist, output the one where index2 is minimum.
 * If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.
 *
 * Input: [2, 7, 11, 15], target=9
 * Output: index1 = 1, index2 = 2
 *
 * **/
public class Sum {
    public static void main(String[] args) {
        int A[]={ 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
        int target=-3;
        int result[]=findIndexes(A,target);
        System.out.println(Arrays.toString(result));
    }



    private static int[] findIndexes(int A[],int B){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            int k=B-A[i];
            if(!hm.containsKey(k)){
                hm.put(A[i],i);
            }
            else{
               return new int[]{hm.get(k),i};
            }
        }

        return new int[0];
    }
}
