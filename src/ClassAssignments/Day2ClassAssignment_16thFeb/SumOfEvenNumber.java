package ClassAssignments.Day2ClassAssignment_16thFeb;

import java.util.Scanner;

/*
* You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.

Even numbers are those numbers that are divisible by 2.
*
* */
public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number till where you need to calculate sum of even numbers");
        int number=s.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
