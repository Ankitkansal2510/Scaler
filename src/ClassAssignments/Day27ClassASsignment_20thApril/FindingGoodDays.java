package ClassAssignments.Day27ClassASsignment_20thApril;
/**
 *
 * Problem Description
 * Alex has a cat named Boomer. He decides to put his cat to the test for eternity.
 *
 * He starts on day 1 with a stash of food unit, every next day, the stash doubles.
 *
 * If Boomer is well behaved during a particular day, she receives food worth equal to the stash on that day.
 *
 * Boomer receives a net worth of A units of food. What is the number of days he was well behaved?
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 231-1
 *
 *
 *
 * Input Format
 * First and only argument is an integer A.
 *
 *
 *
 * Output Format
 * Return an integer denoting the number of days Boomer was well behaved.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = 5
 * Input 2:
 *
 * A = 8
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  1
 *
 *
 * */
public class FindingGoodDays {
    public static void main(String... k) {


    int A = 5;
    int result = findGoddDays(A);
    System.out.println(result);
}
private static int findGoddDays(int A){
    int ans=0;
    while(A>0){
        if((A&1)>0){
            ans++;
        }
        A=A>>1;
    }
    return ans;         
        }
            }