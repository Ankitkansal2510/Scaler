package PractiseProblems;

import java.util.Scanner;

/****

  print the below pattern

        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4

 Observations
 1. There are N number of rows
 2. Each row has n-i spaces in starting
 3.Total values to be printed is equal to 2i-1
 4.At each row value printed im increasing order is equal to the number of rows and then decreasing value is printed
 equal to rows -1
 */

public class NumberPattern3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a row number till you want to print the pattern");
        int numberOfRows=sc.nextInt();
        printPatternTechnique1(numberOfRows);
        System.out.println();
        printPatterTechnique2(numberOfRows);
    }
    private static void printPatternTechnique1(int rows){
        for(int i=1;i<=rows;i++){ //printing equal to the number of rows
            for(int j=1;j<=rows-i;j++){ //printing rows-i spaces
                System.out.print(" ");
            }
            //printing the value equal to 2i-1
            int value=i;
            for(int k=1;k<=2*i-1;k++){
                if(k<=i){
                    System.out.print(value);
                    value++;
                }
                else{
                    value-=2;
                    System.out.print(value++);
                }
            }
            System.out.println();
        }
    }
private static void printPatterTechnique2(int rows){
        //Total number of rows=rows
        //there are n-i spaces
       //we have number which are increasing order equal to i
        //we have number which are decreasing order equal to i-1

    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }
        int value=i;
        for(int k=1;k<=i;k++){
            System.out.print(value);
            value++;
        }
        value-=2;
        for(int l=1;l<=i-1;l++){
            System.out.print(value);
            value-=1;
        }
        System.out.println();
    }
}
}
