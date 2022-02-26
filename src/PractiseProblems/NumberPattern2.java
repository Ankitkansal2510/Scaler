package PractiseProblems;

import java.util.Scanner;

/**
  print the below pattern
        *
      * * *
    * * * * *

 Observeation for the above pattern:

 1. there are n
 2. Each row has n-i spaces
 3. Each row has 2i-1 "*" to be printed
 *
 *
 * **/
public class NumberPattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a total rows to print");
        int numberOfRows = sc.nextInt();
        printPattern(numberOfRows);
    }

    private static void printPattern(int rows) {

        for (int i = 1; i <= rows; i++) {//looping till number of rows
            //printing the space as per the requirement
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            //printing the * i.e at every row there are 2*i-1 stars getting printed
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}