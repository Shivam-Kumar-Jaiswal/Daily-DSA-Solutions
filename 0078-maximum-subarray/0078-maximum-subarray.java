class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[] dp = new int[n];
        dp[0]=nums[0];
        int max=nums[0],s=0;
        for(int i = 1; i < n; i++){
            s=nums[i];
            if(dp[i-1]>0){
                s+=dp[i-1];
            }
            dp[i]=s;
            max=Math.max(max,s);
        }
        return max;
    }
}