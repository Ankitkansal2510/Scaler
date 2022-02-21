package PractiseProblems;

import java.util.Scanner;

//Need to find the GCD of two numbers
//We will use two approach 1. using Euclied theoram 2. using remainder method
public class GCD {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=s.nextInt();
        System.out.println("Enter second number");
        int b=s.nextInt();
        int result=EucliedGCD(a,b);
        System.out.println("GCD of two number using Euclied algo: " + result);
        int result1=RemainderGCD(a,b);
        System.out.println("GCD of Two number using remainder algo: " + result1);
    }

    private static int EucliedGCD(int a, int b){
        if (a==0)return b;
        if(b==0)return a;
        if(a==b)return a;
        if(a>b){
            return EucliedGCD(a-b,b);
        }
        else{
            return EucliedGCD(a,b-a);
        }
    }

    private static int RemainderGCD(int a,int b){
       if(a==0)return b;
       if(b==0)return a;

        int rem=b%a;
        while(rem!=0){
            b=a;
            a=rem;
            rem=b%a;
        }

        return a;
    }
}
