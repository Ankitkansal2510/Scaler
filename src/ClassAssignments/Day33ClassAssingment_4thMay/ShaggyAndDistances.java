package ClassAssignments.Day33ClassAssingment_4thMay;

import java.util.HashMap;

public class ShaggyAndDistances {
    public static void main(String[] args) {
        int A[]={7, 1, 3, 4, 1, 7};
        int result=minimumDistnaceWithSamePair(A);
        System.out.println(result);
    }

    private static int minimumDistnaceWithSamePair(int A[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int len=0;
        int result=Integer.MAX_VALUE;
        boolean flag=false;
        for(int i=0;i<A.length;i++){
            if(!hm.containsKey(A[i])){
                hm.put(A[i],i);
            }else{
                flag=true;
                len=i-hm.get(A[i]);
                result= Math.min(len,result);
            }
        }
        if(flag) {
            return result;
        }
        return -1;
    }
}
