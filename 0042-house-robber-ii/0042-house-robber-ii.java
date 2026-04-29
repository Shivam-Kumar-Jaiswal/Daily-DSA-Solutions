class Solution {
    public int rob(int[] nums) {
        int m=nums.length,max1=0,max2=0;
        if(m==1)return nums[0];
        int[] dp=new int[m];
        for(int i=0;i<m-1;i++){
            int first = 0;
            if(i>0)
            first=dp[i-1];
            
            int second=nums[i];
            if(i>1)
            second+=dp[i-2];
            max1=Math.max(first,second);  
            dp[i]=max1;
        }
        dp[0]=0;
        for(int i=1;i<m;i++){
            int first = 0;
            if(i>0)
            first=dp[i-1];
            
            int second=nums[i];
            if(i>1)
            second+=dp[i-2];
            max2=Math.max(first,second);  
            dp[i]=max2;
        }
    return Math.max(max1,max2);
    }
}