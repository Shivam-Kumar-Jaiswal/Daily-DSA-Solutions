class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        /*while(n>1 && n%2 == 0){
            n=n/2;
        }
        return n==1;*/
//        int x=1;
        while((n&1)!=1){
            n=n>>1;
        }
        if(n==1)return true;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna