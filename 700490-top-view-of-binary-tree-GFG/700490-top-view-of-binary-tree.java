/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    class Pair{
        int c;
        Node temp;
        Pair(int c,Node t){
            this.c=c;
            this.temp=t;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        TreeMap<Integer,Integer> h = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            Pair p = q.poll();
            h.putIfAbsent(p.c,p.temp.data);
            if(p.temp.left!=null){
                q.offer(new Pair(p.c-1,p.temp.left));
            }
            if(p.temp.right!=null){
                q.offer(new Pair(p.c+1,p.temp.right));
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer e : h.values()){
            list.add(e);
        }
        return list;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna