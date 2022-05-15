package ClassAssignments.Day33ClassAssingment_4thMay;

import java.util.*;

/**
 * Given a number A, find if it is COLORFUL number or not.
 *
 * If number A is a COLORFUL number return 1 else, return 0.
 *
 * What is a COLORFUL Number:
 *
 * A number can be broken into different contiguous sub-subsequence parts.
 * Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
 * And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.
 *
 *
 * Problem Constraints
 * 1 <= A <= 2 * 109
 *
 *
 *
 * Input Format
 * The first and only argument is an integer A.
 *
 *
 *
 * Output Format
 * Return 1 if integer A is COLORFUL else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 23
 * Input 2:
 *
 *  A = 236
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Possible Sub-sequences: [2, 3, 23] where
 *  2 -> 2
 *  3 -> 3
 *  23 -> 6  (product of digits)
 *  This number is a COLORFUL number since product of every digit of a sub-sequence are different.
 * Explanation 2:
 *
 *  Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
 *  2 -> 2
 *  3 -> 3
 *  6 -> 6
 *  23 -> 6  (product of digits)
 *  36 -> 18  (product of digits)
 *  236 -> 36  (product of digits)
 *  This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same.
 *
 * */
public class ColorfulNumber {
    public static void main(String[] args) {

        int A = 236;
        int result = isColourful(A);//using String based approach
        System.out.println(result);
        int result2=checkColourful(A);//using integer based appraoch only
        System.out.println(result2);
    }

    private static int checkColourful(int A){
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        while(A!=0){
            int rem=A%10;
            list.add(rem);
            A=A/10;
        }
/**
 * In this approach we first storing each digit in arraylst then we will reverse(To make same sequence)
 * then we are checking product at each iteration , and if that is available in set we are return 0 otherwise we will
 * keep adding it in set ,if there is no product found then returning 1
 *
 *
 * */
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            int product=1;
            for(int j=i;j<list.size();j++){
                product*=list.get(j);
                if(set.contains(product)){
                    return 0;
                }else{
                    set.add(product);
                }
            }
        }
        return 1;
    }
    private static int isColourful(int A){
        /**
         *
         * In this approach we are converting integer to string , then iterating it
         * and again taking each character of the string and converting back it to number
         * and then finding the each product and and checking if it is in hashset if not then it is
         * colourful if it is available then it is not colourful
         * */
        HashSet<Integer> check = new HashSet<Integer>();
        String str = Integer.toString(A);
        for(int i=0;i<str.length();i++){
            int product = 1;
            for(int j=i; j<str.length();j++){
                int num = str.charAt(j) - '0';
                product *= num;
                if(check.contains(product)) return 0;
                check.add(product);
            }
        }
        return 1;
    }
}
