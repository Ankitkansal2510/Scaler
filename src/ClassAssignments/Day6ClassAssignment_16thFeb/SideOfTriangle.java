package ClassAssignments.Day6ClassAssignment_16thFeb;
/*
* Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

You have to print if the traingle is "equilateral", "scalene" or "isosceles
*Explanantion:
* Since all sides are different, hence it's a scalene triangle
* Since all sides are same, hence it's a equilateral triangle.

* */
import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=s.nextInt();
        System.out.println("Enter 2nd number");
        int b=s.nextInt();
        System.out.println("Enter third number");
        int c=s.nextInt();
        if(a!=b && a!=c && b!=c){
            System.out.println("scalene");
        }
        else if(a==b && a==c && b==c){
            System.out.println("equilateral");
        }
        else {
            System.out.println("isosceles");
        }


    }
}
