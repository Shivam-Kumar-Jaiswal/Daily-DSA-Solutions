class Solution {
    public int maxProfit(int[] prices) {
        int[] arr = new int[prices.length+1];
        int max =0;
        arr[prices.length]=0;
        for(int i=prices.length-1;i>=0;i--){
            max = 0;
            for(int j=i;j<prices.length;j++){
                max=Math.max(max,Math.max(prices[j]-prices[i],(prices[j]-prices[i]+arr[j+1])));
            }
            arr[i]=max;
        }
        return arr[0];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna