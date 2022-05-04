package ClassAssignments.Day23ClassAssignment_6thApril;
/**
 * Problem Description
 * Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 1e6
 * -1000 <= A[i] <= 1000
 *
 *
 *
 * Input Format
 * The first and the only argument contains an integer array, A.
 *
 *
 *
 * Output Format
 * Return an integer representing the maximum possible sum of the contiguous subarray.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4, -10]
 * Input 2:
 *
 *  A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 *
 *
 * Example Output
 * Output 1:
 *
 *  10
 * Output 2:
 *
 *  6
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
 * Explanation 2:
 *
 *  The subarray [4,-1,2,1] has the maximum possible sum of 6.
 * */
public class MaxSumSubArray {
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum=findMaxSumSubarrayNormal(arr);//TC=O(N^3)
        System.out.println(maxSum);

        int maxSumPS=findMaxSumSubarrayPrefixSum(arr);//TC=O(N^2)
        System.out.println(maxSumPS);

        int maxSumCS=findMaxSumSubarrayCarrySum(arr); //TC=O(N^2)
        System.out.println(maxSumCS);

        int KedansAlgoAns=findMaxSumKedansAlgo(arr); //TC=O(N)
        System.out.println(KedansAlgoAns);
    }

    private static int  findMaxSumKedansAlgo(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            max_sum=Math.max(curr_sum,max_sum);
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_sum;
    }
    private static int findMaxSumSubarrayCarrySum(int[] arr) {
        int ans=Integer.MIN_VALUE;

        for(int s=0;s<arr.length;s++){
            int sum=0;
            for(int e=s;e<arr.length;e++){
                sum+=arr[e];
                ans=Math.max(sum,ans);
            }

        }
        return ans;
    }

    private static int findMaxSumSubarrayPrefixSum(int[] arr) {
        int ps[]=new int[arr.length];
        ps[0]=arr[0];
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            ps[i]=arr[i]+ps[i-1];
        }

        for(int s=0;s<arr.length;s++){
            for(int e=s;e<arr.length;e++){
                int sum=0;
                if(s==0){
                    sum=ps[e];
                }else{
                    sum=ps[e]-ps[s-1];
                }
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }

    private static int findMaxSumSubarrayNormal(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int s=0;s<arr.length;s++){
            for(int e=s;e<arr.length;e++){
               int sum=sum(arr,s,e);
               maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }

    private static int sum(int arr[],int s,int e){
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
