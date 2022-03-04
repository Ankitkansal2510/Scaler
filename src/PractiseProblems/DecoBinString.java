package PractiseProblems;
/****
 * You are given an integer A in decimal (base 10).
 * Return a string denoting the binary (base 2) form of the integer A.
 *
 *
 * The first line of input contains the integer T, denoting the number of test cases.
 * Next T lines contain a single integer A, denoting the integer for that test case.
 *
 */

import java.util.Scanner;
public class DecoBinString {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number of test case");
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            System.out.println("Enter a decimal number");
            int dec=sc.nextInt();
            StringBuilder stringBuilder=new StringBuilder();
            while(dec!=0)
            {
                int rem=dec%2;
                stringBuilder.append(rem);
                dec=dec/2;
            }
        System.out.println(stringBuilder.reverse());
        }

    }

}
