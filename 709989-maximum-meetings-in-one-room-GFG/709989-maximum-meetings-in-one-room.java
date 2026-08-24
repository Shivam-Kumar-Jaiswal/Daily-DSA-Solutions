class Solution {
    class Pair{
        int val,ind;
        Pair(int a,int b){
            val =a;
            ind =b;
        }
    }
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->{
            if(a.val!=b.val)
            return a.val-b.val;
            else
            return a.ind-b.ind;
        });
        for(int i=0;i<s.length;i++){
            q.offer(new Pair(f[i],i));
        }
        int last =-1;
        while(!q.isEmpty()){
            Pair cur = q.poll();
            int i=cur.ind;
            if(s[i]>last){
                list.add(i+1);
                last = f[i];
            }
            
        }
        Collections.sort(list);
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna