class Solution {
    public int setBit(int n) {
        // code here
        int x=1;
        while((x&n)!=0){
            x=x<<1;
        }
        return n|x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna