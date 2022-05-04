package codeChief;

import java.util.Scanner;

/***
 * Lunchtime Problem Code: LTIME
 *
 * Submit
 * Chef has his lunch only between 1 pm and 4 pm (both inclusive).
 *
 * Given that the current time is X pm, find out whether it is lunchtime for Chef.
 *
 * Input Format
 * The first line of input will contain a single integer T, the number of test cases. Then the test cases follow.
 * Each test case contains a single line of input, containing one integer X.
 * Output Format
 * For each test case, print in a single line YES if it is lunchtime for Chef. Otherwise, print NO.
 *
 * You may print each character of the string in either uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).
 *
 * Constraints
 * 1≤T≤12
 * 1≤X≤12
 * Sample Input 1
 * 3
 * 1
 * 7
 * 3
 * Sample Output 1
 * YES
 * NO
 * YES
 * Explanation
 * Test case 1: Lunchtime is between 1 pm and 4 pm (both inclusive). Since 1 pm lies within lunchtime, the answer is YES.
 *
 * Test case 2: Lunchtime is between 1 pm and 4 pm (both inclusive). Since 7 pm lies outside lunchtime, the answer is NO.
 *
 * Test case 3: Lunchtime is between 1 pm and 4 pm (both inclusive). Since 3 pm lies within lunchtime, the answer is YES.
 *
 * **/
public class LunchTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of test case");
        int T = sc.nextInt();
        lunchTime(T, sc);
    }

    private static void lunchTime(int T, Scanner sc) {
        if (T <= 0) {
            throw new RuntimeException("Please enter a valid number of test case");
        }

        for(int i=0;i<T;i++){
            System.out.println("Please enter a time to check if it is lunch time or not");
            int time=sc.nextInt();

            if (time >= 1 && time <= 4) {
                System.out.println("Yes");
            } else
                System.out.println("NO");
        }
    }
}