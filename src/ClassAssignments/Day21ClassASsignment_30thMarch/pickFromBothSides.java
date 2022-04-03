package ClassAssignments.Day21ClassASsignment_30thMarch;
/**
 * Problem Description
 *
 * You are given an integer array A of size N.
 *
 * You can pick B elements from either left or right end of array A to get the maximum sum.
 *
 * Find and return this maximum possible sum.
 *
 * NOTE: Suppose B = 4, and array A contains 10 elements, then
 *
 * You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 105
 *
 * 1 <= B <= N
 *
 * -103 <= A[i] <= 103
 *
 *
 *
 * Input Format
 *
 * First argument is an integer array A.
 *
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 *
 * Return an integer denoting the maximum possible sum of elements you picked.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [5, -2, 3 , 1, 2]
 *  B = 3
 * Input 2:
 *
 *  A = [1, 2]
 *  B = 1
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  8
 * Output 2:
 *
 *  2
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
 * Explanation 2:
 *
 *  Pick element 2 from end as this is the maximum we can get
 *
 *
 * **/
public class pickFromBothSides {

    public static void main(String[] args) {
        int A[]={ -584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645, 185, -947, -88, -192, 832, -55,
                -687, 756, -679, 558, 646, 982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, -708, -561, 253, -976,
                -846, 510, -255, -351, 186, -687, -526, -978, -832, -982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874,
                -628, -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985, 102, -520, 213, 627, -198, -901, -473, -375,
                543, 924, 23, 972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587, -26, -730, 170,
                -765, -167, 711, 760, -104, -333};//{5,-2,3,1,2};
        int B=32;
        int result=findMaxSum(A,B);
        System.out.println(result);
    }
    private static int findMaxSum(int A[],int B){
/**
 *
 * left         right       sum
 * 5,-2,3                    6
 * 5,-2          2           5
 * 5             1,2         8
 *               1,2,3        6
 *
 * first we find the sum of starting 3 elements
 *
 * then we subtract the one element from left from the sum and then add one element from the right
 * to the sum
 *
 * **/
        int sum=0;
        int n= A.length;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        int result=sum;
        int leftPointer=B-1;
        int rightPointer=n-1;
           while(leftPointer>=0){
               sum-=A[leftPointer];
               sum+=A[rightPointer];
               leftPointer--;
               rightPointer--;
               result =Math.max(result,sum);
           }


        return result;

    }
}
