class Solution {
    public int numSquares(int n) {
        int z = (int)Math.sqrt(n);
        int[] coins= new int[z];
        for(int i=1;i<=z;i++){
            coins[i-1]=(i*i);
        }
        int amount =n;
        int b=Integer.MAX_VALUE;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        for(int e:coins){
            b=Math.min(b,helper(coins,amount,dp));
        }
        if(b==Integer.MAX_VALUE)
        return -1;
        return b;
    }
    public int helper(int [] coins,int amount,int[] dp){
        if(amount<0)
        return Integer.MAX_VALUE;
        if(amount==0){
            dp[0]=0;
            return 0;
        }
        if(dp[amount]!=-1)
        return dp[amount];
        int a=Integer.MAX_VALUE;
        for(int e:coins){
             a=Math.min(a,helper(coins,amount-e,dp));
        }
        if(a==Integer.MAX_VALUE)
        dp[amount]=Integer.MAX_VALUE;
        else
        dp[amount]=a+1;
        return dp[amount];
    }
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna