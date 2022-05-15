package ClassAssignments.Day25ClassAssignment_11thApril;
/**
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
 *
 *
 * Input Format
 *
 * The only argument given is string A.
 * Output Format
 *
 * Return the length of the longest consecutive 1’s that can be achieved.
 * Constraints
 *
 * 1 <= length of string <= 1000000
 * A contains only characters 0 and 1.
 * For Example
 *
 * Input 1:
 *     A = "111000"
 * Output 1:
 *     3
 *
 * Input 2:
 *     A = "111011101"
 * Output 2:
 *     7
 *
 * ***/
public class LengthlongestConsecutiveOnes {
    public static void main(String[] args) {
        String A="1111";
      //  String A="111011101";  another input
        int result=solve(A);
        System.out.println(result);
    }
    private static int solve(String A){
       int ans=0;
       int countOne=0;
        for(int i=0;i<A.length();i++){
            countOne+=A.charAt(i)-'0';
        }
       for(int i=0;i<A.length();i++){
           if(A.charAt(i)=='0'){
               int left=0;
               int right=0;
               for(int j=i-1;j>=0;j--){
                   if(A.charAt(j)=='1'){
                       left++;
                   }
                   else{
                       break;
                   }
               }

               for(int j=i+1;j<A.length();j++){
                   if(A.charAt(j)=='1'){
                       right++;
                   }else{
                       break;
                   }
               }
               if(countOne==left+right){
                   ans=Math.max(ans,left+right);
               }else {
                   ans = Math.max(ans, left + right + 1);
               }
           }
       }
       if(ans==0){
           return A.length();
       }
       return ans;
    }
}
