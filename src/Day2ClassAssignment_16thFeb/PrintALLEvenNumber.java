package Day2ClassAssignment_16thFeb;

import java.util.Scanner;

public class PrintALLEvenNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=s.nextInt();
        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
