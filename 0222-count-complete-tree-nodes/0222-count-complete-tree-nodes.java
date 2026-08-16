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
        int l=findLeftHeight(root.left);
        int r=findRightHeight(root.right);
        System.out.print(root.val+" LeftHeight :"+l+" RightHeight :"+r);
        if(l==r){
            System.out.print(" l == r"+(2*(1<<l)-2+1));
            return 2*(1<<l)-2+1;
        }
        l = countNodes(root.left);
        r = countNodes(root.right);
        System.out.println(root.val+" "+l+r+1);
        return l+r+1;
       
    }
    int findLeftHeight(TreeNode root){
        if(root==null)
        return 0;
        return findLeftHeight(root.left)+1;
    }
    int findRightHeight(TreeNode root){
        if(root==null)
        return 0;
        return findRightHeight(root.right)+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna