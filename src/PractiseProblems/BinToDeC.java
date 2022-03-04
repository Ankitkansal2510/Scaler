package PractiseProblems;

import java.util.Scanner;

public class BinToDeC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number you want to convert to Dec from bin");
        long bin=sc.nextLong();
        long dec=0;
        long pow=1;
        while(bin!=0){
            long rem=bin%10;
            dec=dec+rem*pow;
            pow=pow*2;
            bin=bin/10;
        }
        System.out.println(dec);
    }
}
