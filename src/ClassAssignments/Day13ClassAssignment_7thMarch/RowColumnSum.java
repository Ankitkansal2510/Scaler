package ClassAssignments.Day13ClassAssignment_7thMarch;
/**
 * You are given a matrix A, you have to return a vector containing sum of each row elements
 * followed by each column elements of the matrix .
 *
 * NOTE: In the resultant vector of integers there will be rows+columns elements
 * where ans[i] is the sum of ith row elements and ans[rows+j] is the sum of jth column.
 *
 *
 * */
public class RowColumnSum {
    public static void main(String[] args) {

        //int arr[][] = {{1, 2}, {4, 5}, {8, 9}};
        int arr[][] = {{96, 99}};
        int rows=arr.length;
        int cols=arr[0].length;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j <cols; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum + " ");

        }

        for(int i=0;i<cols;i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }
            System.out.print(sum +" ");

        }
    }


}
