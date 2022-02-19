package DayTwoClassAssignment_16thFeb;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number=s.nextInt();
        int sum=0;
        sum=number*(number+1)/2;
        System.out.println(sum);
    }
}
