package PractiseProblems;

import java.util.Scanner;

/*
You are given an integer N you need to print all the Prime Numbers between 1 and N.

Prime numbers are numbers that have only 2 factors: 1 and themselves.
For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
* **/
public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number till where you want to find the prime numbers");
        int N=s.nextInt();
       // testPrime(12);r
        printPrime(N);
        System.out.println("Printing prime in more optimised way");
        printPrimeOptimised(N);
    }
private static void testPrime(int a){
        boolean isPrime=false;
        for(int i=2;i<a;i++){
            if(a%i==0){
                isPrime=false;
                break;
            }
            else {
                isPrime = true;
            }
        }
    if(isPrime){
        System.out.println("Prime");
    }else{
        System.out.println("Not a prime");}
}
    private static void printPrime(int a){
        boolean isPrime=true;
        for(int i=2;i<=a;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
                else{
                    isPrime=true;
                }
            }if(isPrime) {
                System.out.println(i);
            }
        }

    }

    private static void printPrimeOptimised(int a){
        boolean isPrime=true;
        for(int i=2;i<=a;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
                else{
                    isPrime=true;
                }
            }if(isPrime) {
                System.out.println(i);
            }
        }

    }
}
