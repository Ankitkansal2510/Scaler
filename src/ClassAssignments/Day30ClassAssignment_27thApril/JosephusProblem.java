package ClassAssignments.Day30ClassAssignment_27thApril;

import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
            int N = 3;
            int result = findWinner(N);
            System.out.println(result);
    }

    private static int findWinner(int N){
        int y=nearestPowerOfTwo(N);
        int kills=N-y;
        return 1+(2*kills);
    }

    private static int nearestPowerOfTwo(int N){
        int result=1;
        for(int i=1;i<=N;i++){
            if(result*2>N){
                break;
            }else{
                result=result*2;
            }
        }
        return result;
    }


}
