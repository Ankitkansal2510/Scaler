package ClassAssignments.Day36ClassAssignment_9thMay;
/***
 *
 * Write a program to find the factorial of the given number A.
 *
 *
 *
 * Problem Constraints
 * 0 <= A <= 12
 *
 *
 *
 * Input Format
 * First and only argument is an integer A.
 *
 *
 *
 * Output Format
 * Return an integer denoting the factorial of the number A.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 4
 * Input 2:
 *
 *  A = 1
 *
 *
 * Example Output
 * Output 1:
 *
 *  24
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Factorial of 4 = 4 * 3 * 2 * 1 = 24
 * Explanation 2:
 *
 *  Factorial of 1 = 1
 * */
public class FindFactorial {

    public static void main(String[] args) {
        int A=4;
        int result=findFactorial(A);
        System.out.println(result);
    }

    private static int findFactorial(int A){
        //Assumption find the factorial of a given number

        if(A==1){
            return 1;
        }

        //main logic

        return findFactorial(A-1)*A;
    }
}

