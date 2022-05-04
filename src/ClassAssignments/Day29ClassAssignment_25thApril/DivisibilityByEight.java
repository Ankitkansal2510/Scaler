package ClassAssignments.Day29ClassAssignment_25thApril;
/**
 *
 * Problem Description
 * You are given a number A in the form of a string. Check if the number is divisible by eight or not.
 *
 * Return 1 if it is divisible by eight else, return 0.
 *
 *
 * Problem Constraints
 * 1 <= length of the String <= 100000
 * '0' <= A[i] <= '9'
 *
 *
 * Input Format
 * The only argument given is a string A.
 *
 *
 * Output Format
 * Return 1 if it is divisible by eight else return 0.
 *
 *
 * Example Input
 * Input 1:
 * A = "16"
 * Input 2:
 *
 * A = "123"
 *
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 *
 * 0
 *
 *
 * Example Explanation
 * Explanation 1:
 *  16 = 8 * 2
 * Explanation 2:
 *
 * 123 = 15 * 8 + 3
 *
 * */
public class DivisibilityByEight {
    public static void main(String[] args) {
        String s="16";
        int result=checkDivisibility(s);
        System.out.println(result);

        int betterResult=divisiblebyEight(s);
        System.out.println(betterResult);
    }
private static int divisiblebyEight(String A){
    int n = A.length();
    if (n == 1){
        if((A.charAt(0) - '0') % 8 == 0){
            return 1;
        }
        return 0;
    }
    if (n == 2) {
        //A.charAt(0) will return string 1 whose ascii value is 49, and ascii value of '0' is 48
        //so 49-48*10 will give 10, like this, and we know if last 3 digit is divisbile by 3 then the number is /
        //divisbile by 8
        int x = (A.charAt(0) - '0') * 10 + A.charAt(1) - '0';
        if(x % 8 == 0){
            return 1;
        }
        return 0;
    }
    int a3 = (A.charAt(n-3) - '0') * 100 + (A.charAt(n-2) - '0') * 10 + (A.charAt(n-1) - '0');
    if(a3 % 8 == 0){
        return 1;
    }
    return 0;

}
    private static int checkDivisibility(String s){

        StringBuilder stringBuilder = new StringBuilder(s);
        String newString=stringBuilder.reverse().toString();
        stringBuilder=new StringBuilder();
        for(int i=0;i<newString.length();i++){
            if(i==3){
                break;
            }
            stringBuilder.append(newString.charAt(i));
        }
        int number = Integer.parseInt(stringBuilder.reverse().toString());
        if (number % 8 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
