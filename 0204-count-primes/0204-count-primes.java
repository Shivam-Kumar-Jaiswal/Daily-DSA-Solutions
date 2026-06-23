class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1) return 0;

     
        boolean[] arr= new boolean[n+1];
    int cnt =0;
        for(int i=2;i<n;i++){
            if(arr[i]){
                continue;
            }
            cnt++;
            makeTrue(i,arr,n);
        }
        return cnt;
    }
        public void makeTrue(int i,boolean[] arr,int n){
            int j=i;
            for(;j<=n;j=j+i){
                arr[j]=true;
            }
            
        }

  
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna