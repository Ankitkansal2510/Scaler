package ClassAssignments.Day7ClassASsignment_18thFeb;

import java.util.Scanner;

/***Given an integer A, determine whether it is palindromic or not.

 A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed.
 For e.g., reverse(123) = 321.*/
public class PalindromNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please a number");
        int a=s.nextInt();
        int actualNumber=a;
        int result=0;
        while(a>0){
            result=result*10+(a%10);
            a=a/10;
        }
        System.out.println(result);
        if(result==actualNumber){
            System.out.println("palindrom");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
