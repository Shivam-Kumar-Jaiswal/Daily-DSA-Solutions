class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int p = piles.length,c=0;
        int  max=0,l=1,ans;
        for(int e:piles){
            max=Math.max(e,max);
        }
        ans=max;
        while(l<=max){
            int mid=l+(max-l)/2;
            c=0;
            for(int e: piles){
                if(e%mid!=0){
                    c+=e/mid+1;
                }
                else
                    c+=e/mid;
                if(c>h)
                break;
            }
            if(c<=h){
                ans=mid;
                max=mid-1;
            }else
            l=mid+1;
            
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna