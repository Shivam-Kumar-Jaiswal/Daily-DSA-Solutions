class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int x = citations.length;
        for(int i=0;i<x/2;i++){
            int temp=citations[i];
            citations[i]=citations[x-i-1];
            citations[x-1-i]=temp;
        }
        for(int i=x-1;i>=0;i--){
            if(i<citations[i])
            return i+1;
        }
    return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna