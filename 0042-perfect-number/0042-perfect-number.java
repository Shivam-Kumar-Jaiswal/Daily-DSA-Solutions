class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
        return false;
        int dup=num,sum=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return dup==sum+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna