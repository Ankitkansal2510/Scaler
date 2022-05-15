package ClassAssignments.Day33ClassAssingment_4thMay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * Given an array A of N integers.
 *
 * Find the largest continuous sequence in a array which sums to zero.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 106
 *
 * -107 <= A[i] <= 107
 *
 *
 *
 * Input Format
 * Single argument which is an integer array A.
 *
 *
 *
 * Output Format
 * Return an array denoting the longest continuous sequence with total sum of zero.
 *
 * NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.
 *
 *
 *
 * Example Input
 * A = [1,2,-2,4,-4]
 *
 *
 * Example Output
 * [2,-2,4,-4]
 *
 *
 * Example Explanation
 * [2,-2,4,-4] is the longest sequence with total sum of zero.
 * **/
public class LargestContinousSubsequenceSumZero {
    public static void main(String[] args) {
         int A[]={1,2,-2,4,-4};
         int result[]=findLongSubsequence(A);
        System.out.println(Arrays.toString(result));

        List<Integer> result1=findLongestBetterApproach(A);
        System.out.println(result1);
    }

    private static int[] findLongSubsequence(int A[]){
        int start=0;
        int end=0;
        int longestLength=Integer.MIN_VALUE;
        boolean flag=false;
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=i;j<A.length;j++){
                sum+=A[j];

                if(sum==0){
                    flag=true;
                    int length=j-i+1;
                  if(length>longestLength){
                      start=i;
                      end=j;
                  }
                  longestLength=Math.max(length,longestLength);
                }
            }
        }
        int length=end-start;
        int result[]=new int[length+1];
        int index=0;
        if(start!=end || flag) {
            for (int i = start; i <= end; i++) {
                result[index] = A[i];
                index++;
            }
            return result;
        }
       return new int[]{};
    }

    private static List<Integer> findLongestBetterApproach(int[] A){
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        if(A.length<1){
            return list;
        }
        int length=0;
        int sum=0;
        int start=-1;
        int end=-1;
        hm.put(0,-1);
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }else{
                if(i-hm.get(sum)>length){
                    start=hm.get(sum)+1;
                    end=i;
                    length=i-hm.get(sum);
                }
            }
        }
        if(start>=0 && end>=0){
            for(int i=start;i<=end;i++){
                list.add(A[i]);
            }
        }
        return list;
    }
}
