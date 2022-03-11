package ClassAssignments.Day13ClassAssignment_7thMarch;
/**
 * Problem Description
 *
 * You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
 *
 * Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.
 *
 *
 *
 * Problem Constraints
 *
 * 2 <= N <= 103
 *
 * A[i][j] equals 0 or 1.
 *
 *
 *
 * Input Format
 *
 * First and only argument is an integer matrix A.
 *
 *
 *
 * Output Format
 *
 * Return 1 if A is an identity matrix, else return 0.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  [[1, 0]
 *   [0, 1]]
 * Input 2:
 *
 *  [[0, 0, 1]
 *   [0, 1, 0]
 *   [1, 0, 0]]
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  All the main diagonal elements in A are 1, all other elements are 0.
 *  So, A is an identity matrix.
 * Explanation 2:
 *
 *  All the main diagonal elements in A are not 1, also all other elements are not equal to 0.
 *  So, A is not an identity matrix.
 *
 * **/
public class IdentityMatrix {
    public static void main(String[] args) {

        int A[][] = {{1, 0}, {0, 1}}; //input 1
        int B[][] = {{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
        int result = isIdentity(B);
        System.out.println(result);
    }

    private static int isIdentity(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == j && A[i][j] != 1) {
                    return 0;
                }
                if (i != j && A[i][j] != 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}