class Solution {
    public int countMinReversals(String s) {
        // code here
        if(s.length()%2!=0)
        return -1;
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '{'){
                stack.push('{');
            }
            if(ch == '}'){
                if(!stack.isEmpty()&&stack.peek()=='{')
                stack.pop();
                else
                stack.push('}');
            }
        }
        StringBuffer sb  = new StringBuffer("");
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        int count = 0;
        for(int i=0;i<sb.length();i++){
            if(i%2==0){
                if(sb.charAt(i)=='}')
                count++;
            }
            else if(i%2!=0){
                if(sb.charAt(i)=='{')
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna