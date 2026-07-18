/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(k==0)
        return new ArrayList<>(List.of(target.val));
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        HashMap<TreeNode,Boolean> vis = new HashMap<>();
        helper(root,map);
        q.offer(target);
        vis.put(target,true);
        while(!q.isEmpty()){
            int l=q.size();
            k--;
            
            for(int i=0;i<l;i++){
                TreeNode cur = q.poll();
                TreeNode p=map.get(cur);
                if(!vis.containsKey(p)&&p!=null){
                    if(k==0)
                    list.add(p.val);
                    else{
                        q.offer(p);
                        vis.put(p,true);
                    }
                }
                if(!vis.containsKey(cur.left)&&cur.left!=null){
                    if(k==0)
                    list.add(cur.left.val);
                    else{
                        q.offer(cur.left);
                        vis.put(cur.left,true);
                    }
                }
                if(!vis.containsKey(cur.right)&&cur.right!=null){
                    if(k==0){
                        list.add(cur.right.val);
                    }
                    else{
                        q.offer(cur.right);
                        vis.put(cur.right,true);
                    }
                }
            }
        }
        return list;
    }
    void helper(TreeNode root,HashMap<TreeNode,TreeNode> map){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur=q.poll();
            if(cur.left!=null){
                map.put(cur.left,cur);
                q.offer(cur.left);
            }
            if(cur.right!=null){
                map.put(cur.right,cur);
                q.offer(cur.right);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna