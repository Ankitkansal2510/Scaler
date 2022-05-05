package ClassAssignments.Day32ClassAssignment_2ndMay;
/**
 * You are given a string S, and you have to find all the amazing substrings of S.
 *
 * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 *
 * Input
 *
 * Only argument given is string S.
 * Output
 *
 * Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
 * Constraints
 *
 * 1 <= length(S) <= 1e6
 * S can have special characters
 * Example
 *
 * Input
 *     ABEC
 *
 * Output
 *     6
 *
 * Explanation
 *     Amazing substrings of given string are :
 *     1. A
 *     2. AB
 *     3. ABE
 *     4. ABEC
 *     5. E
 *     6. EC
 *     here number of substrings are 6 and 6 % 10003 = 6.
 *
 *
 * */
public class AmazingSubArray {
    public static void main(String[] args) {
        String s="ABEC";
        int result=findNumberOfSubStringStartWithVowel(s);
        System.out.println(result);

        int result1=solveBetter(s);
        System.out.println(result1);
    }
    private static int findNumberOfSubStringStartWithVowel(String s){
        int ans=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ||
                    s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    for(int j=i;j<s.length();j++){
                        ans++;
                    }
            }
        }
        return ans%10003;
    }
    private static int solveBetter(String A){
        int count=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u'||
                    A.charAt(i)=='A' || A.charAt(i)=='E' || A.charAt(i)=='I' || A.charAt(i)=='O' || A.charAt(i)=='U'){
                count=count+A.length()-i;
//The idea is to calulcate the length of the substring starting from index where we find the vowel till end
                //and add to the answer
            }
        }
        return count%10003;//in the question asked to return ans%10003
    }
}
