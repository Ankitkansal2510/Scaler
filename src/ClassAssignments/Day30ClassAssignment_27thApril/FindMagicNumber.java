package ClassAssignments.Day30ClassAssignment_27thApril;
/***
 *
 * Given an integer A, find and return the Ath magic number.
 *
 * A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
 *
 * First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 5000
 *
 *
 *
 * Input Format
 * The only argument given is integer A.
 *
 *
 *
 * Output Format
 * Return the Ath magic number.
 *
 *
 *
 * Example Input
 * Example Input 1:
 *
 *  A = 3
 * Example Input 2:
 *
 *  A = 10
 *
 *
 * Example Output
 * Example Output 1:
 *
 *  30
 * Example Output 2:
 *
 *  650
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 *  3rd element in this is 30
 * Explanation 2:
 *
 *  In the sequence shown in explanation 1, 10th element will be 650.
 *
 * **/
public class FindMagicNumber {
    public static void main(String[] args) {
        int A=10;
        int result=findAthMagic(A);
        System.out.println(result);
    }
    private static int findAthMagic(int A){
        int ans = 0;
        int x=1;
       /**
        * Here we will represent number A in the form of binary,and check if last digit is 1 , if it is
        * then we will add the resulti.e x=x*5 to it.
        *
        * A can be represented in binary 0001 , now
        * first iteration A>0 yes , x=x*5 i.e x=1*5=5
        * if(A&1==1) yes so ans=ans+result i.e ans=0+5=5
        * then A>>1
        * similary 10 can be represented as 1010
        * first iteration x=1*5=5
        * if(A&1==1) false
        * now A>>1
        * it become 0101
        * x=5*5=25
        * A&1==1
        * ans=0+25=25
        * A>>1
        * number become 0010
        * x=x*5=25*5=125
        * A&1!=1
        * A>>1 number become 0001
        * x=x*5 i.e 125*5=625
        *a&1==1
        * ans=ans+result i.e 25+625=650 answer , so 10th magic number is 650
        * **/
      while(A>0){
            x=x*5;
          if((A&1)==1){
              ans=ans+x;
          }
          A=A>>1;
      }
        return ans;
    }
}
