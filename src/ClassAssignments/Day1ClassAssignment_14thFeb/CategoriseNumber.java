package ClassAssignments.Day1ClassAssignment_14thFeb;

import java.util.Scanner;

/**
 *Write a program to input a number(A)
 * from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.
 * **/
public class CategoriseNumber {
    private int categories(int number){
        if(number>0)
        {
            return 1;
        }
        else if(number<0){
            return -1;
        }
        else return 0;
    }
    public static void main(String[] args) {
        CategoriseNumber categoriseNumber=new CategoriseNumber();
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a number in console");
        int number=userInput.nextInt();
        int result=categoriseNumber.categories(number);
        System.out.println(result);
    }
}
