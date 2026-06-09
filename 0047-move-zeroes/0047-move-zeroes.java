class Solution {
    public void moveZeroes(int[] nums) {
        int prev = 0,cur = 0;
        for(cur=0;cur<nums.length;cur++){
            if(nums[cur]!=0){
                int temp = nums[prev];
                nums[prev]=nums[cur];
                nums[cur]=temp;
                prev++;

            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna