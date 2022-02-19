package DayThreeClassASsignment_18thFeb;

import java.util.Scanner;

/*
* For a given number A, print its multiplication table having the first 10 multiples.
* */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number to print its table");
        int a=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
