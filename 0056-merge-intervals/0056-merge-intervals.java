class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1)
        return intervals;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] last = {intervals[0][0],intervals[0][1]};
        for(int i=1;i<intervals.length;i++)
        System.out.print(intervals[i][0]+" "+intervals[i][1]+"    ");
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>last[1]){
                list.add(last);
                last = intervals[i];
            }
            else{
                int a = Math.min(intervals[i][0],last[0]);
                int b = Math.max(intervals[i][1],last[1]);
                last[0] = a;
                last[1] = b;
            }
        }
       list.add(last);
        int[][] ans = new int[list.size()][2];
        for(int i = 0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna