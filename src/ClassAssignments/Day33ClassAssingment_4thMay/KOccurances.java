package ClassAssignments.Day33ClassAssingment_4thMay;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].
 *
 * He wants to select some trees to replace his broken branches.
 *
 * But he wants uniformity in his selection of trees.
 *
 * So he picks only those trees whose heights have frequency K.
 *
 * He then sums up the heights that occur K times. (He adds the height only once to the sum and not K times).
 *
 * But the sum he ended up getting was huge so he prints it modulo 10^9+7.
 *
 * In case no such cluster exists, Groot becomes sad and prints -1.
 *
 * Constraints:
 *
 * 1.   1<=N<=100000
 * 2.   1<=K<=N
 * 3.   0<=H[i]<=10^9
 * Input: Integers N and K and array of size A
 *
 * Output: Sum of all numbers in the array that occur exactly K times.
 *
 * Example:
 *
 * Input:
 *
 * N=5 ,K=2 ,A=[1 2 2 3 3]
 * Output:
 *
 * 5
 * Explanation:
 *
 * There are 3 distinct numbers in the array which are 1,2,3.
 * Out of these, only 2 and 3 occur twice. Therefore the answer is sum of 2 and 3 which is 5.
 *
 * */
public class KOccurances {
    public static void main(String[] args) {
        int N = 5;
        int k = 5;
        int A[] = {1,2,3,4,5};
        int result = sumKOccurance(N,k,A);
        System.out.println(result);
    }
    private static int sumKOccurance(int A,int B,int C[]){

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A;i++){
            if(hm.containsKey(C[i])){
                hm.put(C[i],hm.get(C[i])+1);
            }else{
                hm.put(C[i],1);
            }
        }
        int sum=0;
        boolean flag=false;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<A;i++){
            set.add(C[i]);
        }
        for(int num:set){
            int freq=hm.get(num);

            if(freq==B){
                sum+=num;
                flag=true;
            }
        }
        if(flag) {
            return sum;
        }
        return -1;
    }
}
