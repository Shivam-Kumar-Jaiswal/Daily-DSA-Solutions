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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null)
        return list;
        helper(root,list,"");
        return list;
    }
    void helper(TreeNode root,List<String> list,String s){
        if(root==null)
        return;
        if(root.left == null && root.right == null){
            s=s+root.val;
            list.add(s);
            return ;
        }
        helper(root.left,list,s+root.val+"->");
        helper(root.right,list,s+root.val+"->");

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna