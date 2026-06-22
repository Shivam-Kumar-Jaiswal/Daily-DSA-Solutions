class Solution {
    public int countOdds(int low, int high) {
        int ans = (high-low+1);
         if(ans%2==1){
            if(low%2==0)
            return ans/2;
            else return ans/2+1;
        }else{
            return ans/2;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna