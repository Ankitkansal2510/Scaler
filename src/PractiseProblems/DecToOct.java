package PractiseProblems;

import java.util.Scanner;

public class DecToOct {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Decimal number you want to convert to Octa");
        int dec=sc.nextInt();
        int oct=0;
        int pow=1;
        while(dec!=0){
            int rem=dec%8;
            oct=oct+rem*pow;
            pow=pow*10;
            dec=dec/8;
        }
        System.out.println(oct);
    }
}
