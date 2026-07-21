class Solution {
    class Pair{
        int val,dis;
        Pair(int val,int dis){
            this.val = val;
            this.dis = dis;
        }
    }
    public int shortestPath(int V, int[][] edges, int src, int dest) {
        // code here
       
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u = e[0];
            int v = e[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        boolean[] vis = new boolean[V];
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(src,0));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            int d =cur.dis;
            int v=cur.val;
            if(v==dest)
            return d;
            List<Integer> l = list.get(v);
            for(int i=0;i<l.size();i++){
                if(!vis[l.get(i)]){
                    vis[l.get(i)]=true;
                    q.offer(new Pair(l.get(i),d+1));
                }
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna