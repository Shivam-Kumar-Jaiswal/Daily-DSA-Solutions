class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int l1 = mat.length;
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[l1][3];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        for(int i=0;i<=2;i++){
            max=Math.max(max , helper(0,i,mat,l1,dp));
        }
        return max;
    }
    int helper(int i,int j,int[][] mat,int l1,int[][] dp){
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        if(i==l1-1)
        return mat[i][j];
        
        int max = Integer.MIN_VALUE;
        for(int a = 0; a < 3; a++){
            if(a==j)
            continue;
            max = Math.max( max , helper(i+1,a,mat,l1,dp));
        }
        dp[i][j]=mat[i][j]+max;
        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna