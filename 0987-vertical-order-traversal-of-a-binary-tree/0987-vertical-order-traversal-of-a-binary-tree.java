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
        int r,c;
        TreeNode temp;
        Pair(int c,int r,TreeNode temp){
            this.r = r;
            this.c = c;
            this.temp = temp;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tree = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0,0,root));

        while(!q.isEmpty()){

            Pair p = q.poll();
            int c = p.c;

            tree.putIfAbsent(c,new TreeMap<>());
            TreeMap<Integer, PriorityQueue<Integer>> t = tree.get(c);
            t.putIfAbsent(p.r,new PriorityQueue<>());
            PriorityQueue<Integer> cu = t.get(p.r);
            cu.offer(p.temp.val);
            if(p.temp.left!=null)
            q.offer(new Pair(c-1,p.r+1,p.temp.left));
            if(p.temp.right!=null)
            q.offer(new Pair(c+1,p.r+1,p.temp.right));
        }
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> t: tree.values()){
            List<Integer> li = new ArrayList<>();
            for(PriorityQueue<Integer> p : t.values()){
                while(!p.isEmpty())
                li.add(p.poll());
            }
            list.add(li);
        }return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna