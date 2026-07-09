class Solution {
    public int cherryPickup(int[][] grid) {
        int x=grid.length;
        int y = grid[0].length;
        int[][][][] dp = new int[x][x][y][y];
        for(int [][][] a:dp ){
            for(int[][] b:a){
                for(int[] c:b){
                    Arrays.fill(c,-1);
                }
            }
        }
        return Math.max(0,helper(0,0,0,0,x,y,grid,dp));
    }
    int helper(int i1,int i2,int j1,int j2,int l1,int l2,int[][] grid,int[][][][] dp){
        if(i1>=l1||i2>=l1||j1>=l2||j2>=l2)
          return Integer.MIN_VALUE;

        if(dp[i1][i2][j1][j2]!=-1){
            return dp[i1][i2][j1][j2];
        }
        if(grid[i1][j1]==-1 || grid[i2][j2]==-1){
            return Integer.MIN_VALUE;
        }
        if(i1==l1-1 && i2==l1-1 && j1==l2-1 && j2==l2-1){
          
            return  grid[i1][j1];
          
        }
        int max = Integer.MIN_VALUE;
        int t1 =grid[i1][j1];
        int t2 =grid[i2][j2];
        grid[i1][j1]=0;
        grid[i2][j2]=0;
               max = Math.max(max, helper(i1+1,i2+1,j1,j2,l1,l2,grid,dp));
               max = Math.max(max, helper(i1+1,i2,j1,j2+1,l1,l2,grid,dp));
               max = Math.max(max, helper(i1,i2+1,j1+1,j2,l1,l2,grid,dp));
               max = Math.max(max, helper(i1,i2,j1+1,j2+1,l1,l2,grid,dp));
       
        if(i1==i2&&j1==j2){
            max = t1+max;
        }
        else {
            max = t1+t2+max;
        }
        grid[i1][j1]=t1;
        grid[i2][j2]=t2;
        dp[i1][i2][j1][j2]=max;
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna