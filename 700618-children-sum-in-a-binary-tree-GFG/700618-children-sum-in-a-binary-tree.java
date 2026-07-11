/* Node Structure
class Node{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
} */
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if(root==null)return true;
        return isHelper(root);
    }
    boolean isHelper(Node root){
        if(root == null)return true;
        if(root.left==null && root.right == null)
        return true;
        
        boolean a = isHelper(root.left);
        boolean b = isHelper(root.right);
        int le,ri;
        if(root.left == null)
        le = 0;
        else le = root.left.data;
        if(root.right==null)
        ri = 0;
        else ri = root.right.data;
        return a&&b&&root.data==le+ri; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna