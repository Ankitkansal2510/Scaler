package ClassAssignments.Day6ClassAssignment_16thFeb;

import java.util.Scanner;

/*
* You are given a positive integer A. You have to print the sum of all odd numbers in the range [1, A].
* */
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=s.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
