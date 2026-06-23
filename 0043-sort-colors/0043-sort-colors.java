class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1,cur;
        
            while(i<nums.length&&nums[i]==0)
            i++;
            while(j>=0&&nums[j]==2)
            j--;
            cur=i;
            while(cur<nums.length&&cur<=j&&i<=j){
                if(nums[i]==0){
                    i++;
                    if(cur<i)
                    cur=i;
                }
                else if(nums[j]==2)
                j--;
                else if(nums[cur]==2){
                    nums[cur]=nums[j];
                    nums[j]=2;
                    j--;
                }
                else if(nums[cur]==0){
                    nums[cur]=1;
                    nums[i]=0;
                    i++;
                }
                else if(nums[cur]==1)
                cur++;
            }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna