class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int last = intervals[0][1];
        int count = 0;
        
        for(int i=1;i<intervals.length;i++){
            if(last<=intervals[i][0]){
                last = intervals[i][1];
            }else{
                count++;
            }
        }
        
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna