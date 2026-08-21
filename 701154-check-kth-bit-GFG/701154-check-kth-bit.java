class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int x = 1<<(k);
        //System.out.print(x);
        if((n&x) == 0) 
        return false;
        else return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna