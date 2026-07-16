class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] vis = new boolean[isConnected.length];
        int c=0;
        for(int i =0;i<isConnected.length;i++){
            if(!vis[i]){
                c++;
                vis[i]=true;
                helper(isConnected,vis,i);
            }
        }
        return c;
    }
    void helper(int[][] arr,boolean[] vis,int i){
        for(int j=0;j<arr.length;j++){
            if(!vis[j]&&arr[i][j]==1){
                vis[j]=true;
                helper(arr,vis,j);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna