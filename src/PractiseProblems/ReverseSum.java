package PractiseProblems;

import java.util.Scanner;

/**
 *Reverse Sum
 * Given an integer, find the sum of the number and its reverse.
 * Example Input:
 * N = 536
 * Example Output:
 * 1171
 * Explanation:
 * 536 + 635 = 1171
 *
 * **/
public class ReverseSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int firstNumber=number;
        int reverseNumber=0;
        while(firstNumber!=0){
            int rem=firstNumber%10;
            reverseNumber=reverseNumber*10+rem;
            firstNumber=firstNumber/10;
        }
        System.out.println("Sum of Reverse number " + reverseNumber + " Actual number " + number + " = " + (number+reverseNumber));




    }
}
