class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0,right = nums.length-1,first=-1,last = -1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right = mid-1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        left =0;
        right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return new int[]{first,last};

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna