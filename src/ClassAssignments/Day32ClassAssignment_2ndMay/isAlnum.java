package ClassAssignments.Day32ClassAssignment_2ndMay;
/**
 * You are given a function isalpha() consisting of a character array A.
 *
 * Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 *
 *
 * Input Format
 * Only argument is a character array A.
 *
 *
 *
 * Output Format
 * Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
 * Input 2:
 *
 *  A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
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
 *  All the characters are alphanumeric.
 * Explanation 2:
 *
 *  All the characters are NOT alphabets i.e ('#').
 *
 * */
public class isAlnum {
    public static void main(String[] args) {
        char A[]={'S', '?', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        //char A[]={'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        int result=isAlphaNumeric(A);
        System.out.println(result);
    }
    private static int isAlphaNumeric(char A[]){
        int character=0;
        int numberic=0;
        int extraCharacter=0;
        for(int i=0;i<A.length;i++){
            if((A[i]>=65 && A[i]<=90) || (A[i]>=97 && A[i]<=122)){
                character++;
            }
           else if(A[i]>=48 && A[i]<=57){
                numberic++;
            }else{
               extraCharacter++;
            }
        }
        if(extraCharacter>0){
            return 0;
        }else{
            return 1;
        }
    }
}
