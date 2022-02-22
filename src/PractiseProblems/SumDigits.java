package PractiseProblems;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of test case you want to run");
        int numberOfTestCase=s.nextInt();
        for(int i=0;i<numberOfTestCase;i++){
            int sum=0;
            System.out.println("Enter a number you want to sum");
            int number=s.nextInt();
            while(number>0){
                sum+=(number%10);
                number/=10;
            }
            System.out.println(sum);
        }
    }
}
