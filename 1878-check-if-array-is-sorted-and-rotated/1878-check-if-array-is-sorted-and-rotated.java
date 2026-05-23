class Solution {
    public boolean check(int[] nums) {
        int m=nums.length,c=0;
       for(int i=0;i<m-1;i++){
        if(nums[i]<=nums[i+1])
        continue;
        else if(c==0){
            c=1;
        }
        else
        return false;
       }
       if(c==1){
        return nums[m-1]<=nums[0];
       }
       return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna