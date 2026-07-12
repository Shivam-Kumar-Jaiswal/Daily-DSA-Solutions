class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max=-1000000;
        for(int i=0;i<nums.length;i++){
            if(i<k){
                sum+=nums[i];;
            }
            else{
                max=Math.max(max,sum);
                sum+=(nums[i]-nums[i-k]);
            }
        }
        return Math.max(max,sum)/(double)k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna