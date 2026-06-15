class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int x=val.length;
        int[][] dp = new int[x][W+1];
        for(int[] d : dp)
        Arrays.fill(d,-1);
        return helper(x-1,W,val,wt,dp);
    }
    public static int helper(int index,int weight,int[] val,int[] wt,int[][] dp){
        if(index==0){
            if(weight>=wt[0]){
                dp[0][weight]=val[0];
                return val[0];
            }
            dp[index][weight]=0;
            return 0;
        }
        if(dp[index][weight]!=-1)
        return dp[index][weight];
        int pick=Integer.MIN_VALUE;
        if(wt[index]<=weight)
        pick=val[index]+helper(index-1,weight-wt[index],val,wt,dp);
        int notPick = helper(index-1,weight,val,wt,dp);
        dp[index][weight] = Math.max(pick,notPick);
        return dp[index][weight];
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna