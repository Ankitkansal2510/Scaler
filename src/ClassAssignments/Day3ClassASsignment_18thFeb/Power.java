package ClassAssignments.Day3ClassASsignment_18thFeb;

/***
 *
 * You are given two integers A and B. You have to find the value of A power B.
 *
 * NOTE: The value of answer is always less than or equal to 109.
 */

import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter first number");
        int A=s.nextInt();
        System.out.println("please enter second number");
        int B=s.nextInt();
        int sum=1;
        for(int i=1;i<=B;i++){
            sum*=A;
        }
        System.out.println(sum);
    }
}
