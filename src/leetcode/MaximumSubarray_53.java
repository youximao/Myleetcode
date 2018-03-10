package leetcode;

import java.util.Scanner;

public class MaximumSubarray_53 {

    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int  max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(max<sum)max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
    public int mm(int [] A){
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];

        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;

    }

    public static void main(String[] args) {
        MaximumSubarray_53 maximumSubarray_53=new MaximumSubarray_53();
        maximumSubarray_53.maxSubArray(new int[]{-2,-1});
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){

        }
    }
}
