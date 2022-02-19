package DayOneClassAssignment_14thFeb;

import java.util.Scanner;

public class EvenOdd {
    private String eveOdd(int number){
        if(number%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public static void main(String[] args) {
        EvenOdd evenOdd=new EvenOdd();
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a number in console");
        int number=userInput.nextInt();
        String result=evenOdd.eveOdd(number);
        System.out.println(result);
    }
}
