class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,max = 0,l=nums.length;
        while(j<nums.length){
            if(k>=0&&nums[j]==1){
                j++;
            }else if(k>=0){
                j++;
                k--;
            }else{
                if(nums[i]==0){
                    k++;
                }
                if(nums[j]==0){
                    k--;
                }
                j++;
                i++;

            }
            if(k>=0)
            max=Math.max(max,j-i);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna