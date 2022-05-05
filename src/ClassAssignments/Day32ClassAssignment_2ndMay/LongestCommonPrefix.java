package ClassAssignments.Day32ClassAssignment_2ndMay;

import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
 *
 * The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
 *
 * Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 *
 *
 *
 * Problem Constraints
 * 0 <= sum of length of all strings <= 1000000
 *
 *
 *
 * Input Format
 * The only argument given is an array of strings A.
 *
 *
 *
 * Output Format
 * Return the longest common prefix of all strings in A.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = ["abcdefgh", "aefghijk", "abcefgh"]
 * Input 2:
 *
 * A = ["abab", "ab", "abcd"];
 *
 *
 * Example Output
 * Output 1:
 *
 * "a"
 * Output 2:
 *
 * "ab"
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Longest common prefix of all the strings is "a".
 * Explanation 2:
 *
 * Longest common prefix of all the strings is "ab".
 *
 *
 * */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String A[]={ "abcd", "abde", "abcf"};
        String result=findLongestCommonPrefix(A);
        System.out.println(result);
    }

    private static String findLongestCommonPrefix(String [] A){

        //The idea is to check all the character of strings at all index,
        //first we find the minimum length string because we know our answer cannot be>minimum length string
        //We take the ith index character of first index string
        //compare it with the ith index of all the index string present in Array
        int minimumLength=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<A.length;i++){
            minimumLength=Math.min(minimumLength,A[i].length());
        }

        for(int i=0;i<minimumLength;i++){
            char c=A[0].charAt(i);
            //check if character is same in every string
            for(int j=1;j<A.length;j++){
                if(A[j].charAt(i)!=c){
                    return ans;
                }
            }
            ans+=c;
        }
        return ans;
    }


}
