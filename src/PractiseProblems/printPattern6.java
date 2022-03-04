package PractiseProblems;

import java.util.Scanner;

public class printPattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            if(i==1){
                for(int j=1;j<=rows;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int k=1;k<=rows-i+1;k++){

                }
            }
        }
    }
}
