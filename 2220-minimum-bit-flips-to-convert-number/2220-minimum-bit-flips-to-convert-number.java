class Solution {
    public int minBitFlips(int start, int goal) {
        start = start^goal;
        goal=1;
        int c=0;
        while(goal<=start){
            if((start&goal)!=0){
                c++;
            }
            goal=goal<<1;
            
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna