class Solution {
    public boolean isGood(int[] nums) {
        boolean[] dp= new boolean[nums.length+1];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=nums.length)
            return false;

            if(nums[i]==nums.length-1&&c==1){
                dp[nums[i]+1]=true;
                c++;
            }else if(!dp[nums[i]]){
                dp[nums[i]]=true;
                if(nums[i]==nums.length-1)
                c++;
            }
            else return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna