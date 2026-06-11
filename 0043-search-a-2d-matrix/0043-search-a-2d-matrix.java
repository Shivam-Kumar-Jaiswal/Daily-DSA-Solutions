class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        int l=0;int h=m*n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int r =mid/n;
            int c= mid%n;
            if(target==matrix[r][c])
            return true;
            else if(target>matrix[r][c])
            l=mid+1;
            else 
            h=mid-1;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna