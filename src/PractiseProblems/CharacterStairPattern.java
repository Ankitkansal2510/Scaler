package PractiseProblems;

import java.util.Scanner;

/**
 * Given an integer N, print the corresponding pattern for N.
 *
 * For example if N = 4 then pattern will be like:
 *
 * A
 * B B
 * C C C
 * D D D D
 *
 *
 * NOTE: There should be no extra spaces after last character or before
 * first character in any row and all characters in any row in the pattern are space separated.
 * */
public class CharacterStairPattern {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter Row number till where you wish to print the pattern");
       int n=s.nextInt();
        print1(n);
    }

    public static void print1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j!=i){
               System.out.print((char)(64+i)+ " ");
                     }
                else{
                    System.out.print((char)(64+i));
                }
        }
            System.out.println();
    }
}}
