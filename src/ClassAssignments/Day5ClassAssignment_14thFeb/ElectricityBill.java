package ClassAssignments.Day5ClassAssignment_14thFeb;

import java.util.Scanner;

/*
*
* Given an integer A denoting the amount of units of electricity consumed,
*  you have to calculate the electricity bill (in Rs.) with the help of the below charge conditions:

For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.

NOTE: As the electricity bill can have any real value (floating point), you have to tell the floor value of the bill.

Floor value of a floating point is the closest integer less than or equal to that value. For eg, Floor value of 2.91 is 2.
Problem Constraints
1 <= A <= 500

Input Format
First line of the input contains a single integer A.
Output Format
Return an integer denoting the floor value of the Electricity bill.
*
*
* */
public class ElectricityBill {
    private  int bill(int unit){
        double sum=0;
       if(unit<=50){
            sum=unit*0.50;
       }
       else if(unit >50 && unit <=150){
           sum=50*0.50+(unit-50)*0.75;
       }
       else if(unit>150 && unit <=250){
           sum=50*0.50 + 100*0.75+(unit-150)*1.20;
       }
       else if(unit >250){
           sum=50*0.50 + 100*0.75+100*1.20 + (unit-250)*1.50;
       }
       sum=sum+20*sum/100;
       return (int)sum;
    }
    public static void main(String[] args) {
        ElectricityBill electricityBill=new ElectricityBill();
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number in console");
        int units=s.nextInt();
        int result=electricityBill.bill(units);
        System.out.println(result);

    }
}
