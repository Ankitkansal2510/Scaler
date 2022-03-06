package ClassAssignments.Day5ClassAssignment_14thFeb;

import java.util.Scanner;

/**
 * You are given the Cost Price C and Selling Price S of a Product.
 * You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.
 *
 * NOTE: It is guaranteed that Cost Price and Selling Price are not equal.
 *
 *
 *First line of the input contains a single integer C.
 *
 * Second line of the input contains a single integer S.
 * */
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        int costPrice=userInput.nextInt();
        int sellingPrince=userInput.nextInt();
        int totalProfitLoss=0;
        if(sellingPrince>costPrice){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
        totalProfitLoss=sellingPrince-costPrice;
        System.out.println(Math.abs(totalProfitLoss));
    }
}
