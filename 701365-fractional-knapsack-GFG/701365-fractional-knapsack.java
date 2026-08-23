class Solution {
    class Pair{
        int inds;
        double value;
        Pair(int a,double b){
            inds = a;
            value = b;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        PriorityQueue<Pair> p = new PriorityQueue<>((p1,p2)->Double.compare(p2.value, p1.value));

        for(int i=0;i<wt.length;i++){
            p.offer(new Pair(i,val[i]/(double)wt[i]));
        }int i=0;
        double res=0;
        while(p.size()>0){
            Pair x = p.poll();
            i = x.inds;
            if(wt[i]<=capacity){
                res+=val[i];
                capacity-=wt[i];
                i=-1;
            }else break;
        }
        if(i!=-1){
             res += (capacity/(double)wt[i])*val[i];
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna