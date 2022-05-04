package ClassAssignments.Day29ClassAssignment_25thApril;
/**
 *
 * Problem Description
 * Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.
 *
 * Return the minimum result obtained.
 *
 *
 *
 * Problem Constraints
 * 10 <= A, B, C <= 99
 *
 *
 *
 * Input Format
 * The first argument of input contains an integer, A.
 *
 * The second argument of input contains an integer, B.
 *
 * The third argument of input contains an integer, C.
 *
 *
 *
 * Output Format
 * Return an integer representing the answer.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 10
 *  B = 20
 *  C = 30
 * Input 2:
 *
 *  A = 55
 *  B = 43
 *  C = 47
 *
 *
 * Example Output
 * Output 1:
 *
 *  102030
 * Output 2:
 *
 *  434755
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  10 + 20 + 30 = 102030
 * Explanation 2:
 *
 *  43 + 47 + 55 = 434755
 *
 * */
public class ConcatenateThreeNumber {
    public static void main(String[] args) {
        int A=10;
        int B=20;
        int C=30;
        int number=concatenateNumber(A,B,C);
        System.out.println(number);
    }

    private static int concatenateNumber(int A,int B,int C){
        int min=Math.min(A,B );
        int min2=Math.min(min,C);

        int  max1=Math.max(A,B);
        int max2=Math.max(max1,C);

        int mid=0;
        if(min2!=A && max2!=A){
            mid=A;
        }
        else if(min2!=B && max2!=B){
            mid=B;
        }
        else if(min2!=C && max2!=C){
            mid=C;
        }

        if(mid==0){
            if(A==B){
                mid=A;
            }else if(B==C){
                mid=B;
            }else if(A==C){
                mid=C;
            }
        }

        String result=min2+""+mid+""+max2;
        return Integer.parseInt(result);
    }
}
