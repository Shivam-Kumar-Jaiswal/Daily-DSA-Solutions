class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        int V=numCourses;
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        int[] indegrees = new int[V];
        for(int[] e:prerequisites){
            int v=e[0];
            indegrees[v]++;
            int u=e[1];
            list.get(u).add(v);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegrees[i]==0)
            q.offer(i);
        }
        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){
            int a = q.poll();
            ans.add(a);
            List<Integer> l = list.get(a);
            for(int e:l){
                indegrees[e]--;
                if(indegrees[e]==0)
                q.offer(e);
            }
        }
                return ans.size()==V;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna