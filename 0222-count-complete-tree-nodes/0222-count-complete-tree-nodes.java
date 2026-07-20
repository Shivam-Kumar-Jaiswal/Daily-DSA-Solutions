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
    public int countNodes(TreeNode root) {
        if(root==null)
        return 0;
        int l=heightLeft(root.left);
        int r=heightRight(root.right);
        if(l==r)
        return (1<<(l+1))-1;
        l=countNodes(root.left);
        r=countNodes(root.right);
        return l+r+1;
    }int heightLeft(TreeNode root){
        int c=0;
        while(root!=null){
            root=root.left;
            c++;
        }
        return c;   
    }
    int heightRight(TreeNode root){
        int c=0;
        while(root!=null){
            root=root.right;
            c++;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna