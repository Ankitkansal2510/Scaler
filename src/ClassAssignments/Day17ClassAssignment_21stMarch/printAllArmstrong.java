package ClassAssignments.Day17ClassAssignment_21stMarch;

import java.util.Scanner;

/**
 * You are given an integer N you need to print all the Armstrong Numbers between 1 to N.
 *
 * If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
 *
 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
 *
 * */
public class printAllArmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number till where you want to find out all the armstrong number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            int result=0;
            int Number=i;
            while(Number>0){
                int digit=Number%10;
                result+=Math.pow(digit,3);
                Number=Number/10;
            }
            if(result==i){
                System.out.println(result);
            }
        }
    }
}
