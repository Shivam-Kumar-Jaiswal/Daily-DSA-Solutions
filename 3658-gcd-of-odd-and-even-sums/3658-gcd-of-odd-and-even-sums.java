class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);
        int a = sumOdd,b=sumEven;
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;

        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna