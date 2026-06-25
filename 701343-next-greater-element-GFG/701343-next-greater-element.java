class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n,-1));
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
                list.set(st.pop(),arr[i]);
            }st.push(i);
        }
        
        return list;
        //gyj
        //dhgh
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna