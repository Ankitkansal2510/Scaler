package ClassAssignments.Day34ClassAssignment_6thMay;

import java.util.HashMap;

/**
 *
 * Given an array A of integers and another non negative integer k,
 * find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.
 *
 * Example :
 *
 * Input :
 *
 * A : [1 5 3]
 * k : 2
 * Output :
 *
 * 1
 * as 3 - 1 = 2
 *
 * */
public class Diff2 {

    public static void main(String[] args) {
        int A[]={1, 5, 4, 1, 2};
        int k=0;
        int result=findDiff(A,k);
        System.out.println(result);
    }

    private static int findDiff(int A[],int B){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i],hm.get(A[i])+1);
            }else{
                hm.put(A[i],1);
            }
        }
        for(int i=0;i<A.length;i++){
           int a=A[i];
           //a-b=k/ /here k is denoted by B
            //a-k=b
            int b=a-B;
            if(a==b){
                if(hm.get(a)>1){
                    return 1;
                }
            }else{
                if(hm.containsKey(b)){
                    return 1;
                }
            }
        }
      return 0;
    }
}
