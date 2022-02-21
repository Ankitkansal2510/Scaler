package ClassAssignments.Day2ClassAssignment_16thFeb;

import java.util.Scanner;

/**
 * You are given an integer A. You have to tell whether A is divible by both 5 and 11 or not.
 *
 * */
public class Divisbile {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number");
        int a=s.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
