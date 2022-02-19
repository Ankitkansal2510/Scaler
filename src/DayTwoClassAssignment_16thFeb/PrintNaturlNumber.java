package DayTwoClassAssignment_16thFeb;
/**
 *
 * Write a program to print all Natural numbers from 1 to N where you have to take N as input from user**/
import java.util.Scanner;

public class PrintNaturlNumber {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number=userInput.nextInt();
        for(int i=1;i<=number;i++){
            System.out.print(i + " ");
        }
    }
}
