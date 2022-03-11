package ClassAssignments.Day14ClassAssignment_9thMarch;
/***
 * Problem Description
 *
 * You are given a character string A. You to trim(remove) both leading and trailing asterisk characters('*') in the string and return the resultant string.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= |A| <= 105
 *
 * A[i] ∈ ['a'-'z', '*']
 *
 *
 *
 * Input Format
 *
 * First and only argument is a character string A.
 *
 *
 *
 * Output Format
 *
 * Return a character string denoting the resultant string after trimming.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * A = "**h*e*l*lo*"
 * Input 2:
 *
 * A = "noasteriskhere"
 *
 *
 * Example Output
 *
 * Output 1:
 *
 * h*e*l*l*o
 * Output 2:
 *
 * noasteriskhere
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  The string has 2 leading '*' and 1 trailing '*'. Removing them, the string becomes "hello".
 * Explanation 2:
 *
 *  As there are no leading or trailing zeros, resultant string is same as before.
 *
 *
 * */
public class TrimString {
    public static void main(String[] args) {
        String s="**h*e*l*lo*";
        int j=0;
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && j==0){
                continue;
            }else{
                j++;
                stringBuilder.append(s.charAt(i));
            }
        }
        j=0;
        StringBuilder s1=new StringBuilder();
        for(int i=stringBuilder.length()-1;i>=0;i--){
            if(stringBuilder.charAt(i)=='*' && j==0){
                continue;
            }else{
                j++;
                s1.append(stringBuilder.charAt(i));
            }
        }
        System.out.println(s1.reverse().toString());
    }
}

