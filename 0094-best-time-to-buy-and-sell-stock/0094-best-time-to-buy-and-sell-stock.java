class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0],min=prices[0],res=0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
                max=prices[i];
            }
            else if(max<prices[i]){
                max=prices[i];
                res=Math.max(max-min,res);
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna