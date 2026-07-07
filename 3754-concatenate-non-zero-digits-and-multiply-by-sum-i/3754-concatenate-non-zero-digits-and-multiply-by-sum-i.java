class Solution {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        long sum =0;
        long ans =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                int ch = s.charAt(i)-'0';
                ans = 10*ans+ch;
                sum+=ch;
            }
        }
        return sum*ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna