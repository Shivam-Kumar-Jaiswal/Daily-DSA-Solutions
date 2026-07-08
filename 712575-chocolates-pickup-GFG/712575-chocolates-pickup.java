class Solution {
    public int maxChocolate(int grid[][]) {
        // code here
        int[] arr = {-1,0,1};
        int l1=grid.length,l2=grid[0].length;
        int[][][] dp = new int[l1][l2][l2];
        for(int[][] a: dp){
            for(int[] b:a){
                Arrays.fill(b,-1);
            }
        }
        return helper(0,0,l2-1,l1,l2,arr,grid,dp);
    }
    int helper(int i, int j, int j1, int l1, int l2, int[] arr, int[][] grid,int[][][] dp){
        
        if(j>=l2 || j1>=l2 || j<0 || j1<0 || j==j1)
        return Integer.MIN_VALUE;
        if(dp[i][j][j1]!=-1)
        return dp[i][j][j1];
        
        if(i==l1-1)
        return grid[i][j]+grid[i][j1];
        
        int max = Integer.MIN_VALUE;
        for(int x = 0; x < 3; x++){
            for(int y = 0;y < 3; y++){
                max = Math.max(max,helper(i+1, j+arr[x], j1+arr[y], l1, l2, arr , grid,dp ));
            }
        }
        dp[i][j][j1] = max+grid[i][j]+grid[i][j1];
        return dp[i][j][j1];
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna