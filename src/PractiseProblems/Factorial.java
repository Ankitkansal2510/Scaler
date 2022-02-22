package PractiseProblems;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public  static void fact(Long m) {

    //Biginteger is used to store very big value
        BigInteger b = new BigInteger("1");
        for (int i = 2; i <= m; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        System.out.println(b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of test case you want to execute");
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Enter a number to find  fact");
            Long number=sc.nextLong();
          fact(number);

        }


    }
}
