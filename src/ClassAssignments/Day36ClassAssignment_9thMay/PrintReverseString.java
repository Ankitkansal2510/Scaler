package ClassAssignments.Day36ClassAssignment_9thMay;
/**
 *
 * Write a recursive function that, given a string S, prints the characters of S in reverse order.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= |s| <= 1000
 *
 *
 *
 * Input Format
 *
 * First line of input contains a string S.
 *
 *
 *
 * Output Format
 *
 * Print the character of the string S in reverse order.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  scaleracademy
 * Input 2:
 *
 *  cool
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  ymedacarelacs
 * Output 2:
 *
 *  looc
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  Print the reverse of the string in a single line.*/
public class PrintReverseString {

    public static void main(String[] args) {
        String A="scaleracademy";
        printReverse(A,A.length()-1);
    }

    private static void printReverse(String A,int end){
        //Assumption print string in rverse

        //base case

        if(end<0){
           return;
        }
        //main logic


        System.out.print(A.charAt(end));
        end--;
         printReverse(A,end);

    }
}
