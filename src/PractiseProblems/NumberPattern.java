package PractiseProblems;

import java.util.Scanner;

/***
 * Given an integer N, print the corresponding pattern for N.
 *
 * For example if N = 4 then pattern will be like:
 *
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 *
 * make sure there will be no leading and trailing space
 * */
public class NumberPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter Row number till where you wish to print the pattern");
        int n=s.nextInt();
       printNumberPatter(n);
    }

    private static void printNumberPatter(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
