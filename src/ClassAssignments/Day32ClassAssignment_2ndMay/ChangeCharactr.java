package ClassAssignments.Day32ClassAssignment_2ndMay;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You are given a string A of size N consisting of lowercase alphabets.
 *
 * You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.
 *
 * Find the minimum number of distinct characters in the resulting string.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 100000
 *
 * 0 <= B < N
 *
 *
 *
 * Input Format
 * The first argument is a string A.
 *
 * The second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return an integer denoting the minimum number of distinct characters in the string.
 *
 *
 *
 * Example Input
 * A = "abcabbccd"
 * B = 3
 *
 *
 *
 * Example Output
 * 2
 *
 *
 *
 * Example Explanation
 * We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
 * So the minimum number of distinct character will be 2.
 *
 * **/
public class ChangeCharactr {
    public static void main(String[] args) {
      String  A = "abcabbccd";
       int B = 3;
       int result=minimumChangeCharacter(A,B);
        System.out.println(result);
    }
    private static int minimumChangeCharacter(String A,int B){

        int [] countingArray=new int[26];
        for(int i=0;i<A.length();i++){
            countingArray[A.charAt(i)-97]++;
        }
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < 26; ++i){
            if(countingArray[i] > 0){
                C.add(countingArray[i]);
            }
        }
        Collections.sort(C);
        int ans=C.size();
        for(int i = 0; i < C.size(); ++i){
           if(C.get(i)<=B){
               B-=C.get(i);
               ans--;
           }
        }
        return ans;
    }
    /**
     * Approach
     *
     * First we are creating the counting array and storing all frequency of characters in the array
     *
     *As initially we are taking the size of an array is 26 ,but there can be many indexes which are 0, as in
     * the i/p the corresponding character is not there
     *
     * so we are storing all the character whose frequency >=1 to array list
     *
     * now we are sorting the arraylist in ascending
     *
     * now we will declare the int ans=size of an array list
     * after that we are looping the array list and checking if the value at ith index is <=B
     * then we are subtracting value at ith index from B and then decreementing the ans;
     *
     * one point there will be a case where we exhause of the permissionible operation i.e value of B<0
     * that time we will return the ans
     *
     *
     * i/p
     * abcabbccd
     *
     * counting array
     *
     * a=2
     * b=3
     * c=3
     * d=1
     *
     * after storing it in arraylist and sorting it become
     *
     * 1 ,2,3,3,
     * initially ans=4
     * b=3
     *
     * first iteration b=3 ,ans=4, a.get(i)<=B yes, B=B-1=b=2,ans--,ans=3
     * second iteration b=2, a.get(i)<=b,yes,b=b-2=0,ans--,ans=2
     *
     * third iteration b=0,now we cannot change, so minimum character can be change is 2
     *
     *
     *
     * */
}
