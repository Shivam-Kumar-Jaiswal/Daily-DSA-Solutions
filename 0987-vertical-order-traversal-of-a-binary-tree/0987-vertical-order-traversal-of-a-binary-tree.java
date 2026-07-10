/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        int r;
        int c;
        TreeNode temp;
        Pair(int r,int c, TreeNode t){
            this.r = r;
            this.c =c;
            this.temp = t;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0,0,root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            map.putIfAbsent(cur.c,new TreeMap<>());
            map.get(cur.c).putIfAbsent(cur.r,new PriorityQueue<>());
            map.get(cur.c).get(cur.r).add(cur.temp.val);
            if(cur.temp.left!=null){
                q.offer(new Pair(cur.r+1,cur.c-1,cur.temp.left));
            }
            if(cur.temp.right!=null){
                q.offer(new Pair(cur.r+1,cur.c+1,cur.temp.right));
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> t : map.values()){
            List<Integer> list = new ArrayList<>();

            for(PriorityQueue<Integer> q1: t.values()){
                while(!q1.isEmpty()){
                    list.add(q1.poll());
                }
            }
            l.add(list);
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna