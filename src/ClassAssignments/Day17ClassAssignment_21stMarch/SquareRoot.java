package ClassAssignments.Day17ClassAssignment_21stMarch;

import java.util.Scanner;

/**
 *
 * Problem Description
 *
 * Given a number A. Return square root of the number if it is perfect square otherwise return -1.
 *
 *
 * */
public class SquareRoot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number you want to find out a perfect square");
        int number=sc.nextInt();
        int result=findSquare(number);
      if(result>0){
          System.out.println("Square  root of a number " + number + " is: " + result);
      }else{
          System.out.println("Square root of a number " + number + " does not exist hence printing: " + result);
      }
    }

    private static int findSquare(int number){
        for(long i=1;i<=number;i++){
            if(i*i==number){
                return (int)i;
            }
        }
        return -1;
    }
}
