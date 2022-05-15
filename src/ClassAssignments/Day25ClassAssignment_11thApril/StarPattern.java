package ClassAssignments.Day25ClassAssignment_11thApril;
/***
 * Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.
 *
 * See example for clarifications over the pattern.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 1000
 *
 *
 *
 * Input Format
 *
 * First line is an integer N
 *
 *
 *
 * Output Format
 *
 * N lines conatining only char '*' as per the question.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * 4
 * Input 2:
 *
 * 6
 *
 *
 * Example Output
 *
 * Output 1:
 *
 * ********
 * ***  ***
 * **    **
 * *      *
 * *      *
 * **    **
 * ***  ***
 * ********
 * Output 2:
 *
 * ************
 * *****  *****
 * ****    ****
 * ***      ***
 * **        **
 * *          *
 * *          *
 * **        **
 * ***      ***
 * ****    ****
 * *****  *****
 * ************
 * */
public class StarPattern {
    public static void main(String[] args) {
        int N=6;
        //observations
        //1.total number of rows is equal  to n*2
        //total columns is also N*2
        //first rows has all 8 columns
        //subsequent rows has
        int rows=N;
        int colums=N*2;
        int newColumns=colums;
        int beforespace=2;
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                if(i==0) {
                    System.out.print("*");
                }else{
                        if(j<beforespace || j>=colums-beforespace) {
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                }
            }
            newColumns=newColumns-2;
            beforespace=newColumns/2;
            System.out.println();
        }

        //printing reverse
         newColumns=colums;
         int preStar=colums-newColumns+1;
         int postStar=preStar;
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                if(i==rows-1) {
                    System.out.print("*");
                }else{
                    if(j<preStar || postStar==newColumns-preStar) {
                        System.out.print("*");

                    }else{
                        System.out.print(" ");
                        postStar++;
                    }
                }

            }
            newColumns=newColumns-1;
            preStar=preStar+1;
            postStar=1;
            System.out.println();
        }
    }
}
