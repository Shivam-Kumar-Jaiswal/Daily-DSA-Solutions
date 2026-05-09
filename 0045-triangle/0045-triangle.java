class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int x = triangle.size();
        int[] dp = new int[x];   
        for(int i=0;i<x;i++){
            dp[i]=triangle.get(x-1).get(i);
        }
        for(int i=x-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[j]=Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}