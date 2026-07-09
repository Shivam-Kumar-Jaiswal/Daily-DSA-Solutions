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
    int max = -1;
    public int maxDepth(TreeNode root) {
        if(root == null)
        return 0;
       /* Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int c = 0;
        while(!q.isEmpty()){
            int lev_size = q.size();
            while(lev_size>0){
                TreeNode cur = q.poll();
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
                lev_size--;
            }
            c++;
        }
        return c;*/
        helper(1,root);
        return max;
    }void helper(int c,TreeNode root){
        if(root == null )
        return ;
        max=Math.max(c,max);
        helper(c+1,root.left);
        helper(c+1,root.right);
        return;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna