class Solution {
    public double myPow(double x, int n) {
        // Handle the edge case where n is Integer.MIN_VALUE
        // We use a long to avoid overflow when converting n to positive
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1.0;
        double currentProduct = x;
        
        while (N > 0) {
            // If N is odd, multiply result by the current product
            if (N % 2 == 1) {
                result *= currentProduct;
            }
            // Square the base and divide the exponent by 2
            currentProduct *= currentProduct;
            N /= 2;
        }
        
        return result;
    }
}
