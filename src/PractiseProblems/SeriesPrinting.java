package PractiseProblems;

import java.util.Scanner;

/***
 * Take the following as input.
 *
 * A number (N1) A number (N2) Write a function which prints first N1 terms of the series 3n + 2
 * which are not multiples of N2.
 *
 * Sample Input:
 * 10 4
 * Sample Output:
 * 5 11 14 17 23 26 29 35 38 41
 * Explanation:
 * The output will've N1 terms which are not divisible by N2.
 * */
public class SeriesPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter 2nd number");
        int secondNumber=sc.nextInt();
        int j=0;
        for(int i=1;i<3*firstNumber+2;i++){
            int sum=3*i+2;
            if(sum%secondNumber!=0){
                System.out.print(sum + " ");
                j++;
            }
            if(j==firstNumber)break;
        }
    }
}
