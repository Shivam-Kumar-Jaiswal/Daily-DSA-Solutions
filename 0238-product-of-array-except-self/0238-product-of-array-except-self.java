class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length-1;
        int[] prefix = new int[l+1];
        int[] suffix = new int[l+1];
        for(int i = 0; i<nums.length; i++){
            if(i==0){
                prefix[i]=nums[i];  //[1,2,6,24]
                suffix[l]=nums[l]; //[24,24,12,4]
            }
            else{
                prefix[i]=prefix[i-1]*nums[i];
                suffix[l-i] = suffix[l-i+1]*nums[l-i];
            }
        }


        for(int i=0;i<nums.length;i++){
            if(i==0)
            nums[i]=suffix[1];
            else if(i==l)
            nums[l]=prefix[l-1];
            else
            nums[i]=suffix[i+1]*prefix[i-1];
        }
        return nums;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna