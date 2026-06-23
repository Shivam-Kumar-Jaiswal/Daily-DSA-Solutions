class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int i = 0,cur=0; cur < nums.length;cur++){
            if(nums[cur]%2==0){
               int temp = nums[i];
               nums[i]=nums[cur];
               nums[cur] = temp;
               i++; 
            }
            
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna