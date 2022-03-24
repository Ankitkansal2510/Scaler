package ClassAssignments.Day17ClassAssignment_21stMarch;

import java.util.Scanner;

/**
 *
 * Given an integer A, you have to tell whether it is a prime number or not.
 *
 * A prime number is a natural number greater than 1 which is divisible only by 1 and itself.
 * */
public class IsItPrime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want to check if it is prime or not");
        int number=sc.nextInt();
        boolean isPrime=isPrime(number);
        boolean isPrime1=isPrimeDifferentLogic(number);
      if(isPrime){
          System.out.println("Number " + number + " is prime");
      }else {
          System.out.println("Number " + number + " is not prime");
      }

        if(isPrime1){
            System.out.println("Number " + number + " is prime");
        }else {
            System.out.println("Number " + number + " is not prime");
        }

    }
    private static boolean isPrime(int number){
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeDifferentLogic(int number){
        //In this logic we can also find the factors of a number
        //Since prime numbers only have 2 factors i.e 1 and a number itself
        int count=0;
        for(int i=1;i*i<=number;i++){
            if(number%i==0){
                if(i*i==number){
                    count+=1;
                }else {
                    count += 2;
                }
            }
        }

        if(count==2){
            return true;
        }else{
            return false;
        }
    }
}

