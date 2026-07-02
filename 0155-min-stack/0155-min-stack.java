class MinStack{
    class Pair{
        int first;
        int second;
        Pair(int f,int s){
            first = f;
            second = s;
        }
    }
    
    List<Pair> arr;
    int min;
    int top;
    public MinStack() {
        arr = new ArrayList<>();
        min=Integer.MAX_VALUE;
        top=-1;
    }
    
    public void push(int value) {
        min=Math.min(value,min);
        arr.add(new Pair(value,min));
        top++;
    }
    
    public void pop() {
        arr.removeLast();
        top--;
        if(top==-1)
        min=Integer.MAX_VALUE;
        else
        min=arr.get(top).second;
    }
    
    public int top() {
        return arr.get(top).first;
    }
    
    public int getMin() {
        return arr.get(top).second;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna