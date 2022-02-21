package ClassAssignments.Day1ClassAssignment_14thFeb;

import java.util.Scanner;

/**
 *
 *
 * */
public class VowelOrConstant {
    public static int isvowel(char c){
        if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u'){
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {

        VowelOrConstant vowelOrConstant=new VowelOrConstant();
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a char in console");
        char c= (char) userInput.next().charAt(0);
        int result=isvowel(c);
        System.out.println(result);


    }
}
