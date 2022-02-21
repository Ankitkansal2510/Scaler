package ClassAssignments.Day3ClassASsignment_18thFeb;

import java.util.Scanner;
/**
 *
 * Write a function that takes a positive number A as an argument and returns the sum of all numbers from 1 to
 * A.*/
public class SumOfAllnaturalNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number");
        int a=s.nextInt();
        int sum=a*(a+1)/2;
        System.out.println(sum);
    }
}
