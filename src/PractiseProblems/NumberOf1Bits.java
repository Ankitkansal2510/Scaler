package PractiseProblems;
/**
 * Problem Description
 *
 *
 *
 * Write a function that takes an integer and returns the number of 1 bits it has.
 *
 *
 * Problem Constraints
 * 1 <= A <= 109
 *
 *
 * Input Format
 * First and only argument contains integer A
 *
 *
 * Output Format
 * Return an integer as the answer
 *
 *
 * Example Input
 * Input1:
 *     11
 *
 *
 * Example Output
 * Output1:
 * 3
 *
 *
 * Example Explanation
 * Explaination1:
 * 11 is represented as 1101 in binary
 *
 * */
public class NumberOf1Bits {
    public static void main(String[] args) {
        long A=11;
        int result=numSetBits(A);
        System.out.println(result);
    }
    private static int numSetBits(Long A){

        int count=0;
        while(A>0){
            if((A&1)==1){
                count++;
            }
           A= A>>1;
        }
        return count;
    }
}
