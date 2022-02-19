package DayOneClassAssignment_14thFeb;

import java.util.Scanner;

public class minTwo {
    private int min(int firstNumber,int secondNumber){
        if(firstNumber<secondNumber){
            return firstNumber;
        }
        else{
            return secondNumber;
        }
    }

    public static void main(String arg[]){
        minTwo minOfTwo=new minTwo();
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a number in console");
        int firstNumber=userInput.nextInt();
        System.out.println("Please enter a number in console");
        int secondNumber=userInput.nextInt();

        System.out.println(minOfTwo.min(firstNumber,secondNumber));
    }
}
