package ClassAssignments.Day1ClassAssignment_14thFeb;

import java.util.Scanner;

/**Write a program to input three numbers(A, B & C)
 * from user and print the maximum element among A, B & C in each line.**/
public class MaxOfThree {
    private int max(int firstNumber,int secondNumber,int thirdNumber){
        if(firstNumber>secondNumber && firstNumber>thirdNumber|| (firstNumber==secondNumber && firstNumber>thirdNumber)){
            return firstNumber;
        }
        else if(secondNumber>thirdNumber && secondNumber>thirdNumber|| (secondNumber==firstNumber && secondNumber>thirdNumber)){
            return secondNumber;
        }
        else{
            return thirdNumber;
        }

    }
    public static void main(String[] args) {
        MaxOfThree maxOfThree = new MaxOfThree();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number in console");
        int firstNumber = userInput.nextInt();
        System.out.println("Please enter a number in console");
        int secondNumber = userInput.nextInt();
        System.out.println("Please enter a number in console");
        int thirdNumber = userInput.nextInt();

        System.out.println(maxOfThree.max(firstNumber, secondNumber,thirdNumber));
    }
}