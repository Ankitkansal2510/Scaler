package ClassAssignments.Day6ClassAssignment_16thFeb;

import java.util.Scanner;

public class NaturalNumberReverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=s.nextInt();
        for(int i=number;i>0;i--){
            System.out.print(i + " ");
        }
    }
}
