package ClassAssignments.Day2ClassAssignment_16thFeb;

import java.util.Scanner;

/*
* Write a program to input from user five numbers(A, B, C, D & E) representing marks of student
* in 5 subjects out of 100.
*  You have to calculate percentage and then Grade of each student.
* If percentage >= 90% : Grade A
*If percentage >= 80% : Grade B
*If percentage >= 70% : Grade C
*If percentage >= 60% : Grade D
*If percentage >= 40% : Grade E
* If percentage < 40% : Grade F
* Explanation :
* For Student 1, percentage = (50+60+70+80+90)/5 = 70. Hence grade is C.
* */
public class PercentageGrade {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter marks of first Subject");
        int firstMarks=userInput.nextInt();
        System.out.println("Enter marks of Second Subject");
        int secondMarks=userInput.nextInt();
        System.out.println("Enter marks of Third Subject");
        int thirdMarks=userInput.nextInt();
        System.out.println("Enter marks of fourth Subject");
        int fourthMarks=userInput.nextInt();
        System.out.println("Enter marks of fifth Subject");
        int fifthMarks=userInput.nextInt();
        int percentage=(firstMarks+secondMarks+thirdMarks+fourthMarks+fifthMarks)/5;
        if(percentage>=90){
            System.out.println(percentage + " A");
        }
        else if(percentage>=80){
            System.out.println(percentage + " B");
        }
        else if(percentage>=70){
            System.out.println(percentage + " C");
        }
        else if(percentage>=60){
            System.out.println(percentage + " D");
        }
        else if(percentage>=40){
            System.out.println(percentage + " E");
        }
        else if(percentage<40){
            System.out.println(percentage + " F");
        }
    }
}
