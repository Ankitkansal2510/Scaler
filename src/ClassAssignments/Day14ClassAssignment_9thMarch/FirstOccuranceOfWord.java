package ClassAssignments.Day14ClassAssignment_9thMarch;

/**
 * Problem Description
 * <p>
 * You are given two character strings A and B.
 * <p>
 * You have to find the first occurrence of string B in string A, as a substring, and return the starting position of first occurrence.
 * <p>
 * A substring is a contiguous sequence of characters within a string. For e.g "at" is a substring in "catalogue".
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= |A|, |B| <= 1000
 * <p>
 * A[i], B[i] ∈ ['a'-'z']
 * <p>
 * <p>
 * <p>
 * Input Format
 * <p>
 * First argument is a character string A.
 * <p>
 * Second argument is a character string B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return an integer denoting the starting position of first occurrence, or return -1 to report that there is no such occurrence.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = "aabababaa"
 * B = "ba"
 * Input 2:
 * <p>
 * A = "abc"
 * B = "ac"
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 3
 * Output 2:
 * <p>
 * -1
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * Substrings A[3..4], A[5..6] and A[6..7] are equal to B = "ba".
 * First occurrence is substring A[3..4] having starting position = 3.
 * Explanation 2:
 * <p>
 * "ac" does not exist as a substring in "abc".
 */
public class FirstOccuranceOfWord {
    public static void main(String[] args) {
        String A = "knpzitssxg";
        String B = "sxg";
        int j = 0;
        int l = 0;
        int result = 0;
        int i = 0;
        for (i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(0)) {
                result=i;
                j = i;
                for (int k = 0; k < B.length(); k++) {
                    if (A.charAt(j) == B.charAt(k)) {
                        l++;
                        j++;
                    }
                }
                if (l == B.length()) {
                    System.out.println(++result);
                    break;
                } else {
                    l=0;
                }
            }
        }
        if (i == A.length()) {
            System.out.println("-1");
        }
    }
}
