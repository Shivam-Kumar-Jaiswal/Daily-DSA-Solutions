class Solution {
    class Pair{
        int i,dist,step;
        Pair(int i,int dist,int step){
            this.i = i;
            this.dist = dist;
            this.step = step;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] x:flights){
            list.get(x[0]).add(new Pair(x[1],x[2],1));
        }
        int[] d = new int[n];
        Arrays.fill(d,Integer.MAX_VALUE);
        PriorityQueue<Pair> p = new PriorityQueue<>((a,b)->Integer.compare(a.dist,b.dist));
        p.offer(new  Pair(src,0,0));
        int min=Integer.MAX_VALUE;
        int[][] arr = new int[n][2];
        for(int x=0;x<n;x++){
            arr[x][0]=Integer.MAX_VALUE;
            arr[x][1]=n+1;
        }
        while(!p.isEmpty()){
            Pair cur = p.poll();
            int x=cur.i;
            int dis = cur.dist;
            int st = cur.step;

            
            List<Pair> l = list.get(x);

            for(int j=0;j<l.size();j++){
                if(st<=k&&(arr[l.get(j).i][0]>dis+l.get(j).dist||arr[l.get(j).i][1]>st+1)){
                    if(l.get(j).i==dst){
                        min=Math.min(min,dis+l.get(j).dist);
                    }
                    arr[l.get(j).i][0]=dis+l.get(j).dist;
                    arr[l.get(j).i][1]=st+1;
                    p.offer(new Pair(l.get(j).i,dis+l.get(j).dist,st+1));
                }
            }
        }
        if(min==Integer.MAX_VALUE)
        return -1;
        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna