class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int max1=-1;
        int max2=-1;
        for(int i=0;i<n;i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            else if(max2<arr[i] && arr[i]<max1){
                
                max2=arr[i];
            }
        }
        return max2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna