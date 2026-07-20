class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n= grid[0].length;
        int[][] gridd = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int b = (j+k)%n;
                int r=(j+k)/n;
                int a=(i+r)%m;
                gridd[a][b]=grid[i][j];                
            }
        }List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<n;j++){
                l.add(gridd[i][j]);
            }
            list.add(l);
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna