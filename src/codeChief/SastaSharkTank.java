package codeChief;

import java.util.Scanner;

/****
 * Sasta Shark Tank Problem Code: SST
 * Submit
 * Devendra just had a million-dollar idea and he needs funds to startup. He was recently invited to Sasta Shark Tank (A TV show where entrepreneurs pitch their ideas to investors hoping to get investment in return).
 *
 * He was offered deals from two investors. The first investor offers A dollars for 10% of his company and the second investor offers B dollars for 20% of his company. Devendra will accept the offer from the investor whose valuation of the company is more. Determine which offer will Devendra accept or if both the offers are equally good.
 *
 * For example, if the first investor offers 300 dollars for 10% of the company, then the first investor's valuation of the company is 3000 dollars since 10% of 3000=300. If the second investor offers 500 dollars for 20% of the company, then the second investor's valuation of the company is 2500 dollars since 20% of 2500=500.
 *
 * Input Format
 * The first line contains a single integer T - the number of test cases. Then the test cases follow.
 * The first and only line of each test case contains two integers A and B - the amount offered by first investor for 10% of Devendra's company and the amount offered by second investor for 20% of Devendra's company respectively.
 * Output Format
 * For each test case, Output FIRST if Devendra should accept the first investor's deal, output SECOND if he should accept the second investor's deal, otherwise output ANY if both deals are equally good.
 *
 * You may print each character of the strings in uppercase or lowercase (for example, the strings "FiRst", "First", "FIRST", and "FIrst" will all be treated as identical).
 *
 * Constraints
 * 1≤T≤100
 * 100≤A,B≤10000
 * A and B are multiples of 100
 * Sample Input 1
 * 3
 * 100 200
 * 200 100
 * 200 500
 * Sample Output 1
 * ANY
 * FIRST
 * SECOND
 * Explanation
 * Test case 1: First investor's valuation of Devendra's company was 1000 since 10% of 1000=100 which is the amount he offered for 10% of the company.
 *
 * Second investor's valuation of Devendra's company was also 1000 since 20% of 1000=200 which is the amount he offered for 20% of the company.
 *
 * Therefore he can accept any of the deal.
 *
 * Test case 2: First investor offered a better deal as he valued Devendra's company at 2000 dollars (since 10% of 2000=200) compared to the second investor who valued Devendra's company at 500 dollars (since 20% of 500=100).
 *
 * Test case 3: Second investor offered a better deal as he valued Devendra's company at 2500 dollars compared to the first investor who valued Devendra's company 2000 dollars.
 *
 *
 *
 * **/
public class SastaSharkTank {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of test cases");
        int T=sc.nextInt();
        selectBestoffer(T,sc);
    }
    private static void selectBestoffer(int T,Scanner sc){
        if(T<0 || T==0){
            throw new RuntimeException("Please select atleast one test case");
        }

        for(int i=0;i<T;i++){
            System.out.println("Enter amount offered by first investor");
            int A=sc.nextInt();
            System.out.println("Enter amount offered by second investor");
            int B=sc.nextInt();

            int x=(A*100)/10;
            int y=(B*100)/20;

            if(x>y){
                System.out.println("FIRST");
            }
            else if(y>x){
                System.out.println("SECOND");
            }else{
                System.out.println("ANY");
            }
        }
    }
}
