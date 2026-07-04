class Solution {
    public int sumSubarrayMins(int[] arr) {
        int l = arr.length;
        long mod = (int)Math.pow(10,9)+7;
        int[] next = new int[l];
        Stack<Integer> st = new Stack<>();
        int[] arr1 = new int[l];
        findNext(arr,next,l,st);
        findarr(arr,arr1,l,st);
        long sum =0;
        for(int i=0;i<arr.length;i++){
           long contr = ((next[i]-i)*(i-arr1[i]))%mod;
           contr = (contr*arr[i])%mod;
           sum= (sum+contr)%mod;
        }
        return (int)sum;
    }
    void findNext(int[] arr,int[] next,int l,Stack<Integer> st){
        for(int i=0;i<l;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                next[st.pop()]=i;
            }
            st.push(i);
        }
       
        while(!st.isEmpty()){
            next[st.pop()] = l;
        }

    }
     void findarr(int[] arr,int[] arr1,int l,Stack<Integer> st){
        for(int i=l-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                arr1[st.pop()]=i;
            }
            st.push(i);
        }
       
        while(!st.isEmpty()){
            arr1[st.pop()] = -1;
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna