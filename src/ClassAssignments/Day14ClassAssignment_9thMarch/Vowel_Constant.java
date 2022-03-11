package ClassAssignments.Day14ClassAssignment_9thMarch;

import java.util.Arrays;

/**
 *
 * Problem Description
 * You are given lowercase string (A) and you have to tell count of vowels and consonants in it.
 *
 *
 *
 * Problem Constraints
 * 1 <= S.size() <= 1000
 *
 *
 *
 * Input Format
 * First and only argument containing a lowercase string S.
 *
 *
 *
 * Output Format
 * You have to return an array of two elements representing count of vowels and consonants in input string respectively.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * interviewbit
 * Input 2:
 *
 * scaler
 *
 *
 * Example Output
 * Output 1:
 *
 * [5 7]
 * Output 2:
 *
 * [2 4]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Clearly, interviewbit has 4 vowels and 7 consonants.
 * Explanation 2:
 *
 * Clearly, scaler has 2 vowels and 4 consonants.
 *
 *
 * **/
public class Vowel_Constant {
    public static void main(String[] args) {
        String A = "yjbkogxfgzlajycctiatwflqgpojdjebtfohlloumzuwzyashanfibvoqlxt";
        int arr[] = new int[2];
        int vowel=0;
        int constant=0;
        for (int i = 0; i < A.length();i++){
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i'
                    || A.charAt(i)=='o' || A.charAt(i)=='u'){
                vowel++;
            }
            else{
                constant++;
            }
        }
        arr[0]=vowel;
        arr[1]=constant;
        System.out.println(Arrays.toString(arr));
    }
}
