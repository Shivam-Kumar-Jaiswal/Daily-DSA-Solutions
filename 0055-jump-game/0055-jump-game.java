class Solution {
    public boolean canJump(int[] nums) {
        int max=0,i=0,n=nums.length;
        while(i<=max&&i<n){
            max= Math.max(max,i+nums[i]);
            if(max>=n-1)
            return true;
            i++;
        }
        return false;
    }
}