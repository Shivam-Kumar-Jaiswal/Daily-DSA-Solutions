class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int n = stalls.length,ans=Integer.MIN_VALUE;
        int max=stalls[n-1]-stalls[0],i=1;
        while(i<=max){
            int mid = i+(max-i)/2;
            int l=stalls[0],c=1;
            for(int j=1;j<n;j++){
                if(stalls[j]-l>=mid){
                    c++;
                    l=stalls[j];
                }
                if(c>=k)
                break;
                
            }
            if(c>=k){
                ans=Math.max(mid,ans);
                i=mid+1;
            }else
            max=mid-1;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna