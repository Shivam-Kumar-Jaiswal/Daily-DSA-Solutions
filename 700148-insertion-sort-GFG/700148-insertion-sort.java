class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int x= arr.length;
        for(int i=1;i<x;i++){
            int j=i-1;
            int keys=arr[i];
            while(j>=0&&arr[j]>keys){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=keys;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna