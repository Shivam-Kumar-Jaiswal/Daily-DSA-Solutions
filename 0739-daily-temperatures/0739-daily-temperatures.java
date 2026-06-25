class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
                Stack<Integer> st = new Stack<>();
        //int n = arr.length;
      // stackint
      int[] newarr = new int[n];
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i]){
                newarr[st.peek()]=i-st.pop();
            }st.push(i);
        }
        while(!st.isEmpty()){
            newarr[st.pop()]=0;
        }
        return newarr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna