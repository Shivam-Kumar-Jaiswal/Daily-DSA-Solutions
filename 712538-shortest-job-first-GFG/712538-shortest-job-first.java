class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int cur = 0,a=0;
        for(int i=0;i<bt.length;i++){
           a += cur - 0;
           cur = cur+bt[i];
        }
        return a/bt.length;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna