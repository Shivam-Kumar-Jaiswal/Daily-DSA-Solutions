class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }
        int c=0;
        Queue<Integer> q = new LinkedList<>();
        boolean vis[]= new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){

                q.offer(i);
                vis[i]=true;

                c+=helper(vis,adj,q);
            }
        }
        return c;
    }
    int helper(boolean[] vis,List<Integer>[] adj,Queue<Integer> q){
        List<Integer> list = new ArrayList<>();
        boolean check =true;
        while(!q.isEmpty()){
            int x = q.poll();
            for(int e: list){
                check=check&&adj[x].contains(e);
            }
            list.add(x);
            for(int i=0;i<adj[x].size();i++){
                if(!vis[adj[x].get(i)]){
                    q.offer(adj[x].get(i));
                    vis[adj[x].get(i)]=true;
                }
            }

        }
        if(check)return 1;return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna