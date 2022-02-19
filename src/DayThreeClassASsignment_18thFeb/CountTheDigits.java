package DayThreeClassASsignment_18thFeb;

import java.util.Scanner;

/***
 * Write a program to input T numbers(N) from user and print count of digits of the given numbers.
 *
 * */
public class CountTheDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number");
        int a=s.nextInt();
        int result=0;
        if(a==0){
            result+=1;
        }
        while(a>0){
            result+=1;
            a=a/10;
        }
        System.out.println(result);
    }
}
