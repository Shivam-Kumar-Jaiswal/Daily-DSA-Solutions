class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int i=0;
        for(i=0;i<n;i++){
            int h=nums[i];
            int s=0;
            if(i>0)
            s=dp[i-1];
            if(i>1)
            h+=dp[i-2];
            dp[i]=Math.max(s,h);
        }
        return dp[i-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna