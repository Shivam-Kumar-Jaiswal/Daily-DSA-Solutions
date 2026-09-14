class Solution {
    public boolean check(int[] nums) {
        int change = -1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                change =i;
                break;
            }
        }
        if(change == -1)return true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[(i+change+1)%nums.length]>nums[(i+change+2)%nums.length])
            return false;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna