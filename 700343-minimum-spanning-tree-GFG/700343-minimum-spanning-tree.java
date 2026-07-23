class Solution {
    class Pair{
        int val,dis;
        Pair(int val,int dis){
            this.val = val;
            this.dis = dis;
        }
    }
    public int spanningTree(int V, int[][] edges) {
        // code here
        List<List<Pair>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            list.get(u).add(new Pair(v,e[2]));
            list.get(v).add(new Pair(u,e[2]));
        }
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->Integer.compare(a.dis,b.dis));
        boolean[] vis = new boolean[V];
        q.offer(new Pair(0,0));
        int d=0;
        while(!q.isEmpty()){
            Pair cur = q.poll();
            int v=cur.val;
            if(vis[v])continue;
            vis[v]=true;
            d+=cur.dis;
            List<Pair> l = list.get(v);
            for(int i=0;i<l.size();i++){
                Pair next=l.get(i);
                if(!vis[next.val]){
                    q.offer(next);
                }
            }
        }
        return d;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna