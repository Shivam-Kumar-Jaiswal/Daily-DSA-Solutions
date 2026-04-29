class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;        
        int[][] dp= new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }
                else if(i==0&&j==0)
                dp[i][j]=1;
                else if(i==0||j==0){
                    if(i==0)
                    dp[i][j]=dp[i][j-1];
                    else
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    int first=0;
                    int second=0;
                    if(j>0)
                    first=dp[i][j-1];
                    if(i>0)
                    second=dp[i-1][j];
                    dp[i][j]=first+second;
                }
            }
        }
        return dp[m-1][n-1];
    }
}