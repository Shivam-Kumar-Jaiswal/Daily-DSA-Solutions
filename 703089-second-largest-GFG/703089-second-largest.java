class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int lar=Integer.MIN_VALUE,sl=Integer.MIN_VALUE,i;
        for(i=0;i<arr.length;i++){
            if(arr[i]>lar){
                sl=lar;
                lar=arr[i];
            }
            else if(arr[i]>sl){
                if(arr[i]!=lar)
                sl = arr[i];
            }
        }
        if(sl==Integer.MIN_VALUE)
        return -1;
        return sl;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna