class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0,r = 0,n=nums.length;
        int size = 0,max = 0;
        while(r<n){
            if(k>=0 && (k>0||nums[r]==1)){
                if(nums[r]==0)k--;
                r++;

                size = r-l;
            }else{
                if(nums[l]==0)
                k++;
                if(nums[r]==0)k--;
                r++;
                l++;
            }
            max = Math.max(size,max);
            
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna