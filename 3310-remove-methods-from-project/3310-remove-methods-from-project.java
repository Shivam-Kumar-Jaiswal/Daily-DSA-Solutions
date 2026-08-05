class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
            list2.add(new ArrayList<>());
        }
        for(int[] e:invocations){
            list.get(e[0]).add(e[1]);
            list2.get(e[1]).add(e[0]);
        }
        List<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(k);
        vis[k]=true;
        ans.add(k);
        while(!q.isEmpty()){
            List<Integer> l= list.get(q.poll());
            for(int i=0;i<l.size();i++){
                if(!vis[l.get(i)]){
                    q.offer(l.get(i));
                    ans.add(l.get(i));
                    vis[l.get(i)]=true;
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            List<Integer> l = list2.get(ans.get(i));
            for(int j=0;j<l.size();j++){
                if(!vis[l.get(j)]){
                    List<Integer> r = new ArrayList<>();
                    for(int a=0;a<n;a++)
                    r.add(a);
                    return r;
                }
            }
        }
        List<Integer> r = new ArrayList<>();
        for(int a=0;a<n;a++){
            if(!vis[a])
            r.add(a);
        }
     return r;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna