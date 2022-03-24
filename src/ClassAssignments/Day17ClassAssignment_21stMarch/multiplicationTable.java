package ClassAssignments.Day17ClassAssignment_21stMarch;

import java.util.Scanner;

/**
 *
 * Problem Description
 * For a given number A, print its multiplication table having the first 10 multiples.
 *
 * */
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want to print a multiplication table");
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
