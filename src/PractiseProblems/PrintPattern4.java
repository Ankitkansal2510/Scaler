package PractiseProblems;

import java.util.Scanner;

/***
 * print the below patter:
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1


 observation
 there are n numbre of rows
 at each row there is 1 or 0 , so need to use toggling
 *
 *
 * */
public class PrintPattern4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a row till where you want to print the pattern");
        int rows=sc.nextInt();
        printPattern(rows);
    }

    private static void printPattern(int rows){
        for(int i=1;i<=rows;i++){
            int val=i%2;
            for(int j=1;j<=i;j++){
                System.out.print(val);
                val=1-val;
            }
            System.out.println();
        }
    }
}
