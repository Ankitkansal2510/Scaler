package ClassAssignments.Day32ClassAssignment_2ndMay;
/**
 * Problem Description
 *
 * Given a string A, you are asked to reverse the string and return the reversed string.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= |A| <= 105
 *
 * String A consist only of lowercase characters.
 *
 *
 *
 * Input Format
 *
 * First and only argument is a string A.
 *
 *
 *
 * Output Format
 *
 * Return a string denoting the reversed string.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = "scaler"
 * Input 2:
 *
 *  A = "academy"
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  "relacs"
 * Output 2:
 *
 *  "ymedaca"
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  Reverse the given string.
 *
 *
 * **/
public class SimpleReverse {
    public static void main(String[] args) {
        String s="Scaler";
        String result=reverseString(s);
        System.out.println(result);
    }

    private static String reverseString(String s){
        StringBuilder s1=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}
