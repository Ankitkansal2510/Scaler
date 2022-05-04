package codeChief;

import java.util.Scanner;

/**
 *
 * Given an Integer N, write a program to reverse it.
 *
 * Input
 * The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.
 *
 * Output
 * For each test case, display the reverse of the given number N, in a new line.
 *
 * Constraints
 * 1 ≤ T ≤ 1000
 * 1 ≤ N ≤ 1000000
 * Sample Input 1
 * 4
 * 12345
 * 31203
 * 2123
 * 2300
 * Sample Output 1
 * 54321
 * 30213
 * 3212
 * 32
 *
 * */
public class ReverseNumber {
    public static void main(String[] args) {


        int billAmount=1300;
        int percentDiscount=(10*billAmount)/100;
        int flatDiscount=100;
        if(percentDiscount<flatDiscount){
            System.out.println(percentDiscount);
        }
        else{
            System.out.println(flatDiscount);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int T=sc.nextInt();
        reverseNumber(T,sc);


    }

    private static void reverseNumber(int T,Scanner sc){
        for(int i=0;i<T;i++){
            System.out.println("Enter a number to reversed");
            int number=sc.nextInt();
            int reverseNumber=0;
            while(number!=0){
                int rem=number%10;
                reverseNumber=reverseNumber*10+rem;
                number=number/10;

            }
            System.out.println(reverseNumber);
        }
    }
}
