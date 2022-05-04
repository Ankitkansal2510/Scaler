package ClassAssignments.Day29ClassAssignment_25thApril;
/***
 *
 * Problem Description
 * You are given two non-negative integers, A and B. Find the value of the Least Common Multiple (LCM) of A and B.
 *
 * LCM of two integers is the smallest positive integer divisible by both.
 *
 *
 *
 * Problem Constraints
 * 1 <= A, B <= 1000
 *
 *
 *
 * Input Format
 * The first argument is an integer A.
 *
 * The second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return an integer.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 2
 *  B = 3
 * Input 2:
 *
 *  A = 9
 *  B = 6
 * Input 3:
 *
 *  A = 2
 *  B = 6
 *
 *
 * Example Output
 * Output 1:
 *
 *  6
 * Input 2:
 *
 *  18
 * Input 3:
 *
 *  6
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 3 (3 * 2 = 6).
 * Explanation 2:
 *
 *  18 is the smallest positive integer which is divisible by both 9 (9 * 2 = 18) and 6 (6 * 3 = 18).
 * Explanation 3:
 *
 *  6 is the smallest positive integer which is divisible by both 2 (2 * 3 = 6) and 6 (6 * 1 = 6).
 *
 * */
public class LCM {
    public static void main(String[] args) {
        int A=2;
        int B=3;
        int result=LCM(A,B);
        System.out.println(result);
    }

    private static int LCM(int A,int B){
        //LCM=a*b/GCD(a,b)
        int gcdNumber=GCD(A,B);
        int lcm=(A*B)/gcdNumber;
        return lcm;
    }

    private static int GCD(int A,int B){
        if(A==0)return B;
        if(B==0)return A;
        if(A==B)return A;

        if(A>B){
            return GCD(A-B,B);
        }
        else{
            return GCD(A,B-A);
        }
    }
}
