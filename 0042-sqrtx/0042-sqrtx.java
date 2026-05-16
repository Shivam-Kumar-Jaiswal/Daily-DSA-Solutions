class Solution {
    public int mySqrt(int x) {
        int i;
        if(x==1||x==2)
        return 1;
        for( i=1;i<=x/2;i=i+1){
            if(i>x/i)
            break;
        }
        return i-1;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna