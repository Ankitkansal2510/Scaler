package ClassAssignments.Day17ClassAssignment_21stMarch;

import java.util.Scanner;

/***
 * Problem Description
 *
 * Write a program to find sum all Natural numbers from 1 to N where you have to take N as
 * input from user
 *
 *
 * */
public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number you want to find sum all natural number from 1 to number n");
        int number=sc.nextInt();
        int sum=0;
        sum=number*(number+1)/2;
        System.out.println("The sum of all natural number from 1 to number " + number + " is : " + sum);
    }
}
