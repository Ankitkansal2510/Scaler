package ClassAssignments.Day33ClassAssingment_4thMay;

import java.awt.image.ImageProducer;
import java.util.HashMap;

/**
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
 *
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *
 * -10^9 <= A[i] <= 10^9
 *
 *
 *
 * Input Format
 * The only argument given is the integer array A.
 *
 *
 *
 * Output Format
 * Return whether the given array contains a subarray with a sum equal to 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4, 5]
 * Input 2:
 *
 *  A = [-1, 1]
 *
 *
 * Example Output
 * Output 1:
 *
 *  0
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  No subarray has sum 0.
 * Explanation 2:
 *
 *  The array has sum 0.
 *
 * **/
public class SubArrayWithSumZero {
    public static void main(String[] args) {
        int A[]={1,-1};
        int result=sumZeroBetter(A);
        System.out.println(result);
    }

    private static int sumZero(int A[]){
        for(int s=0;s<A.length;s++){
            int sum=0;
            for(int e=s;e<A.length;e++){
                sum+=A[e];
                if(sum==0){
                    return 1;
                }
            }
        }
        return 0;
    }

    private static int sumZeroBetter(int A[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int pref=0;
        hm.put(0,0);
        for(int i=0;i<A.length;i++){
        pref+=A[i];
        if(hm.containsKey(pref)){
            return 1;
        }else{
            hm.put(pref,i);
        }
        }
        return 0;
    }
}
/**
 *
 * Idea is to caluclate pref and then check in map if the pref is 0 or pref is alread y available
 *
 * i/p
 * 4,2,-3,1,3
 *
 *
 * pref=0;
 * map.put(o,0)
 *
 * pref              map
 * 0+4               {4}
 * 4+2=6             {4,6}
 * 6+(-3) =3         {4,6,3}
 * 3+1=4             since 4 is alreddy available , it means ,we have seen 4 is already preasent and the extra
 *                   value which are adding after 4 becomes 0 that is why we returned 4 , hence there is a subarray exist with xum=0;
 *                   
 * */
