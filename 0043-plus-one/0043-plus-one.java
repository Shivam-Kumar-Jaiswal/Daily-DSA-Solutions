class Solution {
    public int[] plusOne(int[] digits) {
        int x = digits.length;
        int org = x;
        int a = digits[x-1];
        int carry=1;
        if(a==9){
        digits[x-1]=0;
        x--;
        }
        while(x>0&&carry==1){
            if(digits[x-1]==9){
                digits[x-1] = 0;
                carry=1;
                x--;
            }else{
                digits[x-1] = digits[x-1]+1;
                carry=0;
            }
        } 
        if(carry==1){
        int ans[] =new int[org+1];
            ans[0]=1;
            for(int i=1;i<=org;i++){
                ans[i]=digits[i-1];
            }
            return ans;
        }
        return digits;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna