package ClassAssignments.Day3ClassASsignment_18thFeb;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("please enter a number");
        int a=s.nextInt();
        int result=0;
        while(a>0){
            result+=a%10;
            a=a/10;
        }
        System.out.println(result);
    }
}
