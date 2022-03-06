package ClassAssignments.Day11ClassAssignment_2ndMarch;

import java.util.Scanner;

/**
 *
 * Write a program to input an integer T and then T lines each containing two integers A & B from user and print T lines conatining HCF of two given 2 numbers A and B.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= T <= 1000
 *
 * 1 <= A,B <= 1000000
 *
 *
 *
 * Input Format
 *
 * First line is T which means number of test cases.
 *
 * Each next T lines contain two integers A &B.
 *
 *
 *
 * Output Format
 *
 * T lines each containing an integer representing HCF of A & B.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * 2
 * 15 105
 * 24 36
 *
 *
 * Example Output
 *
 * Output 1:
 *
 * 15
 * 12
 *
 *
 * **/

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test case");
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            System.out.println("Using Euclied algo");
            hcfEucliedALgo(sc);
            System.out.println("Using loop");
            hcfLoop(sc);
        }
    }
    private static void hcfEucliedALgo(Scanner sc){
            System.out.println("Enter the first Number");
            int A=sc.nextInt();
            System.out.println("Enter the second number");
            int B=sc.nextInt();

            System.out.println(findHCFEuclied(A,B));
        }



    private static int findHCFEuclied(int a, int b){
        if(a==0)return b;
        if(b==0)return a;
        if(a==b)return a;
        if(a>b){
            return findHCFEuclied(a-b,b);
        }else{
            return findHCFEuclied(a,b-a);
        }
    }
    private static void hcfLoop(Scanner sc){

            System.out.println("Enter the first Number");
            int A=sc.nextInt();
            System.out.println("Enter the second number");
            int B=sc.nextInt();
            findHCFLoop(A,B);
        }

    private static void findHCFLoop(int a,int b){

        if(a==0) System.out.println(b);
        if(b==0) System.out.println(a);

        int rem=b%a;
        while(rem!=0){
            b=a;
            a=rem;
            rem=b%a;
        }
        System.out.println(a);
    }
}
