package ClassAssignments.Day14ClassAssignment_9thMarch;
/***
 *
 * Problem Description
 * You have a string (A) and you have to return 1 if it is palindrome otherwise return 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= A.size() <= 1000
 *
 *
 *
 * Input Format
 * First argument containing a lowercase string A.
 *
 *
 *
 * Output Format
 * You have to return either 0 or 1 as per the question.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * abcba
 * Input 2:
 *
 * axax
 * Input 3:
 *
 * abba
 *
 *
 * Example Output
 * Output 1:
 *
 * 1
 * Output 2:
 *
 * 0
 * Output 3:
 *
 * 1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Clearly, all characters of abcba from backward is similar with characters from forward.
 * Explanation 2:
 *
 * Clearly, all characters of axax from backward is not similar with characters from forward.
 * Explanation 3:
 *
 * Clearly, all characters of abba from backward is similar with characters from forward.
 *
 */

public class IsPalindrome {
    public static void main(String[] args) {
        String s="abba";
        int j=s.length()-1;
        int i=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("Not palindrom");
                break;
            }
            j--;
        }
        if(i==s.length()){
            System.out.println("palindrom");
        }
    }
}
