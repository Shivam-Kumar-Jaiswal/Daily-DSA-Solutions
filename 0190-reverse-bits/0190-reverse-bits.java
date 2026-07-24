class Solution {
    public int reverseBits(int n) {
        
        int s=0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0)
            s|= 1<<(31-i);
            

        }
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna