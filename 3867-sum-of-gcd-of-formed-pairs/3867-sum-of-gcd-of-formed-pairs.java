class Solution {
    public long gcdSum(int[] nums) {
        long[] max = new long[nums.length];
        long[] prefix = new long[nums.length];
        max[0]=(long)nums[0];
        prefix[0]=gcd(max[0],(long)nums[0]);
        for(int i =1;i<nums.length;i++){
            max[i]=Math.max(max[i-1],(long)nums[i]);
            prefix[i] = gcd(nums[i],max[i]);
        }
        Arrays.sort(prefix);
        int i =0,j=nums.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(prefix[i],prefix[j]);
            i++;
            j--;
        }
        return sum;
    }
    long gcd(long a, long b){
        while(b!=0){
            long t = a % b;
            a=b;
            b=t;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna