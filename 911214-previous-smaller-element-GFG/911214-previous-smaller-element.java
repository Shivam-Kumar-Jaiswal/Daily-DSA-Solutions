class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n,-1));
        
        Stack<Integer> stack = new Stack<>();
        stack.push(n-1);
        for(int i=n-2;i>=0;i--){
           while(!stack.isEmpty()&&arr[i]<arr[stack.peek()]){
               list.set(stack.peek(),arr[i]);
               stack.pop();
           }
           stack.push(i);
        }
       
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna