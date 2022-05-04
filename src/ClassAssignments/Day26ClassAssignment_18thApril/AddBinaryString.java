package ClassAssignments.Day26ClassAssignment_18thApril;
/**
 * Given two binary strings, return their sum (also a binary string).
 * Example:
 *
 * a = "100"
 *
 * b = "11"
 * Return a + b = "111".
 * */
public class AddBinaryString {
    public static void main(String[] args) {
        String A="10001100010111000101100010100110001001101010000010011010";
        String B="101111000100100100111110010010101110101001100100101001111010011000000110";
        String result=addBinaryString(A,B);
        System.out.println(result);
    }
    private static String addBinaryString(String A,String B){
        long a=0;
        long b=0;
        long sum=0;
        long pow=0;
        for(long i=A.length()-1;i>=0;i--){
            long c=Integer.parseInt(String.valueOf(A.charAt((int) i)));
            a+= (long) (c*Math.pow(2,pow));
            pow++;
        }
        pow=0;
        for(long i=B.length()-1;i>=0;i--){
            int c=Integer.parseInt(String.valueOf(B.charAt((int) i)));
            b+= (long) (c*Math.pow(2,pow));
            pow++;
        }
        sum=a+b;
        long mod=0;
        StringBuilder s=new StringBuilder();
        while(sum>0){
            mod=sum%2;
            sum=sum/2;
            s.append(mod);
        }
        return s.reverse().toString();
    }
}
//Need to solve this