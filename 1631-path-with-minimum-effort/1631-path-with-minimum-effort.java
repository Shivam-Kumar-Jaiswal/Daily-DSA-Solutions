class Solution {
    class Pair{
        int i,j,w;
        Pair(int i,int j,int w){
            this.i = i;
            this.j = j;
            this.w = w;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int l1=heights.length;
        int l2=heights[0].length;
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->Integer.compare(a.w,b.w));
        int[][] dist = new int[l1][l2];
        for(int[] x:dist){
            Arrays.fill(x,Integer.MAX_VALUE);
        }
        q.offer(new Pair(0,0,0));
        int[] di={0,0,-1,1};
        int[] dj={-1,1,0,0};
        while(!q.isEmpty()){
            Pair p = q.poll();
            int i=p.i;
            int j=p.j;
            int dis=p.w;
            if(i==l1-1&&j==l2-1)
            return dis;
            for(int a=0;a<4;a++){
                int x=i+di[a];
                int y=j+dj[a];

               
                if(x>=0&&y>=0&&x<l1&&y<l2){
                     int d = Math.max(dis,Math.abs(heights[i][j]-heights[x][y]));
                     if(d<dist[x][y]){
                        dist[x][y]=d;
                        q.offer(new Pair(x,y,d));
                     }
                }
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna