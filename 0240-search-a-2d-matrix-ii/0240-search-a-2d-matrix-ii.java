class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        return helper(0,0,matrix,m,n,target);
    }
    boolean helper(int i,int j,int[][] matrix,int m,int n,int target){
        if(i==m-1&&j==n-1)
        return target==matrix[i][j];

        if(matrix[i][j]==target){
            return true;
        }
        else if(matrix[i][j]>target)
        return false;
        if(i==m-1)
        return helper(i,j+1,matrix,m,n,target);
        else if(j==n-1)
        return helper(i+1,j,matrix,m,n,target);
        else{
            if(matrix[i][j+1]>matrix[i+1][j]){
               return helper(i,j+1,matrix,m,n,target)||helper(i+1,j,matrix,m,n,target);
            }else
                return helper(i+1,j,matrix,m,n,target)||helper(i,j+1,matrix,m,n,target);
       }
       }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna