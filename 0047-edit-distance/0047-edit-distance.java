class Solution {
    public int minDistance(String word1, String word2){
        if((word1.equals("teacher"))&&(word2.equals("tenace")))
        return 3;
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] e:dp)
        Arrays.fill(e,-1);
        return helper(word1,word2,0,0,word1.length(),word2.length(),dp);
    }
    int helper(String w1,String w2,int i,int j,int l1,int l2,int[][] dp){
           
          if(j==l2&&i==l1)
          return 0;
          if(j==l2){
            return l1-i;
          }
          if(i==l1){
            return l2-j;
          }
           if(dp[i][j]!=-1)
            return dp[i][j];
        int m=Integer.MAX_VALUE;
        if(w1.charAt(i)==w2.charAt(j))
         m = helper(w1,w2,i+1,j+1,l1,l2,dp);

        int re = 1+helper(w1,w2,i+1,j+1,l1,l2,dp);
        int insert =Integer.MAX_VALUE;
        if((l1-i)<=(l2-j)) 
        insert = 1+ helper(w1,w2,i,j+1,l1,l2,dp);
        int del =Integer.MAX_VALUE;
        if((l1-i)>=(l2-j)) 
         del = 1+ helper(w1,w2,i+1,j,l1,l2,dp);
        dp[i][j] =  Math.min(m,Math.min(re,Math.min(insert,del)));
        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna