package ClassAssignments.Day11ClassAssignment_2ndMarch;
/**
 * Write a function that takes to positive integers A and B and returns their LCM.
 *
 */

import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        int result=lcmApproach(a,b);
        System.out.println("LCM Using first approach: " + result);
        System.out.println();
        System.out.println("LCM using second Approach : " + lcmSecondApproach(a,b));
    }
    private static int lcmApproach(int a,int b){
        /**
         * 1. we will take variable LCM and assing a initiall value to the largest of the two number
         * because LCM of two number cannot be smaller than the largest of the two number;
         *
         * 2.in the while infinte loop we will check if LCM%a==0 and LCM%b==0, if it is then we find the LCM otherwise
         * we will increement the LCM varaible by 1.
         *
         * This approach is less efficient
         *
         * **/
       int LCM=a>b?a:b;

       while(true){
           if(LCM%a==0 && LCM%b==0){
               return LCM;

           }
           LCM++;
       }

    }

    private static int lcmSecondApproach(int a,int b){
        /*
        * we can use the formula a*b=LCM(a,b)*GCD(a,b);
        *
        * lcm(a,b)=a*b/GCD(a,b);
        *This approach is more efficient
        * */

        int gcd=findGCD(a,b);
        int lcm=(a*b)/gcd;
        return lcm;

    }
    private static int findGCD(int a,int b){
        if(a==0)return b;
        if(b==0)return a;
        if(a==b)return a;
        if(a>b){
           return findGCD(a-b,b);
        }
        else{
           return findGCD(a,b-a);
        }
    }
}
