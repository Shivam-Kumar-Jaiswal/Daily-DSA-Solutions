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
    class Node {
        int ind;
        TreeNode temp;
        Node(TreeNode temp,int c){
            this.ind = c;
            this.temp=temp;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int width =0;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(root,0));
        while(!q.isEmpty()){
            int l= q.size();
            int le=0,ri=0;
            for(int i=0;i<l;i++){
                Node cur = q.poll();
                if(i==0){
                    le = cur.ind;
                }
                if(i==l-1){
                    ri = cur.ind;
                }
                if(cur.temp.left!=null){
                    q.offer(new Node(cur.temp.left,(cur.ind)*2+1));
                }
                if(cur.temp.right!=null){
                    q.offer(new Node(cur.temp.right,(cur.ind)*2+2));
                }
            }
            width = Math.max(width,ri-le+1);
        }
        
        return width;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna