class Solution {
    public int uniquePaths(int m, int n) {
       int[][] dp=new int[m][n];
       for(int[] x:dp)
       Arrays.fill(x,-1);
       dp[0][0]=1;
       return helper(m-1,n-1,dp); 
    }
    int helper(int i,int j,int[][] dp){
        if(dp[i][j]!=-1)
        return dp[i][j];
        int left=0;
        int right=0;
        if(i>0){
             left=helper(i-1,j,dp);
        }
        if(j>0){
             right=helper(i,j-1,dp);
        }
        dp[i][j]=left+right;
        return left+right;
    }
}