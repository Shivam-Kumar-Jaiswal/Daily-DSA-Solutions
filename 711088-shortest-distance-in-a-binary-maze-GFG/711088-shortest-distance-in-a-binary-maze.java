class Solution {
    class Pair{
        int i,j,step;
        Pair(int i,int j,int step){
            this.i = i;
            this.j = j;
            this.step = step;

        }
    }
    public int shortestPath(int[][] mat, int[] src, int[] dest) {
        int m=mat.length;
        int n = mat[0].length;
        if(mat[src[0]][src[1]]==0||mat[dest[0]][dest[1]]==0)
            return -1;
            
        if(src[0]==dest[0]&&dest[1]==src[1])
            return 0;
            
        Queue<Pair> q = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];
        q.offer(new Pair(src[0],src[1],0));
        int[] di = {0,0,-1,1};
        int[] dj = {1,-1,0,0};
        while(!q.isEmpty()){
            Pair p = q.poll();
            int i=p.i;
            int j=p.j;
            int step = p.step;
            
            for(int a=0;a<4;a++){
                int x=i+di[a];
                int y=j+dj[a];
                if(x>=0&&x<m&&y>=0&&y<n&&!vis[x][y]&&mat[x][y]==1){
                    if(x==dest[0]&&y==dest[1])
                    return step+1;
                    q.offer(new Pair(x,y,step+1));
                    vis[x][y]=true;
                }
            }
        }
       return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna