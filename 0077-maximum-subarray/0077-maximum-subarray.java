class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int prev=nums[0];
        int max=nums[0],s=0;
        for(int i = 1; i < n; i++){
            s=nums[i];
            if(prev>0){
                s+=prev;
            }
            prev=s;
            max=Math.max(max,s);
        }
        return max;
    }
}