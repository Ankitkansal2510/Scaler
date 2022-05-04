package ClassAssignments.Day29ClassAssignment_25thApril;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/****
 * There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.
 * This is one of those problems.
 * Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105
 *
 * Food for thought :
 *
 * Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
 * For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
 * Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
 * Obviously approach 1 is more susceptible to overflows.
 * You are given a read only array of n integers from 1 to n.
 *
 * Each integer appears exactly once except A which appears twice and B which is missing.
 *
 * Return A and B.
 *
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Note that in your output A should precede B.
 *
 * Example:
 *
 * Input:[3 1 2 5 3]
 *
 * Output:[3, 4]
 *
 * A = 3, B = 4
 *
 *
 * */
public class RepeatAndMissingNumber {
    public static void main(String[] args) {
        int A[]={1,1};
        int [] result=repeatAndMissingNumber(A);
        System.out.println(Arrays.toString(result));
    }

    private static int[] repeatAndMissingNumber(int A[]){
        HashSet <Integer> ans = new HashSet <>();
        int repeatingNum = 0;
        for(int i=0;i<A.length;i++){
            if(!ans.add(A[i])){
// If the number does not get added to the hashset, then it is the repeating number
                repeatingNum = A[i];
            }
        }
        int missingNum = 0;
// Iterating over the length of the array (1 to N) to find the missing number.
        for(int i=1 ;i<=A.length;i++){
            if(!ans.contains(i)){
                missingNum = i;
            }
        }
        return new int [] {repeatingNum,missingNum};
    }
}
