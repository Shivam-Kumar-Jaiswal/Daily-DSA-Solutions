class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(i>0){
                res+=nums[i-1];        
            }
            if(res*2==(sum-nums[i])){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna