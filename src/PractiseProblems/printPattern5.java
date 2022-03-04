package PractiseProblems;
/***

 print the below pattern

 0 0 0 0 1 0 0 0 0
 0 0 0 2 3 2 0 0 0
 0 0 3 4 5 4 3 0 0
 0 4 5 6 7 6 5 4 0
 5 6 7 8 9 8 7 6 5

 observation

 There are n rows
 there are n-i "0" to print in beginning
 there are n rows in increment
 there are n-1 in decrement
 there are n-i "0" t print at the end


 *
 * */
import java.util.Scanner;

public class printPattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        printPattern(rows);
    }

    private static void printPattern(int rows){
       /** 0 0 0 0 1 0 0 0 0
        0 0 0 2 3 2 0 0 0
        0 0 3 4 5 4 3 0 0
        0 4 5 6 7 6 5 4 0
        5 6 7 8 9 8 7 6 5**/
      for(int i=1;i<=rows;i++){
          for(int j=1;j<=rows-i;j++){
              System.out.print("0" + " ");
          }
          int val=i;
          for(int k=1;k<=i;k++){
              System.out.print(val + " ");
              val=val+1;
          }
          val=val-2;
          for(int l=1;l<=i-1;l++){
              System.out.print(val + " ");
              val=val-1;
          }
          for(int m=1;m<=rows-i;m++){
              System.out.print("0" + " ");
          }
          System.out.println();
      }
    }
}
