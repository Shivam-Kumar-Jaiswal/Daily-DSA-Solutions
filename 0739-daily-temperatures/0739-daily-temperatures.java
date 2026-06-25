class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(i>0&&temperatures[i]==temperatures[i-1]){
                arr[i]=Math.max(arr[i-1]-1,0);
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(temperatures[i]<temperatures[j]){
                    arr[i]=j-i;
                    break;
                }
                if(j==n){
                    arr[i]=0;
                }
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna