package ClassAssignments.Day34ClassAssignment_6thMay;

import java.util.HashMap;

/**
 * Given an integer array A containing N distinct integers.
 *
 * Find the number of unique pairs of integers in the array whose XOR is equal to B.
 *
 * NOTE:
 *
 * Pair (a, b) and (b, a) is considered to be the same and should be counted once.
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 *
 * 1 <= A[i], B <= 107
 *
 *
 *
 * Input Format
 * The first argument is an integer array A.
 *
 * The second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [5, 4, 10, 15, 7, 6]
 *  B = 5
 * Input 2:
 *
 *  A = [3, 6, 8, 10, 15, 50]
 *  B = 5
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  (10 ^ 15) = 5
 * Explanation 2:
 *
 *  (3 ^ 6) = 5 and (10 ^ 15) = 5
 *
 * **/
public class PairsWithGivenXor {

    public static void main(String[] args) {
        int A[]={5, 4, 10, 15, 7, 6};
        int B=5;
        int result=xorPair(A,B);
        System.out.println(result);

        int result1=xorPairHM(A,B);
        System.out.println(result1);
    }
private static int xorPairHM(int A[],int B){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            int xorREsult=A[i]^B;
            if(hm.containsKey(xorREsult)){
                ans++;
            }else{
                hm.put(A[i],i);
            }
        }
        return ans;
}
    private static int xorPair(int A[],int B){
        int ans=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if((A[i]^A[j])==B){
                    ans++;
                }
            }
        }
        return ans;
    }
}
