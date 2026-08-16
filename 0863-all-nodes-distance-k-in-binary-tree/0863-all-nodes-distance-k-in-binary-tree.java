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
        List<Integer> list = new ArrayList<>();
        if(root==null)return list;
        if(k==0)return new ArrayList<>(List.of(target.val));
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        HashMap<TreeNode , Boolean> vis = new HashMap<>();

        helper(root,map);
        vis.put(target,true);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        vis.put(target,true);
        while(!q.isEmpty()){
            int l=q.size();
            k--;
            for(int i=0;i<l;i++){
                TreeNode cur = q.poll();
                if(map.containsKey(cur)&&!vis.containsKey(map.get(cur))){
                    if(k==0)list.add(map.get(cur).val);
                    else{
                        q.offer(map.get(cur));
                        vis.put(map.get(cur),true);
                    }
                }
                if(cur.left!=null&&!vis.containsKey(cur.left)){
                    if(k==0)list.add(cur.left.val);
                    else{
                        q.offer(cur.left);
                        vis.put(cur.left,true);
                    }
                }
                if(cur.right!=null&&!vis.containsKey(cur.right)){
                    if(k==0)list.add(cur.right.val);
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
        if(root==null)return;
        if(root.left!=null){
            map.put(root.left,root);
            helper(root.left,map);
        }
        if(root.right!=null){
            map.put(root.right,root);
            helper(root.right,map);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna