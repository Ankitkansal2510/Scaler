package ClassAssignments.Day6ClassAssignment_16thFeb;
/*
* You are given an integer A.

You have to tell how many days are there in the month denoted by A in a non-leap year.
*
* */
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number equivalent to month to find the number of days it contain");
        int month = userInput.nextInt();
        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}