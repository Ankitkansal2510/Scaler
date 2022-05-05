package ClassAssignments.Day32ClassAssignment_2ndMay;
/**
 * Given a string A of size N, find and return the longest palindromic substring in A.
 *
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 *
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 *
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 10000
 *
 *
 *
 * Input Format
 * First and only argument is a string A.
 *
 *
 *
 * Output Format
 * Return a string denoting the longest palindromic substring of string A.
 *
 *
 *
 * Example Input
 * A = "aaaabaaa"
 *
 *
 * Example Output
 * "aaabaaa"
 *
 *
 * Example Explanation
 * We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
 *
 *
 * */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s="abb";
        String result=longestPalindromicSubstring(s);
        System.out.println(result);
    }

    private static String longestPalindromicSubstring(String s){
        int startIndex=0;
        int lastIndex=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            int len=expand(s,i,i);
            if (len > ans) {
                startIndex = i - len/2 ;
                lastIndex = startIndex + len;
            }
            ans=Math.max(ans,len);

        }

        for(int i=0;i<s.length()-1;i++){
            int len=expand(s,i,i+1);
            if (len > ans) {
                startIndex = i - len/2 +1;
                lastIndex = startIndex + len;
            }
            ans=Math.max(ans,len);
        }
        return s.substring(startIndex, lastIndex);
    }

    private static int expand(String s,int i,int j){

        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }

        return j-i-1;
    }
}
