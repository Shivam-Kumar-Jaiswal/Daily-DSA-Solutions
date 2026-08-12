/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val; 
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>(); 
        if(root==null)
        return list;
        
        list.add(root.data);
        if(root.left==null && root.right==null)
        return list;
        helper(root.left,list);
        helper2(root,list);
        helper3(root.right,list);
        return list;
        
    }
    void helper(Node root,ArrayList<Integer> list){
        
        if(root==null)
        return;
        if(root.left==null && root.right == null)
        return;
        list.add(root.data);
        if(root.left!=null){
            helper(root.left,list);
        }
        else if(root.right!=null){
            helper(root.right,list);
        }
        
    }
    void helper2(Node root,ArrayList<Integer> list){
        if(root.left==null && root.right == null)
        list.add(root.data);
        if(root.left!=null)
        helper2(root.left,list);
        if(root.right!=null)
        helper2(root.right,list);
    }
    void helper3(Node root,ArrayList<Integer> list){
        if(root==null)return;
        if(root.left==null && root.right == null)
        return;
        if(root.right!=null)
        helper3(root.right,list);
        else if(root.left!=null)
        helper3(root.left,list);
        list.add(root.data);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna