package PractiseProblems;

import java.util.Scanner;

public class OctToDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Octa number you want to convert to Decimal");
        int oct=sc.nextInt();
        int dec=0;
        int pow=1;
        while(oct!=0){
            int rem=oct%10;
            dec=dec+rem*pow;
            pow=pow*8;
            oct=oct/10;
        }
        System.out.println(dec);
    }
}
