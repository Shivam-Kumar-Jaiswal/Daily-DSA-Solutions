class Solution {
    public String removeOuterParentheses(String s) {
        ArrayDeque<Character> q = new ArrayDeque<>();
        int op=0,cl=0;
        StringBuffer sb = new StringBuffer();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                q.offer('(');
                op++;
            }
            else if(ch==')'){
                q.offer(')');
                cl++;
                if(op==cl){
                    
                        q.removeFirst();
                        q.removeLast();
               
                    while(!q.isEmpty()){
                        sb.append(q.removeFirst());
                    }
                }   
            }
            if(q.isEmpty())
            {
                op=0;cl=0;
            }
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna