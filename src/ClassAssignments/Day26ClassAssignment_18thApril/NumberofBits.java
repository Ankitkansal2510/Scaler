package ClassAssignments.Day26ClassAssignment_18thApril;

/**
 *
 * Problem Description
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
 * 11
 *
 *
 * Example Output
 * Output1:
 * 3
 *
 *
 * Example Explanation
 * Explaination1:
 * 11 is represented as 1011 in binary.
 *
 * **/
public class NumberofBits {
    public static void main(String[] args) {
        int A = 11;
        int result = findNumberOfOnesBits(A);
        System.out.println(result);

        int secondResult=numSetBits(A);
        System.out.println(secondResult);


        int thirdResult=numSetBitsrightShift(A);
        System.out.println(thirdResult);
    }
    private static int findNumberOfOnesBits(int A){
        StringBuilder s=new StringBuilder();
        int mod=0;
        int count=0;
        while(A>0){
            mod=A%2;
            A/=2;
            s.append(mod);
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return  count;
    }

    public static int numSetBits(int A) {
        int total_ones = 0;
        while (A != 0) {
            A = A & (A - 1);
            total_ones++;
        }
        return total_ones;
    }

    public static int numSetBitsrightShift(int A) {
        int total_ones = 0;

        while (A != 0) {
            if((A&1)==1){
            total_ones++;
        }
           A=A>>1;
        }
        return total_ones;
    }
}
