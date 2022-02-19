package Day1ClassAssignment_14thFeb;

import java.util.Scanner;

public class MinOfThree {
    private int min(int firstNumber,int secondNumber,int thirdNumber){
        if(firstNumber<secondNumber && firstNumber<thirdNumber|| (firstNumber==secondNumber && firstNumber<thirdNumber)){
            return firstNumber;
        }
        else if(secondNumber<thirdNumber && secondNumber<thirdNumber|| (secondNumber==firstNumber && secondNumber<thirdNumber)){
            return secondNumber;
        }
        else{
            return thirdNumber;
        }

    }
    public static void main(String[] args) {
        MinOfThree minOfThree = new MinOfThree();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number in console");
        int firstNumber = userInput.nextInt();
        System.out.println("Please enter a number in console");
        int secondNumber = userInput.nextInt();
        System.out.println("Please enter a number in console");
        int thirdNumber = userInput.nextInt();

        System.out.println(minOfThree.min(firstNumber, secondNumber,thirdNumber));
    }
}
