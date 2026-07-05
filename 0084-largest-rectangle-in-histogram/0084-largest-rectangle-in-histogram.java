class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack<Integer> stack = new Stack<>(); int max=Integer.MIN_VALUE,n=heights.length;
       for(int i =0;i<n;i++){
        int min=Integer.MAX_VALUE;
        while(!stack.isEmpty()&&heights[stack.peek()]>heights[i]){
            int val=heights[stack.pop()];
            int last;
            if(stack.isEmpty())
            last=-1;
            else
            last=stack.peek();
            max = Math.max(max,(i-last-1)*val);
        }

        stack.push(i);
       }
       int l=n ;
       while(!stack.isEmpty()){
        int val=heights[stack.pop()];
            int last;
            if(stack.isEmpty())
            last=-1;
            else
            last=stack.peek();
            max = Math.max(max,(l-last-1)*val); 
       }
     
       return max;     
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna