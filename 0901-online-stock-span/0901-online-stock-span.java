class StockSpanner {
    ArrayList<Integer> arr;
    int n=0;
    public StockSpanner() {
        arr= new ArrayList<>();
    }
    
    public int next(int price) {
       arr.add(n,price);
       n++;
       int c=0;
       for(int i=n-1;i>=0;i--){
        if(arr.get(i)>price)
        break;
        c++;
       } 
       return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna