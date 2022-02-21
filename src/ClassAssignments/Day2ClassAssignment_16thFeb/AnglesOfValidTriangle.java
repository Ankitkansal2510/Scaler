package ClassAssignments.Day2ClassAssignment_16thFeb;
/**
 * You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.
 *
 * A triangle is valid if sum of its angles equals to 180.
 * Print 1 if the triangle having given sides is valid, else print 0
 * */
import java.util.Scanner;

public class AnglesOfValidTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter 1st Angle");
        int a=s.nextInt();
        System.out.println("Please enter 2nd Angle");
        int b=s.nextInt();
        System.out.println("Please enter 3rd Angle");
        int c=s.nextInt();
        int sum=a+b+c;
        if(sum==180){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
