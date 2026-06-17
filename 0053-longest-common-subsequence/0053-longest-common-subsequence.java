class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int a=text1.length();
        int b=text2.length();
        int[][] dp=new int[a][b];
        for(int[] e:dp)
        Arrays.fill(e,-1);
        return helper(text1,text2,a-1,b-1,dp);
    }
    public int helper(String s1,String s2,int i,int j,int[][] dp){
        if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1)
        return dp[i][j];
        int a=0,b=0;
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j] = 1+helper(s1,s2,i-1,j-1,dp);
        }else{
            a=helper(s1,s2,i-1,j,dp);
            b=helper(s1,s2,i,j-1,dp);
            dp[i][j] = Math.max(a,b);
        }
        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna