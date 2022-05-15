package ClassAssignments.Day36ClassAssignment_9thMay;
/**
 * Write a recursive function that checks whether string A is a palindrome or Not.
 * Return 1 if the string A is a palindrome, else return 0.
 *
 * Note: A palindrome is a string that's the same when read forward and backward.
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 50000
 *
 * String A consists only of lowercase letters.
 *
 *
 *
 * Input Format
 * The first and only argument is a string A.
 *
 *
 *
 * Output Format
 * Return 1 if the string A is a palindrome, else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = "naman"
 * Input 2:
 *
 *  A = "strings"
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
 *  "naman" is a palindomic string, so return 1.
 * Explanation 2:
 *
 *  "strings" is not a palindrome, so return 0.
 * */
public class checkPalindrom {
    public static void main(String[] args) {
        String A="naman";
        int result=isPalindrom(A);
        System.out.println(result);
    }

    private static int isPalindrom(String A)
    {
        int result=solve(A,0,A.length()-1);
        return result;
    }

    private static int solve(String A,int start,int end){
        //Assumption :Need to check if a given string is palindrom or not

        //base code
        if(start>=end){
            return 1;
        }

        //main logic

        if(A.charAt(start)!=A.charAt(end)){
            return 0;
        }else{
            start++;
            end--;
            return solve(A,start,end);
        }
    }
}
