class Solution {
    int r;public boolean isHappy(int n) {
       //1st way 
    int llow=n,fast=n;
       do{
          llow=sum(llow);
          fast=sum(sum(fast));
       }while(fast!=llow);
       return llow==1;

    }
     int sum(int n){
        r=0;
        while(n>0){
            r+=((n%10)*(n%10));
            n/=10;
        }
        return r;
    /*
    HashMap<Integer,Boolean> h = new HashMap<>();
    h.put(n,true);
    while(true){
        int r=0;
        while(n>0){
            r=r+(n%10)*(n%10);
            n/=10;
        }
        if(r==1)
        return true;
        if(h.containsKey(r))
        return false;
        h.put(r,true);
        n=r;

    }*/
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna