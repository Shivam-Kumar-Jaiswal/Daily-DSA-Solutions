/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    class Pair{
            int r,c;
            Node temp;
            Pair(int c,Node temp){
                this.c = c;
                this.temp = temp;
            }
        }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        Queue<Pair> q = new LinkedList<>();
               q.offer(new Pair(0,root));
               TreeMap<Integer,Integer> map = new TreeMap<>();
               while(!q.isEmpty()){
                   Pair cur = q.poll();
                   map.put(cur.c,cur.temp.data);
                   if(cur.temp.left!=null){
                       q.offer(new Pair(cur.c-1,cur.temp.left));
                   }
                   if(cur.temp.right!=null){
                       q.offer(new Pair(cur.c+1,cur.temp.right));
                   }
               }
               ArrayList<Integer> arr = new ArrayList<>();
               for(Integer i : map.values()){
                   arr.add(i);
               }
               return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna