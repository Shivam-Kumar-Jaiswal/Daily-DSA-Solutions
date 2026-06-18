// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int dup = n;int c=0;
        while(dup>0){
            dup/=10;
            c++;
        }
        dup=n;int a=0;int sum=0;
        while(n>0){
            a=n%10;
            sum+=Math.pow(a,c);
            n=n/10;
        }
        return dup==sum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna