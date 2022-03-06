package ClassAssignments.Day6ClassAssignment_16thFeb;

import java.util.Scanner;

/*
* You are given a Bank account having N amount and you are asked to perfrom ADD(credit) and SUBTRACT(debit)
* operations.

After each operation print the amount left in the Bank account. If the debit amount is
*  greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.
* First line contains a single integer N denoting the balance in bank account.
Second line contains a single integer M denoting the number of operations.
Each of next M lines contains two space separated integers Type and Amount(X).
If Type == 1, Perform ADD operation.
If Type == 2, Perform SUBTRACT operation.
* */
public class BankAccount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a amount in an account");
        int amount=s.nextInt();
        System.out.println("Please enter a number of operation you want to do");
        int numberOfOperation=s.nextInt();
        for(int i=0;i<numberOfOperation;i++){
            System.out.println("Please enter a Type (1 for Add , 2 for Subtract from amount");
            int Type=s.nextInt();
            System.out.println("Enter a balance or you want to add/subtract from amount");
            int balance=s.nextInt();
            if(Type==1){
                amount+=balance;
                System.out.println(amount);
            }
            else if(Type==2){
                if((amount-balance)<0){
                    System.out.println("Insufficient Funds");
                }
                else{
                    amount-=balance;
                    System.out.println(amount);
                }
            }
        }


    }
}
