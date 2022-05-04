package ClassAssignments.Day26ClassAssignment_18thApril;
/**
 * Reverse the bits of an 32 bit unsigned integer A.
 *
 *
 *
 * Problem Constraints
 * 0 <= A <= 232
 *
 *
 *
 * Input Format
 * First and only argument of input contains an integer A.
 *
 *
 *
 * Output Format
 * Return a single unsigned integer denoting the decimal value of reversed bits.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  0
 * Input 2:
 *
 *  3
 *
 *
 * Example Output
 * Output 1:
 *
 *  0
 * Output 2:
 *
 *  3221225472
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *         00000000000000000000000000000000
 *
 * =>      00000000000000000000000000000000
 * Explanation 2:
 *
 *         00000000000000000000000000000011
 * =>      11000000000000000000000000000000
 * **/
public class reverseBit {
    public static void main(String[] args) {
        long A=3;
        long result=reverseBit(A);
        System.out.println(result);
        long result1=reverseBitOptimisied(A);
        System.out.println(result1);
    }
    private static long reverseBit(long A){
        long result=0;
        for(int i=0;i<32;i++){
            long lsb=A&1;
            long reverseLSB=lsb<<(31-i);
            result=result|reverseLSB;
            A=A>>1;
        }
        return  result;
    }

    private static long reverseBitOptimisied(long A){

        long rev = 0;

        for(int i=0;i<32;i++){
            rev=rev<<1;
            if((A&(1<<i))!=0){
                rev=rev|1;
            }
        }
        return rev;
    }
}
