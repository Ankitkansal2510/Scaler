package PractiseProblems;
/***
 *
 *You are given an integer N you need to print all the Armstrong Numbers between 1 to N.
 *
 * If sum of cubes of each digit of the number is equal to the number itself,
 * then the number is called an Armstrong number.
 *
 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
 */

import java.util.Scanner;
public class ArmsTrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number till where you want to get the Armstrong numbe");
        int number=s.nextInt();
       isArmstrong(number);
    }
    private static void isArmstrong(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            int dup = i;
            sum=0;
            while (dup > 0) {
                sum += Math.pow((dup % 10), 3);
                dup = dup / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
