package ClassAssignments.Day32ClassAssignment_2ndMay;
/**
 *
 * Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 1000
 *
 *
 * Input Format
 * The first and only argument contains the string A, consisting of lowercase English alphabets.
 *
 *
 * Output Format
 * Return an integer containing the answer.
 *
 *
 * Example Input
 * Input 1:
 *
 *   "abobc"
 * Input 2:
 *
 *   "bobob"
 *
 *
 * Example Output
 * Output 1:
 *
 *   1
 * Output 2:
 *
 *   2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *   The only occurrence is at second position.
 * Explanation 2:
 *
 *   Bob occures at first and third position.
 * */
public class CountOccurances {
    public static void main(String[] args) {
        String s="bobob";
        int result=findOccurancesOfbob(s);
        System.out.println(result);
    }

    private static int findOccurancesOfbob(String s){

        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                    if(i<s.length()-1 && s.charAt(i+1)=='o'){
                        if(i<s.length()-1 && s.charAt(i+2)=='b'){
                            ans++;
                        }
                    }
            }
        }
        return ans;
    }
}
