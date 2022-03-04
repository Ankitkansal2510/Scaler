package PractiseProblems;
import java.util.Scanner;
//Convert decimal to binary
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a decimal number to conver to binary");
        int dec=sc.nextInt();
        int bin=0;
        int pow=1;
        while(dec!=0){
            int rem=dec%2;
            bin=bin+pow*rem;
            pow=pow*10;
            dec=dec/2;
        }
        System.out.println(bin);

    }
}
