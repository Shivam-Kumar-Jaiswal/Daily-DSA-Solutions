class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n= arr.length,c=0;
        for(int j=0;j<n-1;j++){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                c=1;
            }
        }
        if(c==0)
        break;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna