class Solution {
            Stack<Integer> st = new Stack<>();

    public int maximalRectangle(char[][] matrix) {
        int x=matrix.length;
        int y=matrix[0].length;
        int[][] mat = new int[x][y];
        for(int j=0;j<y;j++){
            int counts = 0;
            for(int i=0;i<x;i++){
                if(matrix[i][j]=='1'){
                    mat[i][j]=counts+1;
                    counts+=1;
                }
                else{
                    counts = 0;
                    mat[i][j]=0;
                }
            }
        }
        for(int i =0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    
        int max=Integer.MIN_VALUE;
        for(int i=0;i<x;i++){
            st.clear();
            int[] prevSmaller = new int[y];
            st.clear();
            int[] nextSmaller = new int[y];
            helper(mat[i],y,nextSmaller);
            helperTwo(mat[i],y,prevSmaller);
            max=Math.max(max,res(mat[i],nextSmaller,prevSmaller,y));
        }
        return max;
    }
    int res(int[] arr,int[] nextSmaller,int[] prevSmaller,int x){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<x;i++){
            
            max=Math.max(max,arr[i]*(nextSmaller[i]-prevSmaller[i]-1));
        }
        return max;
    }
    void helper(int[] arr,int x,int[] nextSmaller){ 
        for(int i=0;i<x;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                nextSmaller[st.pop()]=i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nextSmaller[st.pop()]=x;
        }
    }
    void helperTwo(int[] arr,int x,int[] prevSmaller){
        for(int i=x-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                prevSmaller[st.pop()]=i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            prevSmaller[st.pop()]=-1;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna