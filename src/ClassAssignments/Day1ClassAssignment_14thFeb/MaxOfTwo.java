package ClassAssignments.Day1ClassAssignment_14thFeb;

import java.util.Scanner;

/**
 * Write a program to input two numbers(A & B)
 * from user and print the maximum element among A & B in each line.
 *
 *
 * **/
public class MaxOfTwo {

    private int max(int firstNumber,int secondNumber)
    {

        if(firstNumber>secondNumber){
            return firstNumber;
        }
        else{
            return secondNumber;
        }
    }
    public static void main(String arg[]){
        MaxOfTwo maxOfTwo=new MaxOfTwo();
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a number in console");
        int firstNumber=userInput.nextInt();
        int secondNumber=userInput.nextInt();

        System.out.println(maxOfTwo.max(firstNumber,secondNumber));
    }
}
