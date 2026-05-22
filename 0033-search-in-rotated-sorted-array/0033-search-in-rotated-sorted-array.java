class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(nums[r]<nums[mid])
                l=mid+1;
            else
                r=mid;
        }
        int extra = l;
        l=0;r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            int real=(mid+extra)%nums.length;
            if(nums[real]==target)
                return real;
            if(nums[real]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna