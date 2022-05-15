package ClassAssignments.Day33ClassAssingment_4thMay;

import java.util.HashMap;
import java.util.HashSet;

/***
 * Given a string A consisting of lowercase characters.
 *
 * Check if characters of the given string can be rearranged to form a palindrome.
 *
 * Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 * A consists only of lower-case characters.
 *
 *
 *
 * Input Format
 * First argument is an string A.
 *
 *
 *
 * Output Format
 * Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = "abcde"
 * Input 2:
 *
 *  A = "abbaee"
 *
 *
 * Example Output
 * Output 1:
 *
 *  0
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  No possible rearrangement to make the string palindrome.
 * Explanation 2:
 *
 *  Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
 * */
public class CheckPalindrom {
    public static void main(String[] args) {
       // String A="vnpypznzpfxyivpppxfpp";
        String A="yzfbzbyyrurquqf";
        int result=solve(A);

        int result1=reaarangeToMakePalindrom(A);
        System.out.println(result);
        System.out.println(result1);
        /**
         *
         * The idea is to check freq
         *
         * if length of the string is even
         *
         * 1. Length of string is EVEN, then occurrence of every character should be even ONLY
         * 2. Length of string is ODD, then occurrence of every character
         * should be even and only one character have frequency should be odd.
        * **/
    }
    public static int solve(String A) {
        int[] freq = new int[26];
        for (int i = 0; i < A.length(); i++)
            freq[A.charAt(i) - 97]++;
        int odd = 0;
        for (int a: freq)
            if (a % 2 == 1)
                odd++;
        if (odd > 1)
            return 0;
        return 1;
    }
    private static int reaarangeToMakePalindrom(String A){

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length();i++){
            if(hm.containsKey(A.charAt(i))){
                hm.put(A.charAt(i),hm.get(A.charAt(i))+1);
            }else{
            hm.put(A.charAt(i),1);}
        }
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<A.length();i++){
            set.add(A.charAt(i));
        }
        int countEven=0;
        int coundOdd=0;
        if(A.length()%2==0) {
            for (char c:set) {
                int freq =hm.get(c);
                if(freq%2!=0){
                    return 0;
                }
            }
        }
        else{
            for (char c:set) {
                int freq = hm.get(c);
                if(freq%2==0){
                    countEven+=1;
                }else{
                    coundOdd+=1;
                }
            }


            if(countEven!=(set.size()-1) && coundOdd!=1){
                return 0;
            }
        }
       return 1;
    }
}
