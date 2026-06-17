class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        StringBuffer sb=new StringBuffer("");
        ArrayList<String> ans=new ArrayList<>();
        boolean[][] vis= new boolean[maze.length][maze[0].length];
        if(maze[0][0]==0)
        return ans;
        vis[0][0]=true;
        helper(maze,0,0,sb,ans,maze.length-1,maze[0].length-1,vis);
        Collections.sort(ans);
        return ans;
        
    }
    public void  helper(int[][] maze,int i,int j,StringBuffer sb,ArrayList<String> ans,int r,int c,boolean[][] vis){
        //base case
        if(i==r&&j==c){
            String res=sb.toString();
            ans.add(res);
            return;
        }
        
        
        if(i<r){
            if(maze[i+1][j]==1&&!vis[i+1][j]){
                sb=sb.append("D");
                vis[i+1][j]=true;
                helper(maze,i+1,j,sb,ans,r,c,vis);
                vis[i+1][j]=false;
                sb=sb.deleteCharAt(sb.length()-1);
            
            }
        }
        if(j>0){
            if(maze[i][j-1]==1&&!vis[i][j-1]){
                sb=sb.append("L");
                vis[i][j-1]=true;
                helper(maze,i,j-1,sb,ans,r,c,vis);
                vis[i][j-1]=false;
                sb=sb.deleteCharAt(sb.length()-1);
            }
        }
        if(j<c){
            if(maze[i][j+1]==1&&!vis[i][j+1]){
            sb=sb.append("R");
            vis[i][j+1]=true;
            helper(maze,i,j+1,sb,ans,r,c,vis);
            vis[i][j+1]=false;
            sb=sb.deleteCharAt(sb.length()-1);
            }
        }
        if(i>0){
            if(maze[i-1][j]==1&&!vis[i-1][j]){
            sb=sb.append("U");
            vis[i-1][j]=true;
            helper(maze,i-1,j,sb,ans,r,c,vis);
            vis[i-1][j]=false;
            sb=sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna